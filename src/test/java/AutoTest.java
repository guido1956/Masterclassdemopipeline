import junit.framework.TestCase;
import org.junit.Test;

public class AutoTest extends TestCase {
    @Test
    public void testKleur() {
        Auto auto = new Auto ("bla bla" , "Ford", "Pimpelpaars");
        String expectedResult = "Pimpelpaars";
        assertEquals("Kleur klopt niet", expectedResult, auto.getKleur());
    }

}