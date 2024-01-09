package codewars.resueltos;

public class AgeDiff {

    public static void main(String[] args) {
        int nacimiento = 1997;
        int anioActual = 1996;

        System.out.println(CalculateAge(nacimiento, anioActual));
    }

    public static String CalculateAge(int birth, int yearTo) {
        int diferencia = yearTo - birth;
        String mensaje = "";
        if (diferencia > 0){
            mensaje = "You are " + diferencia + " year" + (diferencia == 1 ? "" : "s") + " old.";
        } else if (diferencia < 0) {
            mensaje = "You will be born in " + (diferencia*(-1)) + " year" + (diferencia == -1 ? "" : "s") + ".";
        } else if (yearTo == birth){
            mensaje = "You were born this very year!";
        }
        return mensaje;
    }
    //Listones
}
