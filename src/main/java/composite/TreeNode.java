package composite;

import java.util.ArrayList;
import java.util.List;

/*
 * DESCRIPTION : 
 * USER : zhouhui
 * DATE : 2017/8/15 10:59
 */
public class TreeNode {

    private String nodeName;
    private TreeNode parentNode;
    private List<TreeNode> childNodeList;

    public TreeNode() {
    }

    /**
     * 提供传入节点名称的构造方法
     * @param nodeName
     */
    public TreeNode(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * 添加子节点
     * 1，把子节点挂到child上
     * 2，把子节点的父节点设置成本节点
     * @param childNode
     */
    public void addChildNode(TreeNode childNode){
        List<TreeNode> childTreeNodeList = this.getChildNodeList();
        if(childTreeNodeList == null){
            childTreeNodeList = new ArrayList<TreeNode>();
        }
        if(!childTreeNodeList.contains(childNode)){
            childTreeNodeList.add(childNode);
            this.setChildNodeList(childTreeNodeList);
        }

        if(childNode.getParentNode() != this){
            childNode.setParentNode(this);
        }
    }


    /**
     * 删除子节点
     * 1，把子节点删除
     * 2，把子节点的父节点设置成空
     * @param childNode
     */
    public void deleteChildNode(TreeNode childNode){
        List<TreeNode> childTreeNodeList = this.getChildNodeList();
        if(childTreeNodeList != null && childTreeNodeList.contains(childNode)){
            childTreeNodeList.remove(childNode);
            this.setChildNodeList(childTreeNodeList);
        }

        if(childNode.getParentNode() == this){
            childNode.setParentNode(null);
        }
    }


    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public TreeNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(TreeNode parentNode) {
        this.parentNode = parentNode;
        if(parentNode != null){
            List<TreeNode> parentChildTreeNodeList = parentNode.getChildNodeList();
            if(parentChildTreeNodeList == null){
                parentChildTreeNodeList = new ArrayList<TreeNode>();
            }
            if(!parentChildTreeNodeList.contains(this)){
                parentChildTreeNodeList.add(this);
                parentNode.setChildNodeList(parentChildTreeNodeList);
            }
        }
    }

    public List<TreeNode> getChildNodeList() {
        return childNodeList;
    }

    public void setChildNodeList(List<TreeNode> childNodeList) {
        this.childNodeList = childNodeList;
        if(childNodeList != null){
            for(TreeNode treeNode : childNodeList){
                if(treeNode.getParentNode() != this){
                    treeNode.setParentNode(this);
                }
            }
        }
    }
}
