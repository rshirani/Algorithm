
public class Node<T>
{
	T value;
	Node<T> left;
	Node<T> right;
	
	public Node(T value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	public Node(T value,Node<T> left,Node<T> right){
		this.value = value;
		this.right = right;
		this.left = left;
	}
	public String toString(){
		return this.value.toString();
	}
}
