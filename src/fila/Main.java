package fila;

public class Main {
	public static void main(String[] args) {
		
		Fila<String> fila = new Fila<>();
		
		fila.enqueue("Alexandre");
		fila.enqueue("Amanda");
		fila.enqueue("Marcos Paulo");
		fila.enqueue("João Victor");
		fila.enqueue("Thaisy");
		fila.enqueue("Maria Julia");

		System.out.println(fila);
		
		fila.dequeue();
		fila.dequeue();
		System.out.println("\n=========================\n");
		System.out.println(fila);
		
		System.out.println(fila.first());
		
		

	}
}
