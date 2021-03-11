class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node=ListNode(data)
        if not self.head:
            self.head = node
        else:
            newnode=self.head
            while newnode.next!=None:
                newnode=newnode.next
            newnode.next=node    
            
            
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return
        if key==self.head.data:
            return self.head
        node=self.head
        while node.next!=None:
            if node.data==key:
                return node
            node=node.next
        return     
        
       
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return
	
	temp = self.head
		
	if head.data == key:
            head = temp.next
            print ("Deleted node is " + str(head.data))
            return

	while(temp.next):
		if (temp.next.data == key):
			print ("Node deleted is " + str(temp.next.data))
			temp.next = temp.next.next
			return
		temp = temp.next
	print ("Node not found")
	return
