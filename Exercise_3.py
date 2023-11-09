class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
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
        # use the node constructor ListNode to create a node with data 
        newNode = ListNode(data)
        # Check if the Linked List is empty or not,
        # if empty make the new node as head 
        if(self.head == None):
            self.head = newNode
            return
        else:
        # Traverse to the end of the linked list, change the next of the last node to new node
            temp = self.head
            while(temp.next != None):
                temp = temp.next
            temp.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # set a pointer to head, compare curr.data to key, if it matches return curr.data
        # else return None
        curr = self.head
        while curr:
           if curr.getData() == key:
               return curr.data
           curr = curr.getNextNode()
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        # check if head is not none
        if(temp != None):    
            #   if head is not null and data stored at head node == key, you found the node to delete
            #   So move the pointer to next node and make it head  ie, make head.next as next node. ie, next node as head
            #   and delete previous head  
            if(temp.data == key):
                nodeToDelete = self.head
                self.head = self.head.next
                nodeToDelete = None     
            else:
            # Else, traverse to the node previous to the 
            #   node with value equal to key, and adjust links 
                while(temp.next != None):
                    if(temp.next.data == key):
                        nodeToDelete = temp.next
                        temp.next = temp.next.next
                        nodeToDelete = None
                        break
                    temp = temp.next

    #display the content of the list
    def PrintList(self):
        temp = self.head
        if(temp != None):
            print("The list contains:", end=" ")
            while (temp != None):
                print(temp.data, end=" ")
                temp = temp.next
            print()
        else:
            print("The list is empty.")


# test the code                
MyList = SinglyLinkedList()

#Add five elements at the end of the list.
MyList.append(10)
MyList.append(20)
MyList.append(30)
MyList.append(10)
MyList.append(20)
MyList.PrintList()

#Delete first occurrence of 20
MyList.remove(20)
MyList.PrintList()
