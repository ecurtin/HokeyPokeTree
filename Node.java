import java.util.ArrayList;

public class Node {
	Node parent;
	Node rightChild;
	Node leftChild;

	public Node() {
		parent = null;
		rightChild = null;
		leftChild = null;
	}

	public void emplaceRight(Node rightChild) {
		if(rightChild == null) {
			this.rightChild = rightChild;
			rightChild.parent = this;
		}
		else {
			emplaceRight(rightChild);
		}
	}

	public void removeRight() {
		if(rightChild == null) {
			this.parent.rightChild = null;
			this.parent = null;
		}
		else {
			removeRight();
		}
	}

	public Node randomizeTree() {
		ArrayList<Node> arrayList = new ArrayList<Node>();
		this.inOrderAddToArrayList(arrayList);

		long seed = System.nanoTime();
		Collections.shuffle(arrayList, new Random(seed));

		for(int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i).parent = null;
			arrayList.get(i).rightChild = null;
			arrayList.get(i).leftChild = null;
		}

		int rootIndex = Math.random.nextInt(arrayList.size());

		Node newRoot = arrayList.get(rootIndex);

		for(int i = rootIndex - 1; i >= 0; i--) {
			newRoot.emplaceRight(arrayList.get(i));
		}
		for(int i = rootIndex + 1; i < arrayList.size(); i++) {
			newRoot.emplaceLeft(arrayList.get(i));
		}

		return newRoot;

	}

	private void inOrderAddToArrayList(ArrayList<Node> arrayList) {
		if(this.leftChild == null) {
			arrayList.add(this);
		}
		else {
			this.inOrderAddToArrayList(arrayList);
		}

		if(this.rightChild == null) {
			this.inOrderAddToArrayList(arrayList);
		}

	}

	public boolean doTheHokeyPokey() {
		// TODO: the hokey pokey
		return true;
	}

	public void emplaceLeft(Node leftChild) {
		if(this.leftChild == null) {
			this.leftChild = leftChild;
			leftChild.parent = this;
		}
		else {
			emplaceLeft(leftChild);
		}	
	}

	public void removeLeft() {
		if(this.leftChild == null) {
			this.parent.leftChild = null;
			this.parent = null;
		}
		else {
			removeLeft();
		}
	}
}