

public class PruevaTecnicaTrainie {
    public static void main(String[] args) {
        String[][] teatro = new String[10][10];
        teatro[0][0] = "X";

        for (int i = 0; i < teatro.length; i++) {
            System.out.print(0 + (i) +" ");
            for (int j = 0; j < teatro.length; j++) {
                if (i == 0){
                    System.out.print(j +" ");
                    System.out.println(" ");
                }
                teatro[i][j] = "O";
                System.out.print(teatro[i][j] + " ");
                if ( j == 9){
                    System.out.println(" ");
                }
            }
        }


    }


}
