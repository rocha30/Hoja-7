
/**
 * Clase para representar un árbol binario de búsqueda genérico.
 * Puede almacenar valores de cualquier tipo que sea Comparable.
 *
 * @param <E> Tipo de elementos que el árbol puede almacenar, debe ser Comparable.
 */
public class BinaryTree<E extends Comparable<E>> {
    private Association<String, String> value;
    private BinaryTree<Association<String, String>> leftChild;
    private BinaryTree<Association<String, String>> rightChild;

    /**
     * Constructor para crear un nodo de árbol binario con un valor dado.
     *
     * @param value El valor del nodo del árbol binario.
     */
    public BinaryTree(Association<String, String> value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    /**
     * Constructor sin argumentos que crea un árbol binario vacío.
     */
    public BinaryTree() {
        this.value = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    /**
     * Inserta un nuevo valor en el árbol binario de búsqueda.
     *
     * @param newValue El nuevo valor para insertar en el árbol.
     */
    public void insert(Association<String, String> newValue) {
        if (this.value == null) {
            this.value = newValue;
        } else {
            if (newValue.compareTo(this.value) < 0) {
                if (this.leftChild == null) {
                    this.leftChild = new BinaryTree<>(newValue);
                } else {
                    this.leftChild.insert(newValue);
                }
            } else if (newValue.compareTo(this.value) > 0) {
                if (this.rightChild == null) {
                    this.rightChild = new BinaryTree<>(newValue);
                } else {
                    this.rightChild.insert(newValue);
                }
            }
        }
    }

    /**
     * Busca un valor en el árbol binario de búsqueda y devuelve el nodo donde se encuentra.
     *
     * @param valueToFind El valor a buscar en el árbol.
     * @return El nodo encontrado, o null si el valor no se encuentra en el árbol.
     */
    public Association<String, String> find(Comparable<Association<String, String>> valueToFind) {
        if (valueToFind.compareTo(this.value) == 0) {
            return this.value;
        } else if (valueToFind.compareTo(this.value) < 0 && this.leftChild != null) {
            return this.leftChild.find(valueToFind);
        } else if (valueToFind.compareTo(this.value) > 0 && this.rightChild != null) {
            return this.rightChild.find(valueToFind);
        }
        return null;
    }

    /**
     * Realiza un recorrido inOrder del árbol binario y muestra los valores de los nodos.
     */
    public void inOrderTraversal() {
        if (this.leftChild != null) {
            this.leftChild.inOrderTraversal();
        }
        System.out.println(this.value);
        if (this.rightChild != null) {
            this.rightChild.inOrderTraversal();
        }
    }

    public BinaryTree<Association<String, String>> getLeftChild() {
       return this.leftChild;
    }

    public Association<String, String> getValue() {
        return this.value;
    }

    public BinaryTree<Association<String, String>> getRightChild() {
        return this.rightChild;
    }
}

