package composite;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 10:59
 */
public class Tree {

    private TreeNode rootNode;

    public Tree() {
    }

    public Tree(String rootNodeName) {
        this.rootNode = new TreeNode(rootNodeName);
    }

    public void iterator(){
        recursion(this.rootNode);
    }

    private void recursion(TreeNode node){
        if(node != null){
            System.out.println(node.getNodeName() + (node.getParentNode() == null ? "" : (" --> " + node.getParentNode().getNodeName())));
            if(node.getChildNodeList() != null && !node.getChildNodeList().isEmpty()){
                for(TreeNode node1 : node.getChildNodeList()){
                    recursion(node1);
                }
            }
        }
    }

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(TreeNode rootNode) {
        this.rootNode = rootNode;
    }
}
