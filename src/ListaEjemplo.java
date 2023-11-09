import java.util.ArrayList;
import java.util.List;

public class ListaEjemplo {
    public static void main(String[] args) {
        List frutas = new ArrayList<String>();

        frutas.add("Fresa");
        frutas.add("Naranja");
        frutas.add("Uva");

        imprimirLista(frutas);

        frutas.set(2,"Lima");

        System.out.println("Segunda impresion:");
        imprimirLista(frutas);

        frutas.remove(1);

        System.out.println("Segunda impresion:");
        imprimirLista(frutas);
    }

    private static void imprimirLista(List frutas) {
        for (Object fruta: frutas) {
            System.out.println(fruta);
        }
        System.out.println();
    }
}
