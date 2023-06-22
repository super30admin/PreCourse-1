// Linked list Node. 
// This inner class is made static 
// so that main() can access it 
export class Node { 
    data:number; 
    next:Node; 
    // Constructor 
    constructor(d:number) { 
        this.data=d;
        this.next=null;
        //Write your code here 
    } 
} 

// a Singly Linked List 
export class LinkedList { 
     head:Node; // head of list 
    // Method to insert a new node 
    constructor(){};

    //return new LinkedList();
    public static  insert( list: LinkedList, data: number):LinkedList 
    { 
        // Create a new node with given data 
       var newNode: Node= new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(!list.head){
            list.head= newNode;
        } else{ 
            // Else traverse till the last node 
            // and insert the new_node there 
            let current=list.head;
            while(current.next){
                current=current.next;
            }

            current.next=newNode;
        }

        return list;
         // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static  printList( list:LinkedList):void
    {  
        // Traverse through the LinkedList 
        let current=list.head;
        while(current.next){
            // Print the data at current node 
            console.log(current.data);       
            // Go to next node 
            current=current.next;
        }
    } 
}
   
    // Driver code 
        /* Start with the empty list. */
        var list: LinkedList = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2); 
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
  
        // Print the LinkedList 
        LinkedList.printList(list); 