package lista.encadeada;
import node.Node;

public class Lista<T> {
	String listName;
	Node<T> refList;
	
	public Lista(String listName) {
		this.listName = listName;
		refList = null;
	}
	
	public T remove(int index) {
		Node<T> pivotNode = getNodePosition(index);
		
		if(index == 0) {
			refList = pivotNode.getNextNode();
			return pivotNode.getData();
		}
	
		Node<T> previousNode = getNodePosition(index - 1);
		previousNode.setNextNode(pivotNode.getNextNode());
		
		return pivotNode.getData();
	}
	
	public T get(int index) {
		return getNodePosition(index).getData();
	}
	
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if(this.isEmpty()) {
			refList = newNode;
			return;
		}
		
		Node<T> auxNode = refList;
		for(int i = 0; i < this.size() - 1; i++) {
			auxNode = auxNode.getNextNode();
		}
		
		auxNode.setNextNode(newNode);
		
	}
	
	public int size() {
		int listSize = 0;
	
		Node<T> auxNode = new Node<>();
		auxNode = refList;
		
		while(true) {
			if(auxNode != null) {
				listSize++;
				if(auxNode.getNextNode() != null) {
					auxNode = auxNode.getNextNode();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		
		return listSize;
	}
	
	private Node<T> getNodePosition(int index ){
		validaIndice(index);
		Node<T> auxNode = refList;
		
		for(int i = 0; i < index; i++) {
			auxNode = auxNode.getNextNode();
		}
		
		return auxNode;
		
	}
	
	private void validaIndice(int index) {
		if(index >= size()) {
			throw new IndexOutOfBoundsException("Não existe conteudo no indice "+index+" desta lista.");
		}
	}
	
	public boolean isEmpty() {
		return refList == null ? true : false;
	}
	
	public String toString() {
		String strRetorno = "";
		Node<T> auxNode = refList;
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "Node{conteudo= " + auxNode.getData() + "}---->";
			auxNode = auxNode.getNextNode();
		}
		strRetorno += "null";
		
		return strRetorno;
	}
}
