import java.util.Vector;

public class Program {

	public static void main(String[] args){
		
		Node<Integer> root = new Node<Integer>(2,
				new Node<Integer>(3,
						new Node<Integer>(5,
								new Node<Integer>(13,
										new Node<Integer>(19),null),null),
						null),
				new Node<Integer>(4,
						new Node<Integer>(10,null,
								new Node<Integer>(11)),null));
		Vector<Node<Integer>> result = Utility.minDepthNode(root);
		System.out.println(result.size());
	}
}
