
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
    private BinaryTree<Association<String, String>> tree;

    @Before
    public void setUp() {
        // Asegúrate de inicializar el árbol con un valor no nulo.
        tree = new BinaryTree<>(new Association<>("house", "casa"));
    }

    @Test
    public void testInsertAndFind() {
        Association<String, String> toInsert = new Association<>("dog", "perro");
        tree.insert(toInsert);
        assertEquals(toInsert, tree.find(toInsert));
    }

    @Test
    public void testFindNonExistent() {
        Association<String, String> toFind = new Association<>("cat", null);
        assertNull(tree.find(toFind));
    }
}






