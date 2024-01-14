package codewars.resueltos;

import java.sql.Array;

public class NumberToReversed {
    /*
    Convert number to reversed array of digits
    Given a random non-negative number, you have to return the digits of this
    number within an array in reverse order.

    Example(Input => Output):
    35231 => [1,3,2,5,3]
    0 => [0]
     */
    public static void main(String[] args) {
        int num = 35231;

        int[] nuevoArray = digitize(num);
        for (int numero: nuevoArray) {
            System.out.println(numero);
        }

    }

    public static int[] digitize(long n) {
        String numero = "" + n;
        int[] array = new int[numero.length()];
        int[] nuevoArray = new int[numero.length()];

        for (int i = 0; i < numero.length(); i++) {
            int numInt = Integer.parseInt(Character.toString(numero.charAt(i)));
            array[i] = numInt;
        }

        int j = numero.length()-1;
        int i = 0;

        while (j >= 0){
            nuevoArray[i] = array[j];
            j--;
            i++;
        }

        return nuevoArray;
    }
    //listones
}
