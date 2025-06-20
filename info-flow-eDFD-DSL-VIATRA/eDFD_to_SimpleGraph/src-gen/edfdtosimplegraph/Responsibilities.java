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
import org.secdfd.model.Responsibility;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern Responsibilities(r: Responsibility){
 *         	Responsibility(r);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Responsibilities extends BaseGeneratedEMFQuerySpecification<Responsibilities.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.Responsibilities pattern,
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
    private Responsibility fR;

    private static List<String> parameterNames = makeImmutableList("r");

    private Match(final Responsibility pR) {
      this.fR = pR;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "r": return this.fR;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fR;
          default: return null;
      }
    }

    public Responsibility getR() {
      return this.fR;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("r".equals(parameterName) ) {
          this.fR = (Responsibility) newValue;
          return true;
      }
      return false;
    }

    public void setR(final Responsibility pR) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fR = pR;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.Responsibilities";
    }

    @Override
    public List<String> parameterNames() {
      return Responsibilities.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fR};
    }

    @Override
    public Responsibilities.Match toImmutable() {
      return isMutable() ? newMatch(fR) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"r\"=" + prettyPrintValue(fR));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fR);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Responsibilities.Match)) {
          Responsibilities.Match other = (Responsibilities.Match) obj;
          return Objects.equals(fR, other.fR);
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
    public Responsibilities specification() {
      return Responsibilities.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Responsibilities.Match newEmptyMatch() {
      return new Mutable(null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Responsibilities.Match newMutableMatch(final Responsibility pR) {
      return new Mutable(pR);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Responsibilities.Match newMatch(final Responsibility pR) {
      return new Immutable(pR);
    }

    private static final class Mutable extends Responsibilities.Match {
      Mutable(final Responsibility pR) {
        super(pR);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends Responsibilities.Match {
      Immutable(final Responsibility pR) {
        super(pR);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.Responsibilities pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern Responsibilities(r: Responsibility){
   * 	Responsibility(r);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Responsibilities
   * 
   */
  public static class Matcher extends BaseMatcher<Responsibilities.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Responsibilities.Matcher on(final ViatraQueryEngine engine) {
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
    public static Responsibilities.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_R = 0;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Responsibilities.Matcher.class);

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
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Responsibilities.Match> getAllMatches(final Responsibility pR) {
      return rawStreamAllMatches(new Object[]{pR}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Responsibilities.Match> streamAllMatches(final Responsibility pR) {
      return rawStreamAllMatches(new Object[]{pR});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Responsibilities.Match> getOneArbitraryMatch(final Responsibility pR) {
      return rawGetOneArbitraryMatch(new Object[]{pR});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Responsibility pR) {
      return rawHasMatch(new Object[]{pR});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Responsibility pR) {
      return rawCountMatches(new Object[]{pR});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Responsibility pR, final Consumer<? super Responsibilities.Match> processor) {
      rawForEachMatch(new Object[]{pR}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Responsibility pR, final Consumer<? super Responsibilities.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pR}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pR the fixed value of pattern parameter r, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Responsibilities.Match newMatch(final Responsibility pR) {
      return Responsibilities.Match.newMatch(pR);
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Responsibility> rawStreamAllValuesOfr(final Object[] parameters) {
      return rawStreamAllValues(POSITION_R, parameters).map(Responsibility.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Responsibility> getAllValuesOfr() {
      return rawStreamAllValuesOfr(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for r.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Responsibility> streamAllValuesOfr() {
      return rawStreamAllValuesOfr(emptyArray());
    }

    @Override
    protected Responsibilities.Match tupleToMatch(final Tuple t) {
      try {
          return Responsibilities.Match.newMatch((Responsibility) t.get(POSITION_R));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected Responsibilities.Match arrayToMatch(final Object[] match) {
      try {
          return Responsibilities.Match.newMatch((Responsibility) match[POSITION_R]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected Responsibilities.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Responsibilities.Match.newMutableMatch((Responsibility) match[POSITION_R]);
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
    public static IQuerySpecification<Responsibilities.Matcher> querySpecification() {
      return Responsibilities.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.Responsibilities pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Responsibilities.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pR the value of pattern parameter r in the currently processed match
     * 
     */
    public abstract void accept(final Responsibility pR);

    @Override
    public void accept(final Responsibilities.Match match) {
      accept(match.getR());
    }
  }

  private Responsibilities() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Responsibilities instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected Responsibilities.Matcher instantiate(final ViatraQueryEngine engine) {
    return Responsibilities.Matcher.on(engine);
  }

  @Override
  public Responsibilities.Matcher instantiate() {
    return Responsibilities.Matcher.create();
  }

  @Override
  public Responsibilities.Match newEmptyMatch() {
    return Responsibilities.Match.newEmptyMatch();
  }

  @Override
  public Responsibilities.Match newMatch(final Object... parameters) {
    return Responsibilities.Match.newMatch((Responsibility) parameters[0]);
  }

  /**
   * Inner class allowing the singleton instance of {@link Responsibilities} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Responsibilities#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Responsibilities INSTANCE = new Responsibilities();

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
    private static final Responsibilities.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_r = new PParameter("r", "org.secdfd.model.Responsibility", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Responsibility")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_r);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.Responsibilities";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("r");
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
          PVariable var_r = body.getOrCreateVariableByName("r");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Responsibility")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_r, parameter_r)
          ));
          // 	Responsibility(r)
          new TypeConstraint(body, Tuples.flatTupleOf(var_r), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Responsibility")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
