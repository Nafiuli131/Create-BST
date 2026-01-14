import java.util.List;

public class BuildTree {

    Tree treeNodeRoot = null;
    public void createActualTree(List<Integer> treeNodes) {
        System.out.println("Just see this is your current tree");
        System.out.println(treeNodes);
        for (Integer treeNode : treeNodes) {
            treeNodeRoot=buildTree(treeNodeRoot,treeNode);
        }
        ShowBST showBST = new ShowBST();
        showBST.showBSTByBFS(treeNodeRoot);
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
}
