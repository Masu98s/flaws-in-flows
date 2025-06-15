/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph.util;

import edfdtosimplegraph.GraphMatch;
import graph.Graph;
import java.util.function.Consumer;

/**
 * A match processor tailored for the edfdtosimplegraph.Graph pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class GraphProcessor implements Consumer<GraphMatch> {

    /**
     * Action executed for every pattern match.
     *
     * @param g value of pattern parameter {@code g}
     */
    public abstract void process(Graph g);

    /** Delegates the Consumer interface to the {@link #process(Graph)} method. */
    @Override
    public final void accept(GraphMatch match) {
        process(match.getG());
    }
}
