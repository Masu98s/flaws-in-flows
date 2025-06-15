/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern Graph(g : Graph){
 *         	Graph(g);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Graph extends BaseGeneratedEMFQuerySpecification<Graph.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.Graph pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   *  @see Processor
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private graph.Graph fG;

    private static List<String> parameterNames = makeImmutableList("g");

    private Match(final graph.Graph pG) {
      this.fG = pG;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "g": return this.fG;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fG;
          default: return null;
      }
    }

    public graph.Graph getG() {
      return this.fG;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("g".equals(parameterName) ) {
          this.fG = (graph.Graph) newValue;
          return true;
      }
      return false;
    }

    public void setG(final graph.Graph pG) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fG = pG;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.Graph";
    }

    @Override
    public List<String> parameterNames() {
      return Graph.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fG};
    }

    @Override
    public Graph.Match toImmutable() {
      return isMutable() ? newMatch(fG) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"g\"=" + prettyPrintValue(fG));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fG);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Graph.Match)) {
          Graph.Match other = (Graph.Match) obj;
          return Objects.equals(fG, other.fG);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }

    @Override
    public Graph specification() {
      return Graph.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Graph.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Graph.Match newMutableMatch(final graph.Graph pG) {
      return new Mutable(pG);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Graph.Match newMatch(final graph.Graph pG) {
      return new Immutable(pG);
    }

    private static final class Mutable extends Graph.Match {
      Mutable(final graph.Graph pG) {
        super(pG);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends Graph.Match {
      Immutable(final graph.Graph pG) {
        super(pG);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.Graph pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern Graph(g : Graph){
   * 	Graph(g);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Graph
   * 
   */
  public static class Matcher extends BaseMatcher<Graph.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Graph.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }

    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static Graph.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_G = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Graph.Matcher.class);

    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }

    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Graph.Match> getAllMatches(final graph.Graph pG) {
      return rawStreamAllMatches(new Object[]{pG}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Graph.Match> streamAllMatches(final graph.Graph pG) {
      return rawStreamAllMatches(new Object[]{pG});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Graph.Match> getOneArbitraryMatch(final graph.Graph pG) {
      return rawGetOneArbitraryMatch(new Object[]{pG});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final graph.Graph pG) {
      return rawHasMatch(new Object[]{pG});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final graph.Graph pG) {
      return rawCountMatches(new Object[]{pG});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final graph.Graph pG, final Consumer<? super Graph.Match> processor) {
      rawForEachMatch(new Object[]{pG}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final graph.Graph pG, final Consumer<? super Graph.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pG}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pG the fixed value of pattern parameter g, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Graph.Match newMatch(final graph.Graph pG) {
      return Graph.Match.newMatch(pG);
    }

    /**
     * Retrieve the set of values that occur in matches for g.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<graph.Graph> rawStreamAllValuesOfg(final Object[] parameters) {
      return rawStreamAllValues(POSITION_G, parameters).map(graph.Graph.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for g.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<graph.Graph> getAllValuesOfg() {
      return rawStreamAllValuesOfg(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for g.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<graph.Graph> streamAllValuesOfg() {
      return rawStreamAllValuesOfg(emptyArray());
    }

    @Override
    protected Graph.Match tupleToMatch(final Tuple t) {
      try {
          return Graph.Match.newMatch((graph.Graph) t.get(POSITION_G));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected Graph.Match arrayToMatch(final Object[] match) {
      try {
          return Graph.Match.newMatch((graph.Graph) match[POSITION_G]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected Graph.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Graph.Match.newMutableMatch((graph.Graph) match[POSITION_G]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<Graph.Matcher> querySpecification() {
      return Graph.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.Graph pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Graph.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pG the value of pattern parameter g in the currently processed match
     * 
     */
    public abstract void accept(final graph.Graph pG);

    @Override
    public void accept(final Graph.Match match) {
      accept(match.getG());
    }
  }

  private Graph() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Graph instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected Graph.Matcher instantiate(final ViatraQueryEngine engine) {
    return Graph.Matcher.on(engine);
  }

  @Override
  public Graph.Matcher instantiate() {
    return Graph.Matcher.create();
  }

  @Override
  public Graph.Match newEmptyMatch() {
    return Graph.Match.newEmptyMatch();
  }

  @Override
  public Graph.Match newMatch(final Object... parameters) {
    return Graph.Match.newMatch((graph.Graph) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link Graph} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Graph#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Graph INSTANCE = new Graph();

    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();

    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }

  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final Graph.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_g = new PParameter("g", "graph.Graph", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/graph", "Graph")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_g);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

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
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_g = body.getOrCreateVariableByName("g");
          new TypeConstraint(body, Tuples.flatTupleOf(var_g), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Graph")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_g, parameter_g)
          ));
          // 	Graph(g)
          new TypeConstraint(body, Tuples.flatTupleOf(var_g), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Graph")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
