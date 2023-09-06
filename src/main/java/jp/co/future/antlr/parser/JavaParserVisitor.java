// Generated from jp/co/future/antlr/parser/JavaParser.g4 by ANTLR 4.13.0
package jp.co.future.antlr.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaParser#otherToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherToken(JavaParser.OtherTokenContext ctx);
}