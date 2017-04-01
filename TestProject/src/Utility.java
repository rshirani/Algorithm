import java.util.Vector;

public class Utility {

	public static int minDepth(Node<Integer> root){
		if(root == null)
		{
			return 0;
		}
		if(root.left == null && root.right == null)
		{
			return 1;
		}
		if(root.left == null)
		{
			return 1+minDepth(root.right);
		}
		if(root.right == null)
		{
			return 1+minDepth(root.left);
		}
		
		return Math.min(minDepth(root.left), minDepth(root.right));
	}
	
	public static Vector<Node<Integer>> minDepthNode(Node<Integer> root){
		if (root == null)
		{
			return new Vector<Node<Integer>>();
		}
		if (root.left == null && root.right == null)
		{
			Vector<Node<Integer>> nodes = new Vector<Node<Integer>>();
			nodes.add(root);
			return nodes;
		}
		Vector<Node<Integer>> result = new Vector<Node<Integer>>();
		
		if(root.left == nul\l)
		{
			result.addAll(minDepthNode(root.right));
			result.add(root);
			return result;
		}
		if(root.right == null)
		{
			result.addAll(minDepthNode(root.left));
			result.add(root);
			return result;
		}
		Vector<Node<Integer>> leftResult = minDepthNode(root.left);
		Vector<Node<Integer>> rightResult =	minDepthNode(root.right);
		if (leftResult.size() > rightResult.size())
		{
			 result.addAll(rightResult);
		}else{
			 result.addAll(leftResult);
		}
		result.add(root);
		return result;
	}
}
