/**
 * Created by rush on 8/10/16.
 */
public class Main {
    public static void main(String[] args){

        //This is explode
        System.out.println("Kata.explode(\"dude\") -> \"" + Kata.explode("dude") + "\"");
        System.out.println("Kata.explode(\"this\") -> \"" + Kata.explode("this") + "\"");
        System.out.println("Kata.explode(\"duh\") -> \"" + Kata.explode("duh") + "\"");
        System.out.println("Kata.explode(\"yeah\") -> \"" + Kata.explode("yeah") + "\"");
        System.out.println("Kata.explode(\"duder\") -> \"" + Kata.explode("duder") + "\"");
        System.out.println("Kata.explode(\"dudeet\") -> \"" + Kata.explode("dudeet") + "\"");


        //This is the notString
        System.out.println("Kata.notString(\"candy\") -> " + Kata.notString("candy"));
        System.out.println("Kata.notString(\"x\") -> " + Kata.notString("x"));
        System.out.println("Kata.notString(\"notbad\") -> \"" + Kata.notString("notbad") + "\"");
        System.out.println("Kata.notString(\"notbad\") -> \"" + Kata.notString("nobad") + "\"");
        System.out.println("Kata.notString(\"notbad\") -> \"" + Kata.notString("bad not") + "\"");
        System.out.println("Kata.notString(\"notbad\") -> \"" + Kata.notString("noad") + "\"");


        //Missing Character
        System.out.println("Kata.missingChar(\"kitten\", 1) -> " + Kata.missingChar("kitten", 1) + "\"");
        System.out.println("Kata.missingChar(\"kitten\", 0) -> " + Kata.missingChar("kitten", 0) + "\"");
        System.out.println("Kata.missingChar(\"kitten\", 4) -> " + Kata.missingChar("kitten", 4) + "\"");
        System.out.println("Kata.missingChar(\"kitten\", 5) -> " + Kata.missingChar("kitten", 5) + "\"");
        System.out.println("Kata.missingChar(\"kitten\", 2) -> " + Kata.missingChar("kitten", 2) + "\"");
        System.out.println("Kata.missingChar(\"kitten\", 3) -> " + Kata.missingChar("kitten", 3) + "\"");

        //Front Back
        System.out.println("Kata.frontBack(\"code\") -> \"" + Kata.frontBack("code") + "\"");
        System.out.println("Kata.frontBack(\"a\") -> \"" + Kata.frontBack("a") + "\"");
        System.out.println("Kata.frontBack(\"ab\") -> \"" + Kata.frontBack("ab") + "\"");
        System.out.println("Kata.frontBack(\"rage\") -> \"" + Kata.frontBack("rage") + "\"");
        System.out.println("Kata.frontBack(\"sucks\") -> \"" + Kata.frontBack("sucks") + "\"");
        System.out.println("Kata.frontBack(\"bored\") -> \"" + Kata.frontBack("bored") + "\"");

        //Front Three
        System.out.println("Kata.front3(\"Java\") -> \"" + Kata.front3("Java") + "\"");
        System.out.println("Kata.front3(\"Chocolate\") -> \"" + Kata.front3("Chocolate") + "\"");
        System.out.println("Kata.front3(\"abc\") -> \"" + Kata.front3("abc") + "\"");
        System.out.println("Kata.front3(\"baava\") -> \"" + Kata.front3("baava") + "\"");
        System.out.println("Kata.front3(\"Choco\") -> \"" + Kata.front3("Choco") + "\"");
        System.out.println("Kata.front3(\"abcdcv\") -> \"" + Kata.front3("abcdcv") + "\"");

        //Back Around
        System.out.println("Kata.backAround(\"cat\") -> \"" + Kata.backAround("cat") + "\"");
        System.out.println("Kata.backAround(\"Hello\") -> \"" + Kata.backAround("Hello") + "\"");
        System.out.println("Kata.backAround(\"a\") -> \"" + Kata.backAround("a") + "\"");
        System.out.println("Kata.backAround(\"bat\") -> \"" + Kata.backAround("bat") + "\"");
        System.out.println("Kata.backAround(\"ello\") -> \"" + Kata.backAround("ello") + "\"");
        System.out.println("Kata.backAround(\"aba\") -> \"" + Kata.backAround("aba") + "\"");

        //Front 22
        System.out.println("Kata.front22(\"kitten\") -> \"" + Kata.front22("kitten") + "\"");
        System.out.println("Kata.front22(\"Ha\") -> \"" + Kata.front22("Ha") + "\"");
        System.out.println("Kata.front22(\"abc\") -> \"" + Kata.front22("abc") + "\"");
        System.out.println("Kata.front22(\"dude\") -> \"" + Kata.front22("dude") + "\"");
        System.out.println("Kata.front22(\"duder\") -> \"" + Kata.front22("duder") + "\"");
        System.out.println("Kata.front22(\"dudest\") -> \"" + Kata.front22("dudest") + "\"");

        //Delete Del
        System.out.println("Kata.delDel(\"adelbc\") -> \"" + Kata.delDel("adelbc") + "\"");
        System.out.println("Kata.delDel(\"adelHello\") -> \"" + Kata.delDel("adelHello") + "\"");
        System.out.println("Kata.delDel(\"adedbc\") -> \"" + Kata.delDel("adedbc") + "\"");
        System.out.println("Kata.delDel(\"akjklddelkmkmdela\") -> \"" + Kata.delDel("akjklddelkmkmdela") + "\"");
        System.out.println("Kata.delDel(\"adelbdelc\") -> \"" + Kata.delDel("adelbdelc") + "\"");
        System.out.println("Kata.delDel(\"deddebdekdei\") -> \"" + Kata.delDel("deddebdekdei") + "\"");

        //Start Oz
        System.out.println("Kata.startOz(\"ozymandias\") -> \"" + Kata.startOz("ozymandias") + "\"");
        System.out.println("Kata.startOz(\"bzoo\") -> \"" + Kata.startOz("bzoo") + "\"");
        System.out.println("Kata.startOz(\"oxx\") -> \"" + Kata.startOz("oxx") + "\"");
        System.out.println("Kata.startOz(\"kitten\") -> \"" + Kata.startOz("kitten") + "\"");
        System.out.println("Kata.startOz(\"ooood\") -> \"" + Kata.startOz("ooood") + "\"");
        System.out.println("Kata.startOz(\"asdf\") -> \"" + Kata.startOz("asdf") + "\"");
        System.out.println("Kata.startOz(\"dfww\") -> \"" + Kata.startOz("dfww") + "\"");

        /**End Up
        System.out.println(Kata. + "\"");
        System.out.println(Kata. + "\"");
        System.out.println(Kata. + "\"");
*/





    }
}
