import java.util.List;
import java.util.Scanner;

public class BuildTree {

    Scanner sc = new Scanner(System.in);
    Tree treeNodeRoot = null;
    public void createActualTree(List<Integer> treeNodes) {
        System.out.println("Just see this is your current tree");
        System.out.println(treeNodes);
        for (Integer treeNode : treeNodes) {
            treeNodeRoot=buildTree(treeNodeRoot,treeNode);
        }
        System.out.println("Your BST is Created Successfully");
    }

    private Tree buildTree(Tree treeNodeRoot, Integer treeNode) {
        if(treeNodeRoot==null){
           return new Tree(treeNode);
        }else if(treeNodeRoot.value>treeNode){
            treeNodeRoot.left=buildTree(treeNodeRoot.left,treeNode);
        }else if(treeNodeRoot.value<treeNode){
            treeNodeRoot.right=buildTree(treeNodeRoot.right,treeNode);
        }
        return treeNodeRoot;
    }

    public void insertNode() {
        System.out.println("Do you want to insert a new node? (yes/no)");
        String userCommand = sc.nextLine();

        if (userCommand.equalsIgnoreCase("yes")) {
            System.out.println("Enter the value to insert:");
            int value = sc.nextInt();
            sc.nextLine();

            InsertNodeInTree insertNodeInTree = new InsertNodeInTree();
            treeNodeRoot = insertNodeInTree.insertNodeInTree(treeNodeRoot, value);
        }
    }
}
