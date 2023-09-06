/**
 * lexer用grammar
 */

lexer grammar SampleLexer;

NUM
	: [0-9]+
	;

PLUS
	: '+'
	;

/**
 * 空白は読み飛ばす
 */
SPACE
	: ' ' -> skip
	;
