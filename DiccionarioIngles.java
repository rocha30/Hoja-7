import java.util.ArrayList;
import java.util.List;

public class DiccionarioIngles {
     private BinaryTree<Association<String, String>> dictionary;

    public DiccionarioIngles(BinaryTree<Association<String, String>> dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> getWordsInOrder() {
        List<String> wordsInOrder = new ArrayList<>();
        traverseInOrder(dictionary, wordsInOrder);
        return wordsInOrder;
    }

    private void traverseInOrder(BinaryTree<Association<String, String>> node, List<String> wordsInOrder) {
        if (node != null) {
            traverseInOrder(node.getLeftChild(), wordsInOrder);
            wordsInOrder.add(node.getValue().getKey());
            traverseInOrder(node.getRightChild(), wordsInOrder);
        }
    }
}
