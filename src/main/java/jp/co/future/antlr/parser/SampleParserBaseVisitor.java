// Generated from jp/co/future/antlr/parser/SampleParser.g4 by ANTLR 4.13.0
package jp.co.future.antlr.parser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link SampleParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class SampleParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements SampleParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSum(SampleParser.SumContext ctx) { return visitChildren(ctx); }
}