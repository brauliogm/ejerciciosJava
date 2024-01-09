package codewars;

public class DoubleChar {
    /*
    Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

    Examples (Input -> Output):
    * "String"      -> "SSttrriinngg"
    * "Hello World" -> "HHeelllloo  WWoorrlldd"
    * "1234!_ "     -> "11223344!!__  "
     */

    public static void main(String[] args) {
        String s = "hola!";

        System.out.println(doubleChar(s));
    }

    public static String doubleChar(String s){
        String resultado = "";
        for (int i = 0; i < s.length(); i++) {
            resultado += "" + s.charAt(i) + s.charAt(i);
            //System.out.println("" + s.charAt(i) + s.charAt(i));
        }
        return resultado;
    }
    //Listones
}
