/**
 * Created by rush on 8/10/16.
 */
public class Kata {

    public static  String explode(String str){
        int length = str.length()-1;
        String result = "";
        for (int i = 0; i <= length; i++){
            if (str.length() <= 1){
                return str;
            } else {
                result = result + str.charAt(i) + " ";
            }
        }
        return result.trim();
    }

    public static String notString(String str) {
        if (str.startsWith("not")){
            return str;
        }
        else {
            return "not " + str;
        }
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n+1, str.length());

        return front + back;
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);

    }
    public static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
    public static String front3(String str) {
        if (str.length() <= 3){
            return str + str + str;
        } else {
            String first = str.substring(0,3);

            return first + first + first;
        }
    }
    public static String front22(String str) {
        int thing = 2;
        if (thing > str.length()) {
            thing = str.length();
        }

        String front = str.substring(0, thing);
        return front + str + front;
    }
    public static String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {

            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }
    public static String startOz(String str) {
        String theEnd = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            theEnd = theEnd + str.charAt(0);
        } if (str.length() >= 2 && str.charAt(1)=='z') {
            theEnd = theEnd + str.charAt(1);
        } if (!(str.charAt(0)=='o') && !(str.charAt(1)=='z')){
            theEnd = str.substring(0,2);
        }
        return theEnd;
    }

    public static String endUp(String str){
        if (str.length() <= 3) return str.toUpperCase();
        int snip = str.length() - 3;
        String front = str.substring(0, snip);
        String back  = str.substring(snip);

        return front + back.toUpperCase();
    }


}
