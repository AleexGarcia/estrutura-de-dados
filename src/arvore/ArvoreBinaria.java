package arvore;

import node.BinNode;

public class ArvoreBinaria<T extends Comparable<T>> {
	private BinNode<T> root = null;

	public ArvoreBinaria() {
	};

	public void insert(T data) {
		BinNode<T> newNode = new BinNode<>(data);
		this.root = insert(this.root, newNode);
	}

	private BinNode<T> insert(BinNode<T> current, BinNode<T> newNode) {
		if (current == null) {
			return newNode;
		} else if (newNode.getData().compareTo(current.getData()) < 0) {
			current.setLeftNode(insert(current.getLeftNode(), newNode));
		} else {
			current.setRightNode(insert(current.getRightNode(), newNode));
		}

		return current;

	}

	public void exibirInOrdem() {
		System.out.println("\n \n Exibindo em InOrdem\n");
		exibirInOrdem(this.root);
	}

	private void exibirInOrdem(BinNode<T> current) {
		if (current != null) {
			exibirInOrdem(current.getLeftNode());
			System.out.print(current.getData() + ", ");
			exibirInOrdem(current.getRightNode());
		}
	}

	public void exibirPosOrdem() {
		System.out.println("\n\n Exibindo em PosOrdem\n");
		exibirPosOrdem(this.root);
	}

	private void exibirPosOrdem(BinNode<T> current) {
		if (current != null) {
			exibirPosOrdem(current.getLeftNode());
			exibirPosOrdem(current.getRightNode());
			System.out.print(current.getData() + ", ");
		}
	}

	public void exibirPreOrdem() {
		System.out.println("\n\n  Exibindo em PreOrdem\n");
		exibirPreOrdem(this.root);
	}

	private void exibirPreOrdem(BinNode<T> current) {
		if (current != null) {
			System.out.print(current.getData() + ", ");
			exibirPreOrdem(current.getLeftNode());
			exibirPreOrdem(current.getRightNode());
		}
	}

	public void remover(T data) {
		try {
			BinNode<T> atual = this.root;
			BinNode<T> pai = null;
			BinNode<T> filho = null;
			BinNode<T> temp = null;

			while (atual != null && !atual.getData().equals(data)) {
				pai = atual;
				if (data.compareTo(atual.getData()) < 0) {
					atual = atual.getLeftNode();
				} else {
					atual = atual.getRightNode();
				}
			}

			if (atual == null)
				System.out.println("Conteudo nao encontrado! Bloco Try.");

			if (pai == null) {
				if (atual.getRightNode() == null) {
					this.root = atual.getLeftNode();
				} else if (atual.getLeftNode() == null) {
					this.root = atual.getRightNode();
				} else {
					for (temp = atual, filho = atual.getLeftNode(); filho
							.getRightNode() != null; temp = filho, filho = filho.getLeftNode()) {
						if (filho != atual.getLeftNode()) {
							temp.setRightNode(filho.getLeftNode());
							filho.setLeftNode(root.getLeftNode());
						}
					}
					filho.setRightNode(root.getRightNode());
					this.root = filho;
				}
			} else if (atual.getRightNode() == null) {
				if (pai.getLeftNode() == atual) {
					pai.setLeftNode(atual.getLeftNode());
				} else {
					pai.setRightNode(atual.getLeftNode());
				}
			} else if (atual.getLeftNode() == null) {
				if (pai.getLeftNode() == atual) {
					pai.setLeftNode(atual.getRightNode());
				} else {
					pai.setRightNode(atual.getRightNode());
				}
			} else {
				for (temp = atual, filho = atual.getLeftNode(); filho
						.getRightNode() != null; temp = filho, filho = filho.getRightNode()) {
					if (filho != atual.getLeftNode()) {
						temp.setRightNode(filho.getLeftNode());
						filho.setLeftNode(atual.getLeftNode());
					}
					filho.setRightNode(atual.getRightNode());
					if (pai.getLeftNode() == atual) {
						pai.setLeftNode(filho);
					} else {
						pai.setRightNode(filho);
					}
				}
			}

		} catch (NullPointerException err) {
			System.out.println("Conteudo nao encontrado. Bloco Catch!");
		}
	}
}
