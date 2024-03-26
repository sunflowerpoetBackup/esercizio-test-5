import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
Crea dei test per questo esercizio*/
public class Main {
    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        System.out.println("Risultato: " + math(dateString));
    }

    public static String math(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);

        dateTime = dateTime.plus(1, ChronoUnit.YEARS);

        dateTime = dateTime.minus(1, ChronoUnit.MONTHS);

        dateTime = dateTime.plus(7, ChronoUnit.DAYS);

        DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", new Locale("it", "IT"));
        return dateTime.format(italianFormatter);
    }
}