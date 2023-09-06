

package jp.co.future.antlr;
import jp.co.future.antlr.parser.CommentStatementListener;
import jp.co.future.antlr.parser.JavaLexer;
import jp.co.future.antlr.parser.JavaParser;
import jp.co.future.antlr.parser.JavaParserListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.CodePointCharStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        CharStream input = CharStreams.fromFileName("src/sample.java");// ファイル名を指定して入力を読み込む
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTreeWalker walker = ParseTreeWalker.DEFAULT;
        CommentStatementListener listener = new CommentStatementListener();
        walker.walk(listener, parser.statement());
        System.out.println(listener.getComment());






//
//        // On-channel elements output
//        System.out.println("-----on channel---------------");
//
//        while (!tokens.LT(i).getText().equals("<EOF>")) {
//            System.out.println("tokens[" + i + "]= " + tokens.LT(i).getText());
//            System.out.println("tokens[" + i + "]= " + tokens.LT(i).getText());
//            i++;
//        }
//
//        // Hidden-channel elements output
//        System.out.println("-----Hidden channel---------------");
//        i = 0;
//        while (!tokens.get(i).getText().equals("<EOF>")) {
//            Token t = tokens.get(i);
//            if (t.getChannel() == JavaLexer.COMMENT) {
//                System.out.println("tokens[" + i + "]= " + tokens.get(i).getText());
//
//            }
//            i++;
//        }
//
//        int targetLine = 3; // 取得したい行の行番号（例: 3行目）


    }

//    public static void extractScriptBlock() throws IOException {
//        JavaParserListener listener = new JavaParserListener();
//        listener.exec("src/main/resources/input.vue");
//        System.out.println(listener.getScriptBody());
//    }
}

