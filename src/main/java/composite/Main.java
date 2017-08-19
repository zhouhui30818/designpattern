package composite;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 11:00
 */
public class Main {

    /**
     * 组合模式，适用于tree类型的操作，有父节点/子节点，对节点的操作
     */
    public static void main(String[] args) {
        Tree tree = new Tree("root");

        TreeNode level1_1 = new TreeNode("1_1");
        TreeNode level1_2 = new TreeNode("1_2");

        TreeNode level1_1_1 = new TreeNode("1_1_1");
        TreeNode level1_1_2 = new TreeNode("1_1_2");

        level1_1.addChildNode(level1_1_1);
        level1_1.addChildNode(level1_1_2);

        tree.getRootNode().addChildNode(level1_1);
        tree.getRootNode().addChildNode(level1_2);

        tree.getRootNode().deleteChildNode(level1_2);

        tree.iterator();
    }
}
