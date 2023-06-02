package node;

public class DoubleNode<T> {
	private T data;
	private DoubleNode<T> nextNode = null;
	private DoubleNode<T> previousNode = null;
	public DoubleNode(){
		
	}
	
	public DoubleNode( T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DoubleNode<T> getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(DoubleNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public DoubleNode<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleNode<T> previousNode) {
		this.previousNode = previousNode;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	
	
}
