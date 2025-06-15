/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph.util;

import com.google.common.collect.Sets;
import edfdtosimplegraph.GraphMatch;
import edfdtosimplegraph.GraphMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples; 

/**
 * A pattern-specific query specification that can instantiate GraphMatcher in a type-safe way.
 * 
 * @see GraphMatcher
 * @see GraphMatch
 * 
 */
@SuppressWarnings("all")
public final class GraphQuerySpecification extends BaseGeneratedEMFQuerySpecification<GraphMatcher> {
  private GraphQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static GraphQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected GraphMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return GraphMatcher.on(engine);
  }
  
  @Override
  public GraphMatcher instantiate() throws ViatraQueryException {
    return GraphMatcher.create();
  }
  
  @Override
  public GraphMatch newEmptyMatch() {
    return GraphMatch.newEmptyMatch();
  }
  
  @Override
  public GraphMatch newMatch(final Object... parameters) {
    return GraphMatch.newMatch((graph.Graph) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link GraphQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link GraphQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static GraphQuerySpecification INSTANCE = new GraphQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal(); 
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static GraphQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pG = new PParameter("g", "graph.Graph", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/graph", "Graph")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pG);
    
    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.Graph";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("g");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_g = body.getOrCreateVariableByName("g");
              new TypeConstraint(body, Tuples.flatTupleOf(var_g), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Graph")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_g, parameter_pG)
              ));
              // 	Graph(g)
              new TypeConstraint(body, Tuples.flatTupleOf(var_g), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Graph")));
              bodies.add(body);
          }
          // to silence compiler error
          if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
