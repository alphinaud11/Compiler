// Generated from C:/Users/Helmy/IdeaProjects/Task9/src/csen1002/main/task9\Task9.g4 by ANTLR 4.10.1
package csen1002.main.task9;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link Task9Visitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class Task9BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements Task9Visitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitS(Task9Parser.SContext ctx) { return visitChildren(ctx); }
}