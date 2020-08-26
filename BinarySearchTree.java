import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;

	TreeNode(int data) {
		this.data = data;
	}
}

class BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(9);
		tree.insert(4);
		tree.insert(6);
		tree.insert(20);
		tree.insert(170);
		tree.insert(15);
		tree.insert(1);
		List<Integer> result = tree.breadthFirstSearch();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(tree.root);
		List<Integer> recursionResult = tree.breadthFirstSearchRecursive(queue, new ArrayList<Integer>());
		List<Integer> inorder = tree.depthFirstSearchInorder(tree.root, new ArrayList<Integer>());
		List<Integer> preOrder = tree.depthFirstSearchPreOrder(tree.root, new ArrayList<Integer>());
		List<Integer> postOrder = tree.depthFirstSearchPostOrder(tree.root, new ArrayList<Integer>());

		for (int b : postOrder)
			System.out.println(b);
	}

	TreeNode root;

	public boolean insert(int data) {
		TreeNode newNode = new TreeNode(data);

		if (root == null) {
			root = newNode;
			return true;
		} else {
			TreeNode currentNode = root;
			while (true) {
				if (currentNode.data > data) {
					// left
					if (currentNode.left == null) {
						currentNode.left = newNode;
						return true;
					}
					currentNode = currentNode.left;
				} else {
					// right
					if (currentNode.right == null) {
						currentNode.right = newNode;
						return true;
					}
					currentNode = currentNode.right;
				}

			}
		}

	}

	public TreeNode lookup(int data) {
		if (root == null || root.data == data) {
			return root;
		}

		TreeNode currentNode = root;
		while (currentNode != null) {
			if (currentNode.data < data) {
				currentNode = currentNode.right;
			} else if (currentNode.data > data) {
				currentNode = currentNode.left;
			} else if (currentNode.data == data) {
				return currentNode;
			}
		}
		return null;
	}

	public List<Integer> breadthFirstSearch() {
		TreeNode currentNode = root;
		List<Integer> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(currentNode);
		while (queue.size() > 0) {
			currentNode = queue.remove();
			list.add(currentNode.data);
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}

		}
		return list;
	}

	public List<Integer> breadthFirstSearchRecursive(Queue<TreeNode> queue, List<Integer> list) {

		if (queue.size() == 0) {
			return list;
		}

		TreeNode currentNode = queue.remove();
		list.add(currentNode.data);
		if (currentNode.left != null) {
			queue.add(currentNode.left);
		}
		if (currentNode.right != null) {
			queue.add(currentNode.right);
		}

		return breadthFirstSearchRecursive(queue, list);
	}

	public ArrayList<Integer> depthFirstSearchInorder(TreeNode node, ArrayList<Integer> list) {
		if (node.left != null) {
			depthFirstSearchInorder(node.left, list);
		}

		list.add(node.data);

		if (node.right != null) {
			depthFirstSearchInorder(node.right, list);
		}

		return list;
	}

	public ArrayList<Integer> depthFirstSearchPreOrder(TreeNode node, ArrayList<Integer> list) {
		list.add(node.data);
		if (node.left != null) {
			depthFirstSearchPreOrder(node.left, list);
		}
		if (node.right != null) {
			depthFirstSearchPreOrder(node.right, list);
		}

		return list;
	}

	public ArrayList<Integer> depthFirstSearchPostOrder(TreeNode node, ArrayList<Integer> list) {

		if (node.left != null) {
			depthFirstSearchPostOrder(node.left, list);
		}
		if (node.right != null) {
			depthFirstSearchPostOrder(node.right, list);
		}
		list.add(node.data);
		return list;
	}
}
