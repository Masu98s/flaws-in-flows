/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph;

import graph.Identifiable;
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.secdfd.model.NamedEntity;
import traceability.EDFDGraphTrace;
import traceability.EDFDToGraph;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         //pattern graph2endtoend(graph : Graph)
 *         
 *         pattern edfd2simplegraph(
 *             edfd2graph : EDFDToGraph,
 *             trace : EDFDGraphTrace,
 *             edfdElements : NamedEntity,
 *             graphElements : Identifiable
 *         ) {
 *             EDFDToGraph.edfdGraphTraces(edfd2graph, trace);
 *             EDFDGraphTrace.edfdElements(trace, edfdElements);
 *             EDFDGraphTrace.graphElements(trace, graphElements);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Edfd2simplegraph extends BaseGeneratedEMFQuerySpecification<Edfd2simplegraph.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.edfd2simplegraph pattern,
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
    private EDFDToGraph fEdfd2graph;

    private EDFDGraphTrace fTrace;

    private NamedEntity fEdfdElements;

    private Identifiable fGraphElements;

    private static List<String> parameterNames = makeImmutableList("edfd2graph", "trace", "edfdElements", "graphElements");

    private Match(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      this.fEdfd2graph = pEdfd2graph;
      this.fTrace = pTrace;
      this.fEdfdElements = pEdfdElements;
      this.fGraphElements = pGraphElements;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "edfd2graph": return this.fEdfd2graph;
          case "trace": return this.fTrace;
          case "edfdElements": return this.fEdfdElements;
          case "graphElements": return this.fGraphElements;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEdfd2graph;
          case 1: return this.fTrace;
          case 2: return this.fEdfdElements;
          case 3: return this.fGraphElements;
          default: return null;
      }
    }

    public EDFDToGraph getEdfd2graph() {
      return this.fEdfd2graph;
    }

    public EDFDGraphTrace getTrace() {
      return this.fTrace;
    }

    public NamedEntity getEdfdElements() {
      return this.fEdfdElements;
    }

    public Identifiable getGraphElements() {
      return this.fGraphElements;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("edfd2graph".equals(parameterName) ) {
          this.fEdfd2graph = (EDFDToGraph) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (EDFDGraphTrace) newValue;
          return true;
      }
      if ("edfdElements".equals(parameterName) ) {
          this.fEdfdElements = (NamedEntity) newValue;
          return true;
      }
      if ("graphElements".equals(parameterName) ) {
          this.fGraphElements = (Identifiable) newValue;
          return true;
      }
      return false;
    }

    public void setEdfd2graph(final EDFDToGraph pEdfd2graph) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEdfd2graph = pEdfd2graph;
    }

    public void setTrace(final EDFDGraphTrace pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }

    public void setEdfdElements(final NamedEntity pEdfdElements) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEdfdElements = pEdfdElements;
    }

    public void setGraphElements(final Identifiable pGraphElements) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fGraphElements = pGraphElements;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.edfd2simplegraph";
    }

    @Override
    public List<String> parameterNames() {
      return Edfd2simplegraph.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fEdfd2graph, fTrace, fEdfdElements, fGraphElements};
    }

    @Override
    public Edfd2simplegraph.Match toImmutable() {
      return isMutable() ? newMatch(fEdfd2graph, fTrace, fEdfdElements, fGraphElements) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"edfd2graph\"=" + prettyPrintValue(fEdfd2graph) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
      result.append("\"edfdElements\"=" + prettyPrintValue(fEdfdElements) + ", ");
      result.append("\"graphElements\"=" + prettyPrintValue(fGraphElements));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fEdfd2graph, fTrace, fEdfdElements, fGraphElements);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Edfd2simplegraph.Match)) {
          Edfd2simplegraph.Match other = (Edfd2simplegraph.Match) obj;
          return Objects.equals(fEdfd2graph, other.fEdfd2graph) && Objects.equals(fTrace, other.fTrace) && Objects.equals(fEdfdElements, other.fEdfdElements) && Objects.equals(fGraphElements, other.fGraphElements);
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
    public Edfd2simplegraph specification() {
      return Edfd2simplegraph.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Edfd2simplegraph.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Edfd2simplegraph.Match newMutableMatch(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return new Mutable(pEdfd2graph, pTrace, pEdfdElements, pGraphElements);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Edfd2simplegraph.Match newMatch(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return new Immutable(pEdfd2graph, pTrace, pEdfdElements, pGraphElements);
    }

    private static final class Mutable extends Edfd2simplegraph.Match {
      Mutable(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
        super(pEdfd2graph, pTrace, pEdfdElements, pGraphElements);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends Edfd2simplegraph.Match {
      Immutable(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
        super(pEdfd2graph, pTrace, pEdfdElements, pGraphElements);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.edfd2simplegraph pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //pattern graph2endtoend(graph : Graph)
   * 
   * pattern edfd2simplegraph(
   *     edfd2graph : EDFDToGraph,
   *     trace : EDFDGraphTrace,
   *     edfdElements : NamedEntity,
   *     graphElements : Identifiable
   * ) {
   *     EDFDToGraph.edfdGraphTraces(edfd2graph, trace);
   *     EDFDGraphTrace.edfdElements(trace, edfdElements);
   *     EDFDGraphTrace.graphElements(trace, graphElements);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Edfd2simplegraph
   * 
   */
  public static class Matcher extends BaseMatcher<Edfd2simplegraph.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Edfd2simplegraph.Matcher on(final ViatraQueryEngine engine) {
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
    public static Edfd2simplegraph.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_EDFD2GRAPH = 0;

    private static final int POSITION_TRACE = 1;

    private static final int POSITION_EDFDELEMENTS = 2;

    private static final int POSITION_GRAPHELEMENTS = 3;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Edfd2simplegraph.Matcher.class);

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
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Edfd2simplegraph.Match> getAllMatches(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawStreamAllMatches(new Object[]{pEdfd2graph, pTrace, pEdfdElements, pGraphElements}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Edfd2simplegraph.Match> streamAllMatches(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawStreamAllMatches(new Object[]{pEdfd2graph, pTrace, pEdfdElements, pGraphElements});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Edfd2simplegraph.Match> getOneArbitraryMatch(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawGetOneArbitraryMatch(new Object[]{pEdfd2graph, pTrace, pEdfdElements, pGraphElements});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawHasMatch(new Object[]{pEdfd2graph, pTrace, pEdfdElements, pGraphElements});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawCountMatches(new Object[]{pEdfd2graph, pTrace, pEdfdElements, pGraphElements});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements, final Consumer<? super Edfd2simplegraph.Match> processor) {
      rawForEachMatch(new Object[]{pEdfd2graph, pTrace, pEdfdElements, pGraphElements}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements, final Consumer<? super Edfd2simplegraph.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEdfd2graph, pTrace, pEdfdElements, pGraphElements}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEdfd2graph the fixed value of pattern parameter edfd2graph, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pEdfdElements the fixed value of pattern parameter edfdElements, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Edfd2simplegraph.Match newMatch(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return Edfd2simplegraph.Match.newMatch(pEdfd2graph, pTrace, pEdfdElements, pGraphElements);
    }

    /**
     * Retrieve the set of values that occur in matches for edfd2graph.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EDFDToGraph> rawStreamAllValuesOfedfd2graph(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EDFD2GRAPH, parameters).map(EDFDToGraph.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for edfd2graph.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDToGraph> getAllValuesOfedfd2graph() {
      return rawStreamAllValuesOfedfd2graph(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for edfd2graph.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDToGraph> streamAllValuesOfedfd2graph() {
      return rawStreamAllValuesOfedfd2graph(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for edfd2graph.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDToGraph> streamAllValuesOfedfd2graph(final Edfd2simplegraph.Match partialMatch) {
      return rawStreamAllValuesOfedfd2graph(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for edfd2graph.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDToGraph> streamAllValuesOfedfd2graph(final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawStreamAllValuesOfedfd2graph(new Object[]{null, pTrace, pEdfdElements, pGraphElements});
    }

    /**
     * Retrieve the set of values that occur in matches for edfd2graph.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDToGraph> getAllValuesOfedfd2graph(final Edfd2simplegraph.Match partialMatch) {
      return rawStreamAllValuesOfedfd2graph(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for edfd2graph.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDToGraph> getAllValuesOfedfd2graph(final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawStreamAllValuesOfedfd2graph(new Object[]{null, pTrace, pEdfdElements, pGraphElements}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EDFDGraphTrace> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(EDFDGraphTrace.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDGraphTrace> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDGraphTrace> streamAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDGraphTrace> streamAllValuesOftrace(final Edfd2simplegraph.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDGraphTrace> streamAllValuesOftrace(final EDFDToGraph pEdfd2graph, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawStreamAllValuesOftrace(new Object[]{pEdfd2graph, null, pEdfdElements, pGraphElements});
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDGraphTrace> getAllValuesOftrace(final Edfd2simplegraph.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDGraphTrace> getAllValuesOftrace(final EDFDToGraph pEdfd2graph, final NamedEntity pEdfdElements, final Identifiable pGraphElements) {
      return rawStreamAllValuesOftrace(new Object[]{pEdfd2graph, null, pEdfdElements, pGraphElements}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for edfdElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedEntity> rawStreamAllValuesOfedfdElements(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EDFDELEMENTS, parameters).map(NamedEntity.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for edfdElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedEntity> getAllValuesOfedfdElements() {
      return rawStreamAllValuesOfedfdElements(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for edfdElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedEntity> streamAllValuesOfedfdElements() {
      return rawStreamAllValuesOfedfdElements(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for edfdElements.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedEntity> streamAllValuesOfedfdElements(final Edfd2simplegraph.Match partialMatch) {
      return rawStreamAllValuesOfedfdElements(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for edfdElements.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedEntity> streamAllValuesOfedfdElements(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final Identifiable pGraphElements) {
      return rawStreamAllValuesOfedfdElements(new Object[]{pEdfd2graph, pTrace, null, pGraphElements});
    }

    /**
     * Retrieve the set of values that occur in matches for edfdElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedEntity> getAllValuesOfedfdElements(final Edfd2simplegraph.Match partialMatch) {
      return rawStreamAllValuesOfedfdElements(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for edfdElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedEntity> getAllValuesOfedfdElements(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final Identifiable pGraphElements) {
      return rawStreamAllValuesOfedfdElements(new Object[]{pEdfd2graph, pTrace, null, pGraphElements}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Identifiable> rawStreamAllValuesOfgraphElements(final Object[] parameters) {
      return rawStreamAllValues(POSITION_GRAPHELEMENTS, parameters).map(Identifiable.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfgraphElements() {
      return rawStreamAllValuesOfgraphElements(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfgraphElements() {
      return rawStreamAllValuesOfgraphElements(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfgraphElements(final Edfd2simplegraph.Match partialMatch) {
      return rawStreamAllValuesOfgraphElements(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfgraphElements(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements) {
      return rawStreamAllValuesOfgraphElements(new Object[]{pEdfd2graph, pTrace, pEdfdElements, null});
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfgraphElements(final Edfd2simplegraph.Match partialMatch) {
      return rawStreamAllValuesOfgraphElements(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfgraphElements(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements) {
      return rawStreamAllValuesOfgraphElements(new Object[]{pEdfd2graph, pTrace, pEdfdElements, null}).collect(Collectors.toSet());
    }

    @Override
    protected Edfd2simplegraph.Match tupleToMatch(final Tuple t) {
      try {
          return Edfd2simplegraph.Match.newMatch((EDFDToGraph) t.get(POSITION_EDFD2GRAPH), (EDFDGraphTrace) t.get(POSITION_TRACE), (NamedEntity) t.get(POSITION_EDFDELEMENTS), (Identifiable) t.get(POSITION_GRAPHELEMENTS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected Edfd2simplegraph.Match arrayToMatch(final Object[] match) {
      try {
          return Edfd2simplegraph.Match.newMatch((EDFDToGraph) match[POSITION_EDFD2GRAPH], (EDFDGraphTrace) match[POSITION_TRACE], (NamedEntity) match[POSITION_EDFDELEMENTS], (Identifiable) match[POSITION_GRAPHELEMENTS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected Edfd2simplegraph.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Edfd2simplegraph.Match.newMutableMatch((EDFDToGraph) match[POSITION_EDFD2GRAPH], (EDFDGraphTrace) match[POSITION_TRACE], (NamedEntity) match[POSITION_EDFDELEMENTS], (Identifiable) match[POSITION_GRAPHELEMENTS]);
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
    public static IQuerySpecification<Edfd2simplegraph.Matcher> querySpecification() {
      return Edfd2simplegraph.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.edfd2simplegraph pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Edfd2simplegraph.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEdfd2graph the value of pattern parameter edfd2graph in the currently processed match
     * @param pTrace the value of pattern parameter trace in the currently processed match
     * @param pEdfdElements the value of pattern parameter edfdElements in the currently processed match
     * @param pGraphElements the value of pattern parameter graphElements in the currently processed match
     * 
     */
    public abstract void accept(final EDFDToGraph pEdfd2graph, final EDFDGraphTrace pTrace, final NamedEntity pEdfdElements, final Identifiable pGraphElements);

    @Override
    public void accept(final Edfd2simplegraph.Match match) {
      accept(match.getEdfd2graph(), match.getTrace(), match.getEdfdElements(), match.getGraphElements());
    }
  }

  private Edfd2simplegraph() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Edfd2simplegraph instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected Edfd2simplegraph.Matcher instantiate(final ViatraQueryEngine engine) {
    return Edfd2simplegraph.Matcher.on(engine);
  }

  @Override
  public Edfd2simplegraph.Matcher instantiate() {
    return Edfd2simplegraph.Matcher.create();
  }

  @Override
  public Edfd2simplegraph.Match newEmptyMatch() {
    return Edfd2simplegraph.Match.newEmptyMatch();
  }

  @Override
  public Edfd2simplegraph.Match newMatch(final Object... parameters) {
    return Edfd2simplegraph.Match.newMatch((EDFDToGraph) parameters[0], (EDFDGraphTrace) parameters[1], (NamedEntity) parameters[2], (Identifiable) parameters[3]);
  }

  /**
   * Inner class allowing the singleton instance of {@link Edfd2simplegraph} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Edfd2simplegraph#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Edfd2simplegraph INSTANCE = new Edfd2simplegraph();

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
    private static final Edfd2simplegraph.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_edfd2graph = new PParameter("edfd2graph", "traceability.EDFDToGraph", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/traceability", "EDFDToGraph")), PParameterDirection.INOUT);

    private final PParameter parameter_trace = new PParameter("trace", "traceability.EDFDGraphTrace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/traceability", "EDFDGraphTrace")), PParameterDirection.INOUT);

    private final PParameter parameter_edfdElements = new PParameter("edfdElements", "org.secdfd.model.NamedEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "NamedEntity")), PParameterDirection.INOUT);

    private final PParameter parameter_graphElements = new PParameter("graphElements", "graph.Identifiable", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/graph", "Identifiable")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_edfd2graph, parameter_trace, parameter_edfdElements, parameter_graphElements);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.edfd2simplegraph";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("edfd2graph","trace","edfdElements","graphElements");
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
          PVariable var_edfd2graph = body.getOrCreateVariableByName("edfd2graph");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var_edfdElements = body.getOrCreateVariableByName("edfdElements");
          PVariable var_graphElements = body.getOrCreateVariableByName("graphElements");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd2graph), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "EDFDToGraph")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "EDFDGraphTrace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfdElements), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "NamedEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_graphElements), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Identifiable")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_edfd2graph, parameter_edfd2graph),
             new ExportedParameter(body, var_trace, parameter_trace),
             new ExportedParameter(body, var_edfdElements, parameter_edfdElements),
             new ExportedParameter(body, var_graphElements, parameter_graphElements)
          ));
          //     EDFDToGraph.edfdGraphTraces(edfd2graph, trace)
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd2graph), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "EDFDToGraph")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd2graph, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/traceability", "EDFDToGraph", "edfdGraphTraces")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "EDFDGraphTrace")));
          new Equality(body, var__virtual_0_, var_trace);
          //     EDFDGraphTrace.edfdElements(trace, edfdElements)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "EDFDGraphTrace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/traceability", "EDFDGraphTrace", "edfdElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "NamedEntity")));
          new Equality(body, var__virtual_1_, var_edfdElements);
          //     EDFDGraphTrace.graphElements(trace, graphElements)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "EDFDGraphTrace")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/traceability", "EDFDGraphTrace", "graphElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Identifiable")));
          new Equality(body, var__virtual_2_, var_graphElements);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
