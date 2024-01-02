import java.util.Scanner;

public class CadenaAlReves {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        String nuevaCadena = "";
        int i = cadena.length() - 1;

        for (int j = cadena.length() - 1; j >= 0; j--) {
            nuevaCadena += cadena.charAt(j);
            System.out.println(cadena.charAt(j));
        }

        while (i >= 0){
            nuevaCadena += cadena.charAt(i);
            System.out.println(cadena.charAt(i));
            i--;
        }

        System.out.println(nuevaCadena);
        System.out.println(cadena);

    }
}
