package pilhas;

public class Main {
	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<>();
		
		pilha.push(198);
		pilha.push(14);
		pilha.push(12);
		pilha.push(125);
		pilha.push(165);
		pilha.push(10);
		
		System.out.println(pilha);
		
		pilha.pop();
		pilha.push(45);
		
		System.out.println(pilha);
	}
}
