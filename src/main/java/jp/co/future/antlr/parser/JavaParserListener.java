// Generated from jp/co/future/antlr/parser/JavaParser.g4 by ANTLR 4.13.0
package jp.co.future.antlr.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#otherToken}.
	 * @param ctx the parse tree
	 */
	void enterOtherToken(JavaParser.OtherTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#otherToken}.
	 * @param ctx the parse tree
	 */
	void exitOtherToken(JavaParser.OtherTokenContext ctx);
}