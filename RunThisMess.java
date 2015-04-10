public class RunThisMess {
	public static void main(String[] args) {
		Node root = new Node();
		while(true) {
			// Right side!
			Node rightChild = new Node();
			root.emplaceRight(rightChild);
			root.removeRight();
			root.emplaceRight(rightChild);
			root = root.randomizeTree();
			root.doTheHokeyPokey();
			root.turnAbout()
			this.whatItsAllAbout();

			// Left side!
			Node leftChild = new Node();
			root.emplaceLeft(leftChild);
			root.removeLeft();
			root.emplaceLeft(leftChild);
			root = root.randomizeTree();
			root.doTheHokeyPokey();
			root.turnAbout();
			this.whatItsAllAbout();
		}
	}

	public void whatItsAllAbout() {
		System.out.println("That's what it's all about!\n");
	}
}