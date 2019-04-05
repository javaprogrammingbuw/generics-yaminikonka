

public class DLList<D>{
     private Node<D> head;
     // private Node<T> next;
  // public DCList(Node<T> head, Node<T> next){
  // 	this.head=head;
  // 	this.next=next;
  // } 
     public DLList(){
     // 	head.previousNode = null;
        // head.position = 0;
        head = null;
     }
    public boolean isEmpty(){
    	if(head==null){
    		return true;
    	}else{
    		return false;
    	}
    }
    public void display(){
        Node<D> current = head;
        while(current!=null){
            System.out.println("["+ current.position + "]" +current.getValue());
            current = current.getNextNode();
        }
        // /System.out.println(current.getValue());
    }
    public void add(int position,D value){
        Node<D> current = new Node<>(value);
    

            if(position==0) {

                current.setNextNode(head);

                head.setPreviousNode(current);

                head = current;

            } 
        
        Node<D> currentnext = get(position);
           currentnext.getPreviousNode().setNextNode(current);
            current.setPreviousNode(currentnext.getPreviousNode());
              current.setNextNode(currentnext);
                currentnext.setPreviousNode(current);
        current.position = position;
           Node<D> next= current.getNextNode();
        while(next!=null){
            // current = current.getNextNode();
            // current
            
            next.position++;
            next=next.getNextNode();
            // current = current.getNextNode();
        }
        


    }
    public void add(D value){
         // head.position=0;
        int index = size();
    	Node<D> next = new Node<D>(value);
    		next.nextNode=null;
    	if(head != null){
            Node<D> last = get(size()-1);
             last.setNextNode(next);
             next.setPreviousNode(last);
             // last.position = last.getPreviousNode().position+1;
             // next.position = last.position+1;
         }else{
            head = next;
         }
         next.position = index;

    }
    public void remove(D value){
         // head.value=next.value;
         // head.previous=
        // Node<D> current = head;
        // while(current!= null){
        //     if(current.value==value){
        //         current.getPreviousNode().setNextNode(current.getNextNode());
        //         current.getNextNode().setPreviousNode(current.getPreviousNode());
        //         // current = current.getNextNode();

        //     }

        //     current = current.getNextNode();    
        // }    
            // while(current!=null){
            //     current.position=index;
            //     index=index++;
            // }
        


        //  second way

          int index = find(value);
        Node<D> current = get(index);
            current.getPreviousNode().setNextNode(current.getNextNode());
            current.getNextNode().setPreviousNode(current.getPreviousNode());
            current=current.getNextNode();
            while(current!=null){
                current.position=index;
                index++;
                current=current.getNextNode();
            }
          
    } 
    public void removeFirst(){
        // Node<D> current = head;
        // current = current.getNextNode();
         // head.setNextNode(current);
         // current.setPreviousNode(head);
        // Node<D> first = head.getNextNode();
        // first = head.getNextNode();
        head = head.getNextNode();

       if(head!= null){
            head.setPreviousNode(null);
            for(Node<D> i=head; i!=null;i=i.getNextNode()) {
                i.position--;
            }
       }

    }
    public void removeLast(){
        // Node<D> current = head;
        // while(current.getNextNode()!=null){
        //     current = current.getNextNode();
        // } 
        // // current.getPreviousNode().setNextNode(null);
        // current.setNextNode(null);

        //  we can do in the following way

        Node<D> last = get(size() - 1);
        if(last!=null){
            last.getPreviousNode().setNextNode(null);
        }

    }
    public void clear(){
        head=null;

    }
    public Node<D> getFirst(){
        if(isEmpty() == true){
            return null;
        }else{
            return head;
        }

    }
    public Node<D> getLast(){
      Node<D> current=head;
      while(current.nextNode!=null){
        current = current.getNextNode();
      }
      return current;

      // or we can do like this also
    //   Node<D> last = get(size() - 1);
    //   return last;
    }
    public Node<D> get(int position){
        Node<D> current=head;
        while(current != null){
            if(current.position==position){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
        

    }
    public int find(D value){
        Node<D> current=head;
        while(current!=null){
            if(current.value == value){
                return current.position;
            }
            current = current.getNextNode();
        }
        return -1;

    }
    public boolean contains(D value){
        Node<D> current = head;
        while(current!=null){
            if(current.value==value){
                return true;
            }
            current = current.getNextNode();
        }
        return false;
        

    }
    public int size(){
        Node<D> current = head;
        int count = 0;
       while(current!=null){
            count++;
            current = current.getNextNode();
       }
       return count;

    }
}