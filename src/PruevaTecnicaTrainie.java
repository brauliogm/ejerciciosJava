

public class PruevaTecnicaTrainie {
    public static void main(String[] args) {
        String[][] teatro = new String[10][10];
        teatro[5][5] = "X";

        impresionAsientos(teatro);

    }

    public static void impresionAsientos(String[][] teatro){
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
