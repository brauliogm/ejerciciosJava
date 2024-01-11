package codewars.resueltos;

public class ExclamationMarks {
    /*
    Remove n exclamation marks in the sentence from left to right. n is positive integer.

    Examples
    remove("Hi!",1) === "Hi"
    remove("Hi!",100) === "Hi"
    remove("Hi!!!",1) === "Hi!!"
    remove("Hi!!!",100) === "Hi"
    remove("!Hi",1) === "Hi"
    remove("!Hi!",1) === "Hi!"
    remove("!Hi!",100) === "Hi"
    remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
    remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
    remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
    remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"
     */

    public static void main(String[] args) {
        String cadena = "!!!Hi !!hi!!! !hi";

        System.out.println(remove(cadena,3));
    }

    public static String remove(String s, int n){
        String resultado = "";
        int contador = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!' && contador < n) {
                resultado += "";
                contador++;
            } else {
                resultado += s.charAt(i);
            }
        }

        return resultado;
    }
    //Listones
}
