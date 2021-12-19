
public class Llist2 {
	Node head = null;
	
	public void push(int value) {
		
		Node n = new Node();
		n.Data = value;
		//n.next = null;
		if(head == null) {
			
			head = n;
		}
		else {
		n.next = head;
		head =n;
		}
	}
//		else {
//			Node nn = head;
//			while(nn.next !=null) {
//				nn=nn.next;
//			}
//			nn.next = n;
//			
//		}
	
		int pop() {
			if(head == null) {
				System.out.println("the stack is empty");
				return 0;
			}
			else {
				int deletion = head.Data;
				head = head.next;
				
				return deletion;
			}
			
		}
		public void show () {
			Node node = head;
			while(node.next!=null) {
				
				System.out.println(node.Data);
				node = node.next;
			}
			System.out.println(node.Data);
		
		

	
		}	

}

//     // Driver code 
//     public static void main(String[] args) 
//     { 
//         /* Start with the empty list. */
//         LinkedList list = new LinkedList(); 
  
//         // 
//         // ******INSERTION****** 
//         // 
  
//         // Insert the values 
//         list = insert(list, 1); 
//         list = insert(list, 2); 
//         list = insert(list, 3); 
//         list = insert(list, 4); 
//         list = insert(list, 5); 
  
//         // Print the LinkedList 
//         printList(list); 
//     } 
// }