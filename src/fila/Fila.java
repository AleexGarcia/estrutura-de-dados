package fila;
import node.Node;

public class Fila<T> {
	
	private Node<T> startQueou;
	
	public Fila(){
		this.startQueou = null;
	}
	
	public boolean isEmpty() {
		return startQueou == null ? true : false;
	}
	
	public void enqueue(T data) {
		
		Node<T> newNode = new Node<>(data);
		// 1 = novo nó aponto para a entrada da fila
		newNode.setNextNode(startQueou);
		// 2 - novo nó é o ultimo da fila
		startQueou = newNode;
		
	}
	
	public Node<T> first(){
		if(!isEmpty()) {
			Node<T> nodeAux = startQueou;
			while(true) {
				if(nodeAux.getNextNode() != null) {
					nodeAux = nodeAux.getNextNode();
				}else {
					break;
				}
			}
			return nodeAux;					
		}
		return null;
	}
	
	public Node<T> dequeue(){
		
		if(!isEmpty()) {
			Node<T> nodeAux = startQueou;
			Node<T> penult = startQueou;
			while(true) {
				if(nodeAux.getNextNode() != null) {
					penult = nodeAux;
					nodeAux = nodeAux.getNextNode();				
				}else {
					penult.setNextNode(null);
					break;
				}
			}
			return nodeAux;
		}
		
		return null;
	}

	@Override
	public String toString() {
		
		String retorno = "\n-------- FIM DA FILA ------\n";
		
		if(!isEmpty()) {
			Node<T> nodeAux = startQueou;
			while(true) {
				retorno += "\n[" + nodeAux.getData() +"]\n";
				if(nodeAux.getNextNode() != null) {
					nodeAux = nodeAux.getNextNode();
				}else {
					break;
				}
			}				
		}else {
			retorno += "null";
		}
		
		retorno += "\n------ INICIO DA FILA -------\n";
		return retorno;
		
	}
	
	
	
}

