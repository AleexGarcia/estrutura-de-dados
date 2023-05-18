package pilha;

import node.Node;

public class Pilha<T> {
	
	private Node<T> refTopNode;
	
	public Pilha() {
		this.refTopNode = null;
	}
	
	//emipilho um novo elemento, add no topo da pilha;
	public void push(T dado) {
		//1 - crio o novo nó
		Node<T> newNode = new Node<T>(dado);
		//2 - guardando a referencia de memoria do topo
		Node<T> lastTop = refTopNode;
		//3 - faço o antigo topo apontar para a referencia do novo nó
		refTopNode = newNode;
		//4 - Passo a refencia do topo para o nextNode;
		refTopNode.setNextNode(lastTop);
	}
	
	//retorna o elemento no topo da pilha
	public Node<T> top(){
		return refTopNode;
	}
	
	//exclui elemento no topo da pilha
	public Node<T> pop(){
		if(!this.isEmpty()) {
			// 1 - guardo a referencia do topo
			Node<T> nodeRemoved = refTopNode;
			// 2 - passo a referencia do nó abaixo
			refTopNode = refTopNode.getNextNode();
			// 3 - retorno o nó removido
			return nodeRemoved;
		}
		return null;
	}
	
	//verifica se está vazia
	public boolean isEmpty() {
		
		return refTopNode == null ? true : false;
	}

	@Override
	public String toString() {
		
		String retorno = "\n------------ PILHA -------------\n";
		Node<T> auxNode = refTopNode;
		while(true) {
			if(auxNode != null) {
				retorno += "[Node {data = "+ auxNode.getData() +"}]\n"; 
				auxNode = auxNode.getNextNode();
			}else {
				break;
			}
		}
		retorno += "==================================";
		return retorno;
		
	}
	
	
	
	
	
}
