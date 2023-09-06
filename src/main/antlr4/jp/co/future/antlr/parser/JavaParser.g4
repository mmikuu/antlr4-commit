parser grammar JavaParser;

options { tokenVocab=JavaLexer; }

statement: LINE_COMMENT
         | BLOCK_COMMENT
         ;

otherToken: . ; // 通常のトークン（コメント以外）を表すルール
