import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class BinaryTree {
    
    /**
     * InnerBinaryTree
     */
    
    InnerBinaryTree tree = null; 

    class InnerBinaryTree {
        int data = 0;
        InnerBinaryTree left = null;
        InnerBinaryTree right = null;
    }

    public void create(int data) {
        InnerBinaryTree node = new InnerBinaryTree();
        node.data = data;
        tree = node;
    }

    public static void main(String[] args) throws IOException{
        BinaryTree tree = new BinaryTree();
        tree.create(10);
        System.out.println(tree.tree.data);

        // bufferReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] input = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        



    }

}