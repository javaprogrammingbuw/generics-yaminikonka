

public class Driver{
	public static void main(String[] args){
		// Node<Integer> node=new Node<>(4);
	    DLList <Integer> list=new DLList<>();
	    list.add(5);
	    list.add(7);
	    list.add(10);
	    list.add(11);
	    list.add(87);
	    list.add(21);
	    list.add(12);
	    list.add(9);
	    list.display();
	    System.out.println("the size of the list is: "+list.size());
	    System.out.println("the position of the value 21 in the list is: "+list.find(21));
	    System.out.println("the list after adding value at particular position: ");
	    list.add(2,32);
	    list.display();
	    System.out.println("the list after removing the value: ");
	    list.remove(10);
	    list.display();
	    boolean yam=list.contains(21);    // try with the any other elements, which are not present in the list;
        if(yam==true){
        	System.out.println("it is there in the list: \n");
        }else{
        	System.out.println("it is not there in the list: \n");
        }
        System.out.println("after removing the first node: ");
        list.removeFirst();
        list.display();
        System.out.println("removing the last node: ");
        list.removeLast();
        list.display();
        System.out.println("getting the firstnode value: "+list.getFirst().value);
        System.out.println("the size : "+ list.size()+"\n");
        System.out.println("getting the lastnode value: "+list.getLast().value+"\n");
        System.out.println("after clearing the list: ");
        list.clear();
        System.out.println("new list after clearing the past list: ");
        list.add(21);
        list.add(76);
        list.add(13);
        list.display();
		  
		  
	}
}