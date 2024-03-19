import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AssociationTest {

    @Test
    public void testGetKey() {
        Association<String, String> association = new Association<>("house", "casa");
        assertEquals("The key should be 'house'.", "house", association.getKey());
    }

    @Test
    public void testGetValue() {
        Association<String, String> association = new Association<>("dog", "perro");
        assertEquals("The value should be 'perro'.", "perro", association.getValue());
    }
}