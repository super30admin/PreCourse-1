#Best case time complexity, insertion, deletion: O(1)
#Avg case, Worst Case time complexity: O(n)
#Best case space complexity: O(1)
#Worst case space complexity: O(n)
class ListNode:
    """
    A node in a singly-linked list.
    """
    
    def __init__(self, data=None, next=None):
        #creating a node with data and next fields in singly linkedlist
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
        #initializing a new node
        newNode=ListNode(data)
        #if the linkedlist is empty adding newnode as head
        if(self.head == None):
            self.head = newNode
            return
        else: #when node.next is none we reached the end of the list hence we add the newnode
            current = self.head
            while(current.next != None):
                current = current.next
            current.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #Finding the key by searching the data field of linkedlist if found key is returned
        current = self.head
        while(current!= None):
            if(current.data == key):
                print(key)
                return
            else:
                current=current.next
        
        return "Key not found."


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current=self.head
        pt=current.next
        #checking if linkedlist is empty
        if current==None:
            print("Empty linked list")
            return   

        while current.next.next is not None: 
            #if head is the key element, it is removed
            if current.data==key:
                current=current.next
                return "Head element removed"
            #traversing through the list
            if pt.data!=key:
                current=pt
                pt=pt.next
            #if the current node data field is the key removing it by changing the next pointer
            else:
                current.next=pt.next
                pt=None
                print("Key element removed from ll")
        return "No key found"

if __name__ == '__main__':
 
    # Start with the empty list
    llist = SinglyLinkedList()
 
    ''' Use push() to construct below list
        14->21->11->30->10 '''
    llist.append(14)
    llist.append(21)
    llist.append(11)
    llist.append(30)
    llist.append(10)
    llist.find(21)
    llist.remove(30)
        
 





