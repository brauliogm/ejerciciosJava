import java.util.Scanner;

public class PruevaTecnicaTrainie {
    public static void main(String[] args) {
        String[][] teatro = new String[10][10];
        Scanner sc = new Scanner(System.in);
        boolean ocupado = true;
        int opcion = 0;

        teatro[5][6] = "X";
        impresionAsientos(teatro);


        opcion = menuOpciones(sc, opcion);
        while (opcion != 3){

            switch (opcion){
                case 1:
                    reservarAsiento(teatro, sc, ocupado);
                    opcion = menuOpciones(sc, opcion);
                    break;
                case 2:
                    impresionAsientos(teatro);
                    opcion = menuOpciones(sc, opcion);
                    break;
                default:
                    System.out.println("Opcion invalida, prueve con otra");
                    opcion = menuOpciones(sc, opcion);
                    break;
            }
            if (opcion == 3){
                System.out.println("Que le vaya bien.");
            }

        }



    }

    private static int menuOpciones(Scanner sc, int opcion){
        if (opcion == 1 || opcion == 2){
            System.out.println("Escoja otra opcion");
        }
        System.out.println("Que accion desea realizar: \n" +
                "1 -> Reservar un asiento\n" +
                "2 -> Mostrar filas disponibles\n" +
                "3 -> Salir del programa y pasar al teatro");
        opcion = sc.nextInt();
        return opcion;
    }

    private static void reservarAsiento(String[][] teatro, Scanner sc, boolean ocupado) {
        while (ocupado == true){
            System.out.println("Escoja que asiento quiere indicando las coordenadas segun su");
            try {
                System.out.println("\"Fila\" (vertical)");
                int fila = sc.nextInt();
                System.out.println("\"Asiento\" (horizontal)");
                int asiento = sc.nextInt();
                if ( teatro[fila][asiento].equals("X") ){
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

        System.out.println("");
        for (int i = 0; i < teatro.length; i++) {
            System.out.print(0 + (i) +" ");
            for (int j = 0; j < teatro.length; j++) {
                if (teatro[i][j] == null ){
                    teatro[i][j] ="L";
                }
                System.out.print(teatro[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
