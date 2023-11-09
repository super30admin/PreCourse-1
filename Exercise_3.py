# // Any problem you faced while coding this : It was not easy and took time but now it looks easy ... Thank you for this assignment 
#

# // Your code here along with comments explaining your approach
# // Time Complexity : 0(1) // push, pop if it will traverse the full list then time complexity = o(n)
# // Space Complexity : 0(n) // it's filling in the stack
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
    # appending the node at the end it will goes till head.next and then assign new node value into current.next
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)

        if self.head is None:
            self.head = new_node
            return
 
        current = self.head
        while (current.next):
            current = current.next
 
        current.next = new_node
        print(current)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        if the node is none
        """
    
        if self.head is None:
            return None

        current = self.head
        if (current is not None):
            if (current.data == key):
                print("findkey:"+str(key))

        if (current is not None):
            while current:
                if current.data == key:
                    print("findkey:"+str(key))
                current = current.next
            return None
        else:
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head

        if(current == None):
            return
    
        if (current is not None):
            if (current.data == key):
                self.head = current.next
                current = None
                return

        while(current is not None):
            if current.data == key:
                break
            prev = current
            current = current.next

        prev.next = current.next
        current = None
 
 
    # def printList(self):
    #     current = self.head
    #     while(current):
    #         print ("listnode",current.data),
    #         current = current.next
            
                            
                    
                    


       
                
               
sl = SinglyLinkedList()
sl.append(2)
sl.append(5)
sl.find(5)
sl.remove(5)


