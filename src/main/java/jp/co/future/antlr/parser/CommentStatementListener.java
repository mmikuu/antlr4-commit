package jp.co.future.antlr.parser;
import jp.co.future.antlr.parser.JavaParser;
import jp.co.future.antlr.parser.JavaParserBaseListener;

import java.util.ArrayList;
import java.util.List;

public class CommentStatementListener extends JavaParserBaseListener {

    List<String> Comment = new ArrayList<String>();
    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
        System.out.println(ctx.BLOCK_COMMENT());
        System.out.println(ctx.LINE_COMMENT());
        System.out.println("getRuleIndex: "+ctx.getRuleIndex());
        if (ctx.getRuleIndex()==0) {
            System.out.println("  getLine: "+ctx.getStart().getLine());
            setComment(new String(ctx.getText()),new Integer(ctx.getStart().getLine()));
        }

    }

    public List<String> getComment() {
        return Comment;
    }

    public void setComment(String comment,Integer line){
        this.Comment.add(String.valueOf(line)+':'+comment);
    }
}

