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
import org.secdfd.model.Element;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern EEandDSAssetElement(a: Asset, el: Element){
 *         	ExternalEntity.assets(el, a);
 *         } or {
 *         	DataStore.assets(el, a);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EEandDSAssetElement extends BaseGeneratedEMFQuerySpecification<EEandDSAssetElement.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.EEandDSAssetElement pattern,
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
    private Asset fA;

    private Element fEl;

    private static List<String> parameterNames = makeImmutableList("a", "el");

    private Match(final Asset pA, final Element pEl) {
      this.fA = pA;
      this.fEl = pEl;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "a": return this.fA;
          case "el": return this.fEl;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fA;
          case 1: return this.fEl;
          default: return null;
      }
    }

    public Asset getA() {
      return this.fA;
    }

    public Element getEl() {
      return this.fEl;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a".equals(parameterName) ) {
          this.fA = (Asset) newValue;
          return true;
      }
      if ("el".equals(parameterName) ) {
          this.fEl = (Element) newValue;
          return true;
      }
      return false;
    }

    public void setA(final Asset pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }

    public void setEl(final Element pEl) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEl = pEl;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.EEandDSAssetElement";
    }

    @Override
    public List<String> parameterNames() {
      return EEandDSAssetElement.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fA, fEl};
    }

    @Override
    public EEandDSAssetElement.Match toImmutable() {
      return isMutable() ? newMatch(fA, fEl) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
      result.append("\"el\"=" + prettyPrintValue(fEl));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fA, fEl);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EEandDSAssetElement.Match)) {
          EEandDSAssetElement.Match other = (EEandDSAssetElement.Match) obj;
          return Objects.equals(fA, other.fA) && Objects.equals(fEl, other.fEl);
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
    public EEandDSAssetElement specification() {
      return EEandDSAssetElement.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EEandDSAssetElement.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EEandDSAssetElement.Match newMutableMatch(final Asset pA, final Element pEl) {
      return new Mutable(pA, pEl);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EEandDSAssetElement.Match newMatch(final Asset pA, final Element pEl) {
      return new Immutable(pA, pEl);
    }

    private static final class Mutable extends EEandDSAssetElement.Match {
      Mutable(final Asset pA, final Element pEl) {
        super(pA, pEl);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends EEandDSAssetElement.Match {
      Immutable(final Asset pA, final Element pEl) {
        super(pA, pEl);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.EEandDSAssetElement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern EEandDSAssetElement(a: Asset, el: Element){
   * 	ExternalEntity.assets(el, a);
   * } or {
   * 	DataStore.assets(el, a);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see EEandDSAssetElement
   * 
   */
  public static class Matcher extends BaseMatcher<EEandDSAssetElement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EEandDSAssetElement.Matcher on(final ViatraQueryEngine engine) {
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
    public static EEandDSAssetElement.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_A = 0;

    private static final int POSITION_EL = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EEandDSAssetElement.Matcher.class);

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
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EEandDSAssetElement.Match> getAllMatches(final Asset pA, final Element pEl) {
      return rawStreamAllMatches(new Object[]{pA, pEl}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EEandDSAssetElement.Match> streamAllMatches(final Asset pA, final Element pEl) {
      return rawStreamAllMatches(new Object[]{pA, pEl});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EEandDSAssetElement.Match> getOneArbitraryMatch(final Asset pA, final Element pEl) {
      return rawGetOneArbitraryMatch(new Object[]{pA, pEl});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Asset pA, final Element pEl) {
      return rawHasMatch(new Object[]{pA, pEl});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Asset pA, final Element pEl) {
      return rawCountMatches(new Object[]{pA, pEl});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Asset pA, final Element pEl, final Consumer<? super EEandDSAssetElement.Match> processor) {
      rawForEachMatch(new Object[]{pA, pEl}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Asset pA, final Element pEl, final Consumer<? super EEandDSAssetElement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pA, pEl}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pEl the fixed value of pattern parameter el, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EEandDSAssetElement.Match newMatch(final Asset pA, final Element pEl) {
      return EEandDSAssetElement.Match.newMatch(pA, pEl);
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
    public Stream<Asset> streamAllValuesOfa(final EEandDSAssetElement.Match partialMatch) {
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
    public Stream<Asset> streamAllValuesOfa(final Element pEl) {
      return rawStreamAllValuesOfa(new Object[]{null, pEl});
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final EEandDSAssetElement.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final Element pEl) {
      return rawStreamAllValuesOfa(new Object[]{null, pEl}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Element> rawStreamAllValuesOfel(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EL, parameters).map(Element.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfel() {
      return rawStreamAllValuesOfel(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfel() {
      return rawStreamAllValuesOfel(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfel(final EEandDSAssetElement.Match partialMatch) {
      return rawStreamAllValuesOfel(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfel(final Asset pA) {
      return rawStreamAllValuesOfel(new Object[]{pA, null});
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfel(final EEandDSAssetElement.Match partialMatch) {
      return rawStreamAllValuesOfel(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for el.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfel(final Asset pA) {
      return rawStreamAllValuesOfel(new Object[]{pA, null}).collect(Collectors.toSet());
    }

    @Override
    protected EEandDSAssetElement.Match tupleToMatch(final Tuple t) {
      try {
          return EEandDSAssetElement.Match.newMatch((Asset) t.get(POSITION_A), (Element) t.get(POSITION_EL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected EEandDSAssetElement.Match arrayToMatch(final Object[] match) {
      try {
          return EEandDSAssetElement.Match.newMatch((Asset) match[POSITION_A], (Element) match[POSITION_EL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected EEandDSAssetElement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EEandDSAssetElement.Match.newMutableMatch((Asset) match[POSITION_A], (Element) match[POSITION_EL]);
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
    public static IQuerySpecification<EEandDSAssetElement.Matcher> querySpecification() {
      return EEandDSAssetElement.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.EEandDSAssetElement pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<EEandDSAssetElement.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pA the value of pattern parameter a in the currently processed match
     * @param pEl the value of pattern parameter el in the currently processed match
     * 
     */
    public abstract void accept(final Asset pA, final Element pEl);

    @Override
    public void accept(final EEandDSAssetElement.Match match) {
      accept(match.getA(), match.getEl());
    }
  }

  private EEandDSAssetElement() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EEandDSAssetElement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected EEandDSAssetElement.Matcher instantiate(final ViatraQueryEngine engine) {
    return EEandDSAssetElement.Matcher.on(engine);
  }

  @Override
  public EEandDSAssetElement.Matcher instantiate() {
    return EEandDSAssetElement.Matcher.create();
  }

  @Override
  public EEandDSAssetElement.Match newEmptyMatch() {
    return EEandDSAssetElement.Match.newEmptyMatch();
  }

  @Override
  public EEandDSAssetElement.Match newMatch(final Object... parameters) {
    return EEandDSAssetElement.Match.newMatch((Asset) parameters[0], (Element) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link EEandDSAssetElement} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EEandDSAssetElement#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EEandDSAssetElement INSTANCE = new EEandDSAssetElement();

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
    private static final EEandDSAssetElement.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_a = new PParameter("a", "org.secdfd.model.Asset", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Asset")), PParameterDirection.INOUT);

    private final PParameter parameter_el = new PParameter("el", "org.secdfd.model.Element", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Element")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_a, parameter_el);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.EEandDSAssetElement";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a","el");
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
          PVariable var_a = body.getOrCreateVariableByName("a");
          PVariable var_el = body.getOrCreateVariableByName("el");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_el), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Element")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a),
             new ExportedParameter(body, var_el, parameter_el)
          ));
          // 	ExternalEntity.assets(el, a)
          new TypeConstraint(body, Tuples.flatTupleOf(var_el), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "ExternalEntity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_el, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Element", "assets")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          new Equality(body, var__virtual_0_, var_a);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_a = body.getOrCreateVariableByName("a");
          PVariable var_el = body.getOrCreateVariableByName("el");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_el), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Element")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a),
             new ExportedParameter(body, var_el, parameter_el)
          ));
          // 	DataStore.assets(el, a)
          new TypeConstraint(body, Tuples.flatTupleOf(var_el), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "DataStore")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_el, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Element", "assets")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          new Equality(body, var__virtual_0_, var_a);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
