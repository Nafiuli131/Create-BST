import java.util.ArrayList;
import java.util.List;

public class ShowBST {

    List<Integer> showBFSTree = new ArrayList<>();
    public void showBSTByBFS(Tree treeNodeRoot) {
        showTree(treeNodeRoot);
        System.out.println("Now see the tree ");
        System.out.println(showBFSTree);
    }

    private void showTree(Tree treeNodeRoot) {
        if(showBFSTree.isEmpty()){
            showBFSTree.add(treeNodeRoot.value);
        }else{
            if(treeNodeRoot.left!=null){
                showBFSTree.add(treeNodeRoot.left.value);
                showTree(treeNodeRoot.left);
            }else if(treeNodeRoot.right!=null){
                showBFSTree.add(treeNodeRoot.right.value);
                showTree(treeNodeRoot.right);
            }
        }
    }
}
