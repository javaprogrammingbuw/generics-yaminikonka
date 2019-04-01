

public class Driver{
	public static void main(String[] args){
		Node<Integer> node=new Node<>(4);
	    DCList <Integer> list=new DCList<>();
		  list.add(new Node<>(6));
		  list.add(new Node<>(3));
		  list.add(new Node<>(21));
		  list.display();
		  list.removeFirst();
		  list.removeLast();
		  list.find(6);
		  list.contains(21);
		  list.clear();
		  
		  
	}
}