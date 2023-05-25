package lista.encadeada;

public class Main {
	public static void main(String[] args) {
		Lista<String> ml = new Lista<>("Minha Lista");
		ml.add("Alexandre");
		ml.add("Augusto");
		ml.add("Garcia");
		System.out.println(ml);
		System.out.println(ml.get(1));
		ml.remove(1);
		System.out.println(ml);
	}
}
