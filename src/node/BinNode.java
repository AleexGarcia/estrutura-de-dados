package node;

public class BinNode<T extends Comparable<T>>  {
	
	private T data;
	private BinNode<T> leftNode = null;
	private BinNode<T> rightNode = null;
	
	public BinNode(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public BinNode<T> getLeftNode() {
		return leftNode;
	}
	
	public void setLeftNode(BinNode<T> leftNode) {
		this.leftNode = leftNode;
	}
	
	public BinNode<T> getRightNode() {
		return rightNode;
	}
	
	public void setRightNode(BinNode<T> rightNode) {
		this.rightNode = rightNode;
	}
	
	

	@Override
	public String toString() {
		return "BinNode [data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
	}

	
}
