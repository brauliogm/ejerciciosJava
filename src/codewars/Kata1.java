package codewars;/*
* Tu objetivo en este kata es implementar una función de diferencia, que resta una lista
*  de otra y devuelve el resultado.

Debería eliminar todos los valores de la lista a, que están presentes en la lista
*  bmanteniendo su orden.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
*
*
Si un valor está presente en b, todas sus apariciones deben eliminarse del otro:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
* */

public class Kata1 {
    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here

        int v = 0;
        int extra;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] != b[j]){
                    v++;
                }
            }
        }

        int[] c = new int[v];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] != b[j]){
                    c[k] = a[i];
                    k++;
                }
            }
        }
        a = c;

        for (int ar :
             a) {
        System.out.println(ar);
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,2,3};
        int[] b = {1,2};

        arrayDiff(a,b);
    }
}
