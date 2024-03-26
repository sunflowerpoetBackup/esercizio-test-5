import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class MainTest {
    String dateString = "2023-03-01T13:00:00Z";
    private Main dateManipulationExample= new Main();
    @Test
    void mainTest() {
        String risultato = dateManipulationExample.math(dateString);
        assertEquals("08 febbraio 2024 13:00:00", risultato);
    }
}
