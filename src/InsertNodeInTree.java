public class InsertNodeInTree {

    public Tree insertNodeInTree(Tree treeNode, int nodeCounter) {
        if(treeNode==null){
            treeNode=new Tree(nodeCounter);
        }else if(treeNode.value>nodeCounter){
            treeNode.left=insertNodeInTree(treeNode.left,nodeCounter);
        }else{
            treeNode.right=insertNodeInTree(treeNode.right,nodeCounter);
        }
        return treeNode;
    }
}
