public class SinglyLinkedList {
	//head points always to first node of LinkedList
	ListNode head;
	public class ListNode{
		int data;
		ListNode next;
		ListNode(int data){
			//Constructor for initialization of data and reference(next) of node
			this.data=data;
			this.next=null;

		}}
	void insertFirstNode(int data) {
		//To insert node at beginning
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
	}
	void insertLastNode(int data) {
		//To insert node at Last
		ListNode newNode=new ListNode(data);
		if(head==null) {
			//checking whether head is null
			newNode.next=head;
			head=newNode;
		}
		else {
			//if head is not null then will  traverse through all the nodes till end node and insert node at end
		ListNode temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=null;
		}
	}
	int countOfNodes() {
		//counting number of nodes
		ListNode temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	void insertNodeInBetween(int position,int data) {
		//inserting node in between the Linked List
		ListNode newNode=new ListNode(data);
		int count=0;
		ListNode temp=head;
		if(head==null) {
			newNode.next=head;
			head=newNode;
		}
		else {
		while(count<position-1) {
			temp=temp.next;
			count++;
		}
		ListNode previous=temp.next;
		temp.next=newNode;
		newNode.next=previous;
		}
	}
	void displayNodes() {
		//Displaying all Nodes
		ListNode temp=head;
		while(temp!=null) {
			System.out.printf(temp.data+"->");
			temp=temp.next;
		}
		System.out.printf("Null");
	}

	public static void main(String[] args) {
		SinglyLinkedList ob=new SinglyLinkedList();
		ob.insertFirstNode(10);
		ob.insertFirstNode(1);
		System.out.print("\n Inserting node at First \s");
		ob.displayNodes();
		System.out.print("\n Inserting node at Last \s");
		ob.insertLastNode(20);
		ob.displayNodes();
		System.out.print("\n Inserting node at InBetween \s");
		ob.insertNodeInBetween(2,30);
		ob.displayNodes();
		System.out.print("\n\sSize of Linked List="+ob.countOfNodes());

	}

}
