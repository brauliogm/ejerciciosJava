import java.util.Scanner;

public class PruevaTecnicaTrainie {
    public static void main(String[] args) {
        String[][] teatro = new String[10][10];
        Scanner sc = new Scanner(System.in);
        boolean ocupado = true;

        teatro[5][6] = "X";

        impresionAsientos(teatro);

        pedirAsiento(teatro, sc, ocupado);

        impresionAsientos(teatro);

    }

    private static void pedirAsiento(String[][] teatro, Scanner sc, boolean ocupado) {
        while (ocupado == true){
            System.out.println("Escoja que asiento quiere indicando las coordenadas segun su");
            try {
            System.out.println("\"Fila\" (vertical)");
            int fila = sc.nextInt();
            System.out.println("\"Asiento\" (horizontal)");
            int asiento = sc.nextInt();
            if (teatro[fila][asiento] == "X"){
                System.out.println("Asiento ocupado, escoja otro.");
            }else{
                teatro[fila][asiento] = "X";
                ocupado = false;
            }
            } catch (Exception e){
                System.out.println("Numero de asiento invalido");
            }
        }
    }

    public static void impresionAsientos(String[][] teatro){
        System.out.println("Asientos disponibles");
        System.out.println(" *****ESCENARIO*****");
        System.out.print("T ");
        for (int k = 0; k < 10; k++) {
            System.out.print(k + " ");
        }

        System.out.println(" ");
        for (int i = 0; i < teatro.length; i++) {
            System.out.print(0 + (i) +" ");
            for (int j = 0; j < teatro.length; j++) {
                if (teatro[i][j] == null ){
                    teatro[i][j] ="L";
                }
                System.out.print(teatro[i][j] + " ");
                if ( j == 9){
                    System.out.println(" ");
                }
            }
        }
    }
}
