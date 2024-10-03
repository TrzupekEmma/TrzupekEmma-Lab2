import java.util.*;
public class ThingList{


	private class Node {
		public Thing data;
		public Node  next;
		public Node(Thing data){
			this.data=data;
		}
	}

	protected Node head;
	protected Node tail;	
	public void moveAll(Random rand){ 
		for( Node T = head; T != null; T = T.next ) {
			T.data.maybeTurn(rand);
			T.data.step();
		}
	}
	public void addThing(Thing t){
		if(tail==null){
			tail=new Node(t);
			head=tail;
		}else{
			tail.next=new Node(t);
			tail=tail.next;
		}	
	}
	public void printAll(){
		for( Node T = head; T != null; T = T.next )
			System.out.println(T.data.toString());
	}
}
