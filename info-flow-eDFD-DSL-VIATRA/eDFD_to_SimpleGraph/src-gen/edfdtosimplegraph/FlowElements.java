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
import org.secdfd.model.Flow;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern FlowElements(el: Flow){
 *         	Flow(el);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FlowElements extends BaseGeneratedEMFQuerySpecification<FlowElements.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.FlowElements pattern,
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
    private Flow fEl;

    private static List<String> parameterNames = makeImmutableList("el");

    private Match(final Flow pEl) {
      this.fEl = pEl;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "el": return this.fEl;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEl;
          default: return null;
      }
    }

    public Flow getEl() {
      return this.fEl;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("el".equals(parameterName) ) {
          this.fEl = (Flow) newValue;
          return true;
      }
      return false;
    }

    public void setEl(final Flow pEl) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEl = pEl;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.FlowElements";
    }

    @Override
    public List<String> parameterNames() {
      return FlowElements.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fEl};
    }

    @Override
    public FlowElements.Match toImmutable() {
      return isMutable() ? newMatch(fEl) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"el\"=" + prettyPrintValue(fEl));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fEl);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FlowElements.Match)) {
          FlowElements.Match other = (FlowElements.Match) obj;
          return Objects.equals(fEl, other.fEl);
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
    public FlowElements specification() {
      return FlowElements.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FlowElements.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FlowElements.Match newMutableMatch(final Flow pEl) {
      return new Mutable(pEl);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FlowElements.Match newMatch(final Flow pEl) {
      return new Immutable(pEl);
    }

    private static final class Mutable extends FlowElements.Match {
      Mutable(final Flow pEl) {
        super(pEl);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends FlowElements.Match {
      Immutable(final Flow pEl) {
        super(pEl);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.FlowElements pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern FlowElements(el: Flow){
   * 	Flow(el);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see FlowElements
   * 
   */
  public static class Matcher extends BaseMatcher<FlowElements.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FlowElements.Matcher on(final ViatraQueryEngine engine) {
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
    public static FlowElements.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_EL = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FlowElements.Matcher.class);

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
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FlowElements.Match> getAllMatches(final Flow pEl) {
      return rawStreamAllMatches(new Object[]{pEl}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FlowElements.Match> streamAllMatches(final Flow pEl) {
      return rawStreamAllMatches(new Object[]{pEl});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FlowElements.Match> getOneArbitraryMatch(final Flow pEl) {
      return rawGetOneArbitraryMatch(new Object[]{pEl});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Flow pEl) {
      return rawHasMatch(new Object[]{pEl});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Flow pEl) {
      return rawCountMatches(new Object[]{pEl});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Flow pEl, final Consumer<? super FlowElements.Match> processor) {
      rawForEachMatch(new Object[]{pEl}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Flow pEl, final Consumer<? super FlowElements.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEl}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FlowElements.Match newMatch(final Flow pEl) {
      return FlowElements.Match.newMatch(pEl);
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Flow> rawStreamAllValuesOfel(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EL, parameters).map(Flow.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Flow> getAllValuesOfel() {
      return rawStreamAllValuesOfel(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Flow> streamAllValuesOfel() {
      return rawStreamAllValuesOfel(emptyArray());
    }

    @Override
    protected FlowElements.Match tupleToMatch(final Tuple t) {
      try {
          return FlowElements.Match.newMatch((Flow) t.get(POSITION_EL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FlowElements.Match arrayToMatch(final Object[] match) {
      try {
          return FlowElements.Match.newMatch((Flow) match[POSITION_EL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected FlowElements.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FlowElements.Match.newMutableMatch((Flow) match[POSITION_EL]);
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
    public static IQuerySpecification<FlowElements.Matcher> querySpecification() {
      return FlowElements.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.FlowElements pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<FlowElements.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEl the value of pattern parameter el in the currently processed match
     * 
     */
    public abstract void accept(final Flow pEl);

    @Override
    public void accept(final FlowElements.Match match) {
      accept(match.getEl());
    }
  }

  private FlowElements() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FlowElements instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected FlowElements.Matcher instantiate(final ViatraQueryEngine engine) {
    return FlowElements.Matcher.on(engine);
  }

  @Override
  public FlowElements.Matcher instantiate() {
    return FlowElements.Matcher.create();
  }

  @Override
  public FlowElements.Match newEmptyMatch() {
    return FlowElements.Match.newEmptyMatch();
  }

  @Override
  public FlowElements.Match newMatch(final Object... parameters) {
    return FlowElements.Match.newMatch((Flow) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link FlowElements} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FlowElements#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FlowElements INSTANCE = new FlowElements();

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
    private static final FlowElements.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_el = new PParameter("el", "org.secdfd.model.Flow", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Flow")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_el);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.FlowElements";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("el");
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
          PVariable var_el = body.getOrCreateVariableByName("el");
          new TypeConstraint(body, Tuples.flatTupleOf(var_el), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Flow")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_el, parameter_el)
          ));
          // 	Flow(el)
          new TypeConstraint(body, Tuples.flatTupleOf(var_el), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Flow")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
