package uas;

public class ProgramTreeNode {
    private int data;
    private ProgramTreeNode leftChild;
    private ProgramTreeNode rightChild;

    public ProgramTreeNode get(int value){
        if(value == data){
            return this;
        }

        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }
        else{
            if(rightChild != null){
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min(){
        if(leftChild == null){
            return data;
        }else{
            return leftChild.min();
        }
    }
    public int max(){
        if(rightChild == null){
            return data;
        }else{
            return rightChild.max();
        }
    }

    public void insert(int value){
        if(value == data){
            return;
        }

        if(value < data){
            if(leftChild == null){
                leftChild = new ProgramTreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild == null){
                rightChild = new ProgramTreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data + "," );
        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public ProgramTreeNode getLeftChild() {
        return leftChild;
    }

    public ProgramTreeNode(int data) {
        this.data = data;
    }

    public void setLeftChild(ProgramTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public ProgramTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(ProgramTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public String toString() {
        return "Data = " + data;
    }
}
