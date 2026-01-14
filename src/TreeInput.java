import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeInput {
    Scanner sc = new Scanner(System.in);
    List<Integer> treeNodes=new ArrayList<>();
    void UserInput(){
        System.out.println("Are you ready, let me know yes or no");
        String userCommand = sc.nextLine();
        if(userCommand.equals("yes")){
            System.out.println("First tell me how many nodes are there in your tree");
            int nodeCounter = sc.nextInt();
            System.out.println("Now please give the per node value");
            CreateNodeList(nodeCounter,treeNodes);
        }else if(userCommand.equals("no")){
            System.out.println("Thanks for your reply, Bye");
        }
    }

    private void CreateNodeList(int nodeCounter, List<Integer> treeNodes) {
        for (int i = 0; i < nodeCounter; i++) {
            treeNodes.add(sc.nextInt());
        }
        BuildTree buildTree = new BuildTree();
        buildTree.createActualTree(treeNodes);
    }


}
