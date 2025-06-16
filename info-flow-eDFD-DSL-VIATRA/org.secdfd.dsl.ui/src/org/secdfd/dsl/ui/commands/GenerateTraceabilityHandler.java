// File: org/secdfd/dsl/ui/commands/GenerateTraceabilityHandler.java
package org.secdfd.dsl.ui.commands;

import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;

import org.secdfd.model.EDFD;

import traceability.TraceabilityFactory;
import traceability.EDFDToGraph;

import graph.Graph;
import graph.GraphFactory;

public class GenerateTraceabilityHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IEditorPart editor = HandlerUtil.getActiveEditor(event);
        if (!(editor.getEditorInput() instanceof IFileEditorInput input)) {
            MessageDialog.openError(HandlerUtil.getActiveShell(event), "Error", "Active editor is not a file.");
            return null;
        }

        IFile secdfdFile = input.getFile();
        IPath folder = secdfdFile.getParent().getFullPath();
        String baseName = secdfdFile.getFullPath().removeFileExtension().lastSegment();

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("graph", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("traceability", new XMIResourceFactoryImpl());

        URI secdfdURI = URI.createPlatformResourceURI(secdfdFile.getFullPath().toString(), true);
        Resource secdfdResource = resourceSet.getResource(secdfdURI, true);

        if (secdfdResource.getContents().isEmpty()) {
            MessageDialog.openError(HandlerUtil.getActiveShell(event), "Error", "The .secdfd file is empty.");
            return null;
        }

        EObject root = secdfdResource.getContents().get(0);
        if (!(root instanceof EDFD edfd)) {
            MessageDialog.openError(HandlerUtil.getActiveShell(event), "Error", "Root object is not of type EDFD.");
            return null;
        }

        Graph graph = GraphFactory.eINSTANCE.createGraph();
        Resource graphResource = resourceSet.createResource(
                URI.createPlatformResourceURI(folder.append(baseName + ".graph").toString(), true));
        graphResource.getContents().add(graph);

        EDFDToGraph traceModel = TraceabilityFactory.eINSTANCE.createEDFDToGraph();
        traceModel.setEdfds(edfd);
        traceModel.setGraphs(graph);

        Resource traceResource = resourceSet.createResource(
                URI.createPlatformResourceURI(folder.append(baseName + ".traceability").toString(), true));
        traceResource.getContents().add(traceModel);

        try {
            graphResource.save(Collections.emptyMap());
            traceResource.save(Collections.emptyMap());
            MessageDialog.openInformation(HandlerUtil.getActiveShell(event), "Done", "Traceability and Graph files generated.");
        } catch (Exception e) {
            throw new ExecutionException("Failed to save generated files", e);
        }

        return null;
    }
}
