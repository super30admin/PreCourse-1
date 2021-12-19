ppublic class Llist {
	Node head;
	
	public void insert(int data) {
		Node n = new Node();
		n.Data = data;
		n.next = null;
		if(head==null) {
			head =n;
		}
		else {
			Node nn = head;
			while(nn.next!=null) {
				nn = nn.next;
			}
			nn.next = n;
		}
		
		}
	public void show () {
		Node node = head;
		while(node.next!=null) {
			
			System.out.println(node.Data);
			node = node.next;
		}
		System.out.println(node.Data);
		//System.out.println(node.Data);
	}

//     public static void main(String[] args) 
//     { 
  
//         StackAsLinkedList sll = new StackAsLinkedList(); 
  
//         sll.push(10); 
//         sll.push(20); 
//         sll.push(30); 
  
//         System.out.println(sll.pop() + " popped from stack"); 
  
//         System.out.println("Top element is " + sll.peek()); 
//     } 
// } 
