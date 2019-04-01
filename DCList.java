

public class DCList<D>{

	// private Node<D> head;
	public Node<D> head;

	public boolean isEmpty() {

		if(head== null) { 

			return true;

		}

		return false;

	}



	public void display() {

		for(Node<D> i=head; i!= null; i=i.getNextNode()) {

			System.out.print("[" +i.getValue() + "]");

		}

		System.out.println();

	}



	public void add(int position, Node<D> Value) {

		if(Value != null && position<size() && position >=0) {

			if(position==0) {

				Value.setNextNode(head);

				head.setPreviousNode(Value);

				head = Value;

			} 

			Node<D> oldNode = get(position);

			//sets the next node of the previous node

			oldNode.getPreviousNode().setNextNode(Value);

			//set previous node of new node

			Value.setPreviousNode(oldNode.getPreviousNode());

			//change the previous node of the old node

			oldNode.setPreviousNode(Value);

			Value.setNextNode(oldNode);

			Value.position= position;

			for(Node<D> i =Value.getNextNode(); i!=null; i=i.getNextNode()) {

				i.position ++;

			}

		}

	}
	public void add(Node<D> Value) {

		int position = size();

		if(head != null) {

			Node<D> last = get(size()-1);

			last.setNextNode(Value);

			Value.setPreviousNode(last);

		}

		else {

			head = Value;

		}

		Value.position=position;

	}
	public void remove(Node<D> Value) {

		if(Value != null && Value.position>=0 && Value.position<size()-1  ) {

			Value.getNextNode().setPreviousNode(Value.getPreviousNode());

			Value.getPreviousNode().setNextNode(Value.getNextNode());

		}

	}
	public void removeFirst() {

		if(head != null) {

			if(size()>=2) {

				head = head.getNextNode();

				head.setPreviousNode(null);

			}

			else if(size() == 1) {

				clear();

			}

			else {

				System.out.println("Empty List");

			}

		}

	}
	public void removeLast() {

		if(size()>=2) {

			Node<D> c =get(size()-2);

			c.setNextNode(null);

		}

		else if(size()==1) {

			clear();

		}

		else{

			System.out.println("Empty List");

		}

	}
	public void clear() {

		head = null;

	}
	public Node<D> getFirst(){

		return head;

	}
	public Node<D> getLast(){

		return get(size()-1);

	}
	public Node<D> get(int position){

		Node<D> i = head;

		for( i=head; i!=null; i=i.getNextNode()) {

			if(i.position==position) {

				break;

			}

		}

		return i;

	}
	public int find(D value) {



		for( Node<D> i=head; i!=null; i=i.getNextNode()) {

			if(i.getValue()==value) {

				return i.position;

			}

		}

		return -1;

	}
	public boolean contains(D value) {

		for(Node<D> i=head; i!=null; i=i.getNextNode()) {

			if(i.getValue()==value) {

				return true;

			}

		}

		return false;

	}
	public int size() {

		int x=0;

		for(Node<D> i=head; i!=null; i=i.getNextNode()) {

			x++;

		}

		return x;		

	}

}