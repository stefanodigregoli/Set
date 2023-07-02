import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Set<String>giorniDellaSettimana = new HashSet();
        giorniDellaSettimana.add(" Lunedi ");
        giorniDellaSettimana.add(" Martedi ");
        giorniDellaSettimana.add(" Mercoledi ");
        giorniDellaSettimana.add(" Giovedi ");
        giorniDellaSettimana.add(" Venerdi ");
        giorniDellaSettimana.add(" Sabato ");
        giorniDellaSettimana.add(" Domenica ");
        System.out.println(" HashSet: " + giorniDellaSettimana);

        Set<String>ordineGiorniDellaSettimana = new LinkedHashSet<>(giorniDellaSettimana);
        System.out.println("LinkedHashSet: " + ordineGiorniDellaSettimana);
        System.out.println("New Set: " + ordineGiorniDellaSettimana);

        System.out.println(" Is the first Set equal to the second one? " + giorniDellaSettimana.equals(ordineGiorniDellaSettimana));



    }
}