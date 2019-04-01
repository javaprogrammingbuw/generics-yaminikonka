
public class Node<T>{
	protected T value;
	protected Node<T> previousNode;
	protected Node<T> nextNode;
	protected int position;
	// private DCList dclist;
	public Node(T value){
		this.value=value;
	}
	public void setNextNode(Node<T> nextNode){
         this.nextNode=nextNode;
	}
	public void setPreviousNode(Node<T> previousNode){
		this.previousNode=previousNode;
	}
	public Node<T> getNextNode(){
		return nextNode;
	}
	public Node<T> getPreviousNode(){
		return previousNode;
	}
	public T getValue(){
		return value;
	}
	public String toString(T value){
     return this.value.toString();
	}
}