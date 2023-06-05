package arvore;

import arvore.model.Obj;

public class Main {
	public static void main(String[] args) {
		ArvoreBinaria<Obj> mA = new ArvoreBinaria<>();
		
		mA.insert(new Obj(13));
		mA.insert(new Obj(10));
		mA.insert(new Obj(25));
		mA.insert(new Obj(2));
		mA.insert(new Obj(12));
		mA.insert(new Obj(20));
		mA.insert(new Obj(29));
		mA.insert(new Obj(31));

		mA.exibirInOrdem();
		mA.exibirPreOrdem();
		mA.exibirPosOrdem();

	}
}
