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
import org.secdfd.model.Asset;
import org.secdfd.model.EDFD;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern EDFDAsset(edfd : EDFD, a : Asset){
 *         	EDFD.asset(edfd, a);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EDFDAsset extends BaseGeneratedEMFQuerySpecification<EDFDAsset.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.EDFDAsset pattern,
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
    private EDFD fEdfd;

    private Asset fA;

    private static List<String> parameterNames = makeImmutableList("edfd", "a");

    private Match(final EDFD pEdfd, final Asset pA) {
      this.fEdfd = pEdfd;
      this.fA = pA;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "edfd": return this.fEdfd;
          case "a": return this.fA;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEdfd;
          case 1: return this.fA;
          default: return null;
      }
    }

    public EDFD getEdfd() {
      return this.fEdfd;
    }

    public Asset getA() {
      return this.fA;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("edfd".equals(parameterName) ) {
          this.fEdfd = (EDFD) newValue;
          return true;
      }
      if ("a".equals(parameterName) ) {
          this.fA = (Asset) newValue;
          return true;
      }
      return false;
    }

    public void setEdfd(final EDFD pEdfd) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEdfd = pEdfd;
    }

    public void setA(final Asset pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.EDFDAsset";
    }

    @Override
    public List<String> parameterNames() {
      return EDFDAsset.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fEdfd, fA};
    }

    @Override
    public EDFDAsset.Match toImmutable() {
      return isMutable() ? newMatch(fEdfd, fA) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"edfd\"=" + prettyPrintValue(fEdfd) + ", ");
      result.append("\"a\"=" + prettyPrintValue(fA));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fEdfd, fA);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EDFDAsset.Match)) {
          EDFDAsset.Match other = (EDFDAsset.Match) obj;
          return Objects.equals(fEdfd, other.fEdfd) && Objects.equals(fA, other.fA);
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
    public EDFDAsset specification() {
      return EDFDAsset.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EDFDAsset.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EDFDAsset.Match newMutableMatch(final EDFD pEdfd, final Asset pA) {
      return new Mutable(pEdfd, pA);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EDFDAsset.Match newMatch(final EDFD pEdfd, final Asset pA) {
      return new Immutable(pEdfd, pA);
    }

    private static final class Mutable extends EDFDAsset.Match {
      Mutable(final EDFD pEdfd, final Asset pA) {
        super(pEdfd, pA);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends EDFDAsset.Match {
      Immutable(final EDFD pEdfd, final Asset pA) {
        super(pEdfd, pA);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.EDFDAsset pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern EDFDAsset(edfd : EDFD, a : Asset){
   * 	EDFD.asset(edfd, a);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see EDFDAsset
   * 
   */
  public static class Matcher extends BaseMatcher<EDFDAsset.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EDFDAsset.Matcher on(final ViatraQueryEngine engine) {
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
    public static EDFDAsset.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_EDFD = 0;

    private static final int POSITION_A = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EDFDAsset.Matcher.class);

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
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EDFDAsset.Match> getAllMatches(final EDFD pEdfd, final Asset pA) {
      return rawStreamAllMatches(new Object[]{pEdfd, pA}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EDFDAsset.Match> streamAllMatches(final EDFD pEdfd, final Asset pA) {
      return rawStreamAllMatches(new Object[]{pEdfd, pA});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EDFDAsset.Match> getOneArbitraryMatch(final EDFD pEdfd, final Asset pA) {
      return rawGetOneArbitraryMatch(new Object[]{pEdfd, pA});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EDFD pEdfd, final Asset pA) {
      return rawHasMatch(new Object[]{pEdfd, pA});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EDFD pEdfd, final Asset pA) {
      return rawCountMatches(new Object[]{pEdfd, pA});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final EDFD pEdfd, final Asset pA, final Consumer<? super EDFDAsset.Match> processor) {
      rawForEachMatch(new Object[]{pEdfd, pA}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EDFD pEdfd, final Asset pA, final Consumer<? super EDFDAsset.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEdfd, pA}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EDFDAsset.Match newMatch(final EDFD pEdfd, final Asset pA) {
      return EDFDAsset.Match.newMatch(pEdfd, pA);
    }

    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EDFD> rawStreamAllValuesOfedfd(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EDFD, parameters).map(EDFD.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFD> getAllValuesOfedfd() {
      return rawStreamAllValuesOfedfd(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFD> streamAllValuesOfedfd() {
      return rawStreamAllValuesOfedfd(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for edfd.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFD> streamAllValuesOfedfd(final EDFDAsset.Match partialMatch) {
      return rawStreamAllValuesOfedfd(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for edfd.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFD> streamAllValuesOfedfd(final Asset pA) {
      return rawStreamAllValuesOfedfd(new Object[]{null, pA});
    }

    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFD> getAllValuesOfedfd(final EDFDAsset.Match partialMatch) {
      return rawStreamAllValuesOfedfd(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFD> getAllValuesOfedfd(final Asset pA) {
      return rawStreamAllValuesOfedfd(new Object[]{null, pA}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Asset> rawStreamAllValuesOfa(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A, parameters).map(Asset.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa(final EDFDAsset.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa(final EDFD pEdfd) {
      return rawStreamAllValuesOfa(new Object[]{pEdfd, null});
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final EDFDAsset.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final EDFD pEdfd) {
      return rawStreamAllValuesOfa(new Object[]{pEdfd, null}).collect(Collectors.toSet());
    }

    @Override
    protected EDFDAsset.Match tupleToMatch(final Tuple t) {
      try {
          return EDFDAsset.Match.newMatch((EDFD) t.get(POSITION_EDFD), (Asset) t.get(POSITION_A));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected EDFDAsset.Match arrayToMatch(final Object[] match) {
      try {
          return EDFDAsset.Match.newMatch((EDFD) match[POSITION_EDFD], (Asset) match[POSITION_A]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected EDFDAsset.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EDFDAsset.Match.newMutableMatch((EDFD) match[POSITION_EDFD], (Asset) match[POSITION_A]);
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
    public static IQuerySpecification<EDFDAsset.Matcher> querySpecification() {
      return EDFDAsset.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.EDFDAsset pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<EDFDAsset.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEdfd the value of pattern parameter edfd in the currently processed match
     * @param pA the value of pattern parameter a in the currently processed match
     * 
     */
    public abstract void accept(final EDFD pEdfd, final Asset pA);

    @Override
    public void accept(final EDFDAsset.Match match) {
      accept(match.getEdfd(), match.getA());
    }
  }

  private EDFDAsset() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EDFDAsset instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected EDFDAsset.Matcher instantiate(final ViatraQueryEngine engine) {
    return EDFDAsset.Matcher.on(engine);
  }

  @Override
  public EDFDAsset.Matcher instantiate() {
    return EDFDAsset.Matcher.create();
  }

  @Override
  public EDFDAsset.Match newEmptyMatch() {
    return EDFDAsset.Match.newEmptyMatch();
  }

  @Override
  public EDFDAsset.Match newMatch(final Object... parameters) {
    return EDFDAsset.Match.newMatch((EDFD) parameters[0], (Asset) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link EDFDAsset} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EDFDAsset#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EDFDAsset INSTANCE = new EDFDAsset();

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
    private static final EDFDAsset.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_edfd = new PParameter("edfd", "org.secdfd.model.EDFD", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "EDFD")), PParameterDirection.INOUT);

    private final PParameter parameter_a = new PParameter("a", "org.secdfd.model.Asset", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Asset")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_edfd, parameter_a);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.EDFDAsset";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("edfd","a");
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
          PVariable var_edfd = body.getOrCreateVariableByName("edfd");
          PVariable var_a = body.getOrCreateVariableByName("a");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "EDFD")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_edfd, parameter_edfd),
             new ExportedParameter(body, var_a, parameter_a)
          ));
          // 	EDFD.asset(edfd, a)
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "EDFD")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "EDFD", "asset")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          new Equality(body, var__virtual_0_, var_a);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
