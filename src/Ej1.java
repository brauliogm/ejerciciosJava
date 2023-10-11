import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /* Una compañia de automoviles vende tres tipos de autos (a,b y c), y
        * cada uno uno tiene un precio de venta y un porcentaje de comision por venta
        * diferente. Elabore un programa que calcule el valor de las comisiones
        * que se deben de pagar a detarminado vendedor despues de haber recibido la
        * cantidad y el tipo de autos que vendio.
        *
        * Tenga en cuenta que:
        *
        * Comision por auto tipo A: $24
        * Comision por auto tipo B: $33
        * Comision por auto tipo C: $38*/

        Scanner sc = new Scanner(System.in);

        int A = 24;
        int aR;
        int B = 33;
        int bR;
        int C = 38;
        int cR;

        System.out.println("Cuantos autos vendio del tipo A?");
        aR = A * (sc.nextInt());

        System.out.println("Cuantos autos vendio del tipo B?");
        bR = B * (sc.nextInt());

        System.out.println("Cuantos autos vendio del tipo C?");
        cR = C * (sc.nextInt());

        System.out.println("La comision por los autos tipo A es de: " + aR);
        System.out.println("La comision por los autos tipo B es de: " + bR);
        System.out.println("La comision por los autos tipo C es de: " + cR);
        System.out.println("El total de comisiones es de: " + (aR + bR + cR));

    }
}
