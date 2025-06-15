/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Traceability/model/traceability.ecore
 * using:
 *   /Traceability/model/traceability.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package traceability;

import graph.GraphPackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.secdfd.model.ModelPackage;
// import traceability.TraceabilityPackage;
// import traceability.TraceabilityTables;

/**
 * TraceabilityTables provides the dispatch tables for the traceability for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class TraceabilityTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TraceabilityPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_graph = IdManager.getNsURIPackageId("http://www.example.org/graph", null, GraphPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_traceability = IdManager.getNsURIPackageId("http://www.example.org/traceability", null, TraceabilityPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_secdfd_org_s_secdfd = IdManager.getNsURIPackageId("http://www.secdfd.org/secdfd", null, ModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_EDFD = TraceabilityTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("EDFD", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EDFDGraphTrace = TraceabilityTables.PACKid_http_c_s_s_www_example_org_s_traceability.getClassId("EDFDGraphTrace", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EDFDToGraph = TraceabilityTables.PACKid_http_c_s_s_www_example_org_s_traceability.getClassId("EDFDToGraph", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Graph = TraceabilityTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("Graph", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_GraphEndToEndTrace = TraceabilityTables.PACKid_http_c_s_s_www_example_org_s_traceability.getClassId("GraphEndToEndTrace", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Identifiable = TraceabilityTables.PACKid_http_c_s_s_www_example_org_s_graph.getClassId("Identifiable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NamedEntity = TraceabilityTables.PACKid_http_c_s_s_www_secdfd_org_s_secdfd.getClassId("NamedEntity", 0);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EDFDGraphTrace = TypeId.ORDERED_SET.getSpecializedId(TraceabilityTables.CLSSid_EDFDGraphTrace, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_GraphEndToEndTrace = TypeId.ORDERED_SET.getSpecializedId(TraceabilityTables.CLSSid_GraphEndToEndTrace, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Identifiable = TypeId.ORDERED_SET.getSpecializedId(TraceabilityTables.CLSSid_Identifiable, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_NamedEntity = TypeId.ORDERED_SET.getSpecializedId(TraceabilityTables.CLSSid_NamedEntity, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			TraceabilityTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _EDFDGraphTrace = new EcoreExecutorType(TraceabilityPackage.Literals.EDFD_GRAPH_TRACE, PACKAGE, 0);
		public static final EcoreExecutorType _EDFDToGraph = new EcoreExecutorType(TraceabilityPackage.Literals.EDFD_TO_GRAPH, PACKAGE, 0);
		public static final EcoreExecutorType _GraphEndToEndTrace = new EcoreExecutorType(TraceabilityPackage.Literals.GRAPH_END_TO_END_TRACE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_EDFDGraphTrace,
			_EDFDToGraph,
			_GraphEndToEndTrace
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _EDFDGraphTrace__EDFDGraphTrace = new ExecutorFragment(Types._EDFDGraphTrace, TraceabilityTables.Types._EDFDGraphTrace);
		private static final ExecutorFragment _EDFDGraphTrace__OclAny = new ExecutorFragment(Types._EDFDGraphTrace, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EDFDGraphTrace__OclElement = new ExecutorFragment(Types._EDFDGraphTrace, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EDFDToGraph__EDFDToGraph = new ExecutorFragment(Types._EDFDToGraph, TraceabilityTables.Types._EDFDToGraph);
		private static final ExecutorFragment _EDFDToGraph__OclAny = new ExecutorFragment(Types._EDFDToGraph, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EDFDToGraph__OclElement = new ExecutorFragment(Types._EDFDToGraph, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _GraphEndToEndTrace__GraphEndToEndTrace = new ExecutorFragment(Types._GraphEndToEndTrace, TraceabilityTables.Types._GraphEndToEndTrace);
		private static final ExecutorFragment _GraphEndToEndTrace__OclAny = new ExecutorFragment(Types._GraphEndToEndTrace, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _GraphEndToEndTrace__OclElement = new ExecutorFragment(Types._GraphEndToEndTrace, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _EDFDGraphTrace__edfdElements = new EcoreExecutorProperty(TraceabilityPackage.Literals.EDFD_GRAPH_TRACE__EDFD_ELEMENTS, Types._EDFDGraphTrace, 0);
		public static final ExecutorProperty _EDFDGraphTrace__graphElements = new EcoreExecutorProperty(TraceabilityPackage.Literals.EDFD_GRAPH_TRACE__GRAPH_ELEMENTS, Types._EDFDGraphTrace, 1);
		public static final ExecutorProperty _EDFDGraphTrace__EDFDToGraph__edfdGraphTraces = new ExecutorPropertyWithImplementation("EDFDToGraph", Types._EDFDGraphTrace, 2, new EcoreLibraryOppositeProperty(TraceabilityPackage.Literals.EDFD_TO_GRAPH__EDFD_GRAPH_TRACES));

		public static final ExecutorProperty _EDFDToGraph__edfdGraphTraces = new EcoreExecutorProperty(TraceabilityPackage.Literals.EDFD_TO_GRAPH__EDFD_GRAPH_TRACES, Types._EDFDToGraph, 0);
		public static final ExecutorProperty _EDFDToGraph__edfds = new EcoreExecutorProperty(TraceabilityPackage.Literals.EDFD_TO_GRAPH__EDFDS, Types._EDFDToGraph, 1);
		public static final ExecutorProperty _EDFDToGraph__endtoendgraph = new EcoreExecutorProperty(TraceabilityPackage.Literals.EDFD_TO_GRAPH__ENDTOENDGRAPH, Types._EDFDToGraph, 2);
		public static final ExecutorProperty _EDFDToGraph__graphEndToEndTrace = new EcoreExecutorProperty(TraceabilityPackage.Literals.EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE, Types._EDFDToGraph, 3);
		public static final ExecutorProperty _EDFDToGraph__graphs = new EcoreExecutorProperty(TraceabilityPackage.Literals.EDFD_TO_GRAPH__GRAPHS, Types._EDFDToGraph, 4);

		public static final ExecutorProperty _GraphEndToEndTrace__endtoendGraphElements = new EcoreExecutorProperty(TraceabilityPackage.Literals.GRAPH_END_TO_END_TRACE__ENDTOEND_GRAPH_ELEMENTS, Types._GraphEndToEndTrace, 0);
		public static final ExecutorProperty _GraphEndToEndTrace__graphElements = new EcoreExecutorProperty(TraceabilityPackage.Literals.GRAPH_END_TO_END_TRACE__GRAPH_ELEMENTS, Types._GraphEndToEndTrace, 1);
		public static final ExecutorProperty _GraphEndToEndTrace__EDFDToGraph__graphEndToEndTrace = new ExecutorPropertyWithImplementation("EDFDToGraph", Types._GraphEndToEndTrace, 2, new EcoreLibraryOppositeProperty(TraceabilityPackage.Literals.EDFD_TO_GRAPH__GRAPH_END_TO_END_TRACE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _EDFDGraphTrace =
			{
				Fragments._EDFDGraphTrace__OclAny /* 0 */,
				Fragments._EDFDGraphTrace__OclElement /* 1 */,
				Fragments._EDFDGraphTrace__EDFDGraphTrace /* 2 */
			};
		private static final int /*@NonNull*/ [] __EDFDGraphTrace = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EDFDToGraph =
			{
				Fragments._EDFDToGraph__OclAny /* 0 */,
				Fragments._EDFDToGraph__OclElement /* 1 */,
				Fragments._EDFDToGraph__EDFDToGraph /* 2 */
			};
		private static final int /*@NonNull*/ [] __EDFDToGraph = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _GraphEndToEndTrace =
			{
				Fragments._GraphEndToEndTrace__OclAny /* 0 */,
				Fragments._GraphEndToEndTrace__OclElement /* 1 */,
				Fragments._GraphEndToEndTrace__GraphEndToEndTrace /* 2 */
			};
		private static final int /*@NonNull*/ [] __GraphEndToEndTrace = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._EDFDGraphTrace.initFragments(_EDFDGraphTrace, __EDFDGraphTrace);
			Types._EDFDToGraph.initFragments(_EDFDToGraph, __EDFDToGraph);
			Types._GraphEndToEndTrace.initFragments(_GraphEndToEndTrace, __GraphEndToEndTrace);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _EDFDGraphTrace__EDFDGraphTrace = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EDFDGraphTrace__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EDFDGraphTrace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EDFDToGraph__EDFDToGraph = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EDFDToGraph__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EDFDToGraph__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _GraphEndToEndTrace__GraphEndToEndTrace = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GraphEndToEndTrace__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GraphEndToEndTrace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._EDFDGraphTrace__EDFDGraphTrace.initOperations(_EDFDGraphTrace__EDFDGraphTrace);
			Fragments._EDFDGraphTrace__OclAny.initOperations(_EDFDGraphTrace__OclAny);
			Fragments._EDFDGraphTrace__OclElement.initOperations(_EDFDGraphTrace__OclElement);

			Fragments._EDFDToGraph__EDFDToGraph.initOperations(_EDFDToGraph__EDFDToGraph);
			Fragments._EDFDToGraph__OclAny.initOperations(_EDFDToGraph__OclAny);
			Fragments._EDFDToGraph__OclElement.initOperations(_EDFDToGraph__OclElement);

			Fragments._GraphEndToEndTrace__GraphEndToEndTrace.initOperations(_GraphEndToEndTrace__GraphEndToEndTrace);
			Fragments._GraphEndToEndTrace__OclAny.initOperations(_GraphEndToEndTrace__OclAny);
			Fragments._GraphEndToEndTrace__OclElement.initOperations(_GraphEndToEndTrace__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _EDFDGraphTrace = {
			TraceabilityTables.Properties._EDFDGraphTrace__edfdElements,
			TraceabilityTables.Properties._EDFDGraphTrace__graphElements,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EDFDToGraph = {
			TraceabilityTables.Properties._EDFDToGraph__edfdGraphTraces,
			TraceabilityTables.Properties._EDFDToGraph__edfds,
			TraceabilityTables.Properties._EDFDToGraph__endtoendgraph,
			TraceabilityTables.Properties._EDFDToGraph__graphEndToEndTrace,
			TraceabilityTables.Properties._EDFDToGraph__graphs,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _GraphEndToEndTrace = {
			TraceabilityTables.Properties._GraphEndToEndTrace__endtoendGraphElements,
			TraceabilityTables.Properties._GraphEndToEndTrace__graphElements,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._EDFDGraphTrace__EDFDGraphTrace.initProperties(_EDFDGraphTrace);
			Fragments._EDFDToGraph__EDFDToGraph.initProperties(_EDFDToGraph);
			Fragments._GraphEndToEndTrace__GraphEndToEndTrace.initProperties(_GraphEndToEndTrace);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TraceabilityTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new TraceabilityTables();
	}

	private TraceabilityTables() {
		super(TraceabilityPackage.eNS_URI);
	}
}
