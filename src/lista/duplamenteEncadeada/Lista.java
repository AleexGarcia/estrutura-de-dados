package lista.duplamenteEncadeada;
import node.DoubleNode;
public class Lista<T> {
	private DoubleNode<T> firstNode;
	private DoubleNode<T> lastNode;
	private int sizeList = 0;
	
	Lista(){
	
	}
	
	public void add(T data) {
		DoubleNode<T> newNode = new DoubleNode<>(data);
		newNode.setNextNode(null);
		newNode.setPreviousNode(lastNode);
		if(firstNode == null) {
			firstNode = newNode;
		}
		if(lastNode != null) {
			lastNode.setNextNode(newNode);
		}
		lastNode = newNode;
		sizeList++;
	}
	
	public void add(int index, T data ) {
		DoubleNode<T> auxNode = getNode(index);
		DoubleNode<T> newNode = new DoubleNode<>(data);
		newNode.setNextNode(auxNode);
		
		if(newNode.getNextNode() != null) {
			newNode.setPreviousNode(auxNode.getPreviousNode());
			newNode.getNextNode().setPreviousNode(newNode);
		}else {
			newNode.setPreviousNode(lastNode);
			lastNode = newNode;
		}
		if(index == 0) {
			firstNode = newNode;
		}else {
			newNode.getPreviousNode().setNextNode(newNode);
		}
		sizeList++;
	}
	
	public T get(int index) {
		return this.getNode(index).getData();	
	}
	
	private DoubleNode<T> getNode(int index) {
		DoubleNode<T> auxNode = firstNode;
		
		for(int i= 0; (i < index)&&(auxNode != null);i++) {
			auxNode = auxNode.getNextNode();
		}
		return auxNode;
		
	}
	
	public void remove(int index){
        if(index == 0){
            firstNode = firstNode.getNextNode();
            if(firstNode != null){
            	firstNode.setPreviousNode(null);
            }
        }else{
            DoubleNode<T> auxNode = getNode(index);
            auxNode.getPreviousNode().setNextNode(auxNode.getNextNode());
            if(auxNode != lastNode){
            	auxNode.getNextNode().setNextNode(auxNode.getPreviousNode());
            }else{
                lastNode = auxNode;
            }
        }
        sizeList--;
    }
	
	public int size() {
		return this.sizeList;
	}
	
	public boolean isEmpty() {
		return this.sizeList == 0 ? true : false;
	}
	
	public String toString() {
        String strRetorno = "";
        DoubleNode<T> auxNode = firstNode;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + auxNode.getData() +"}]--->";
            auxNode = auxNode.getNextNode();
        }
        strRetorno += "null";
        return strRetorno;
    }
	
}
