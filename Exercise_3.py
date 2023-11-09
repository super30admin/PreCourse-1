# // Time Complexity : O(n) for all operations
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no



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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        top = self.head
        if top==None:
            self.head = ListNode(data)      #if the head is empty, add the data to that
        else:
            while( top.next!= None):        #find the next empty node
                top = top.next
            top.next = ListNode(data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        top = self.head
        while( top!= None):         #keep looking until you get to the end
            if (top.data == key):
                return top
            top = top.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        top = self.head
        previous=None
        if (top == None):       #if there's no node, then do nothing
            return
        elif (top.data ==key):        #if the head is the node to remove, then set head to head.next
            self.head = self.head.next
        else:
            while( top!= None):
                if (top.data == key):        #if the key is somwhere in the list, then set its previous node's next to the next of the to node
                    previous.next = top.next
                    break
                previous = top
                top = top.next
                

    def printNodes(self):            #just prints the linkedlist for testing purpose to see whats inside 
        top = self.head 
        while(top!=None):
            print(top.data)
            top=top.next


#testing
sslist = SinglyLinkedList()
sslist.append(1)
sslist.append(2)
sslist.append(3)
sslist.append(4)
print("after appending")
sslist.printNodes()
sslist.find(3)
sslist.remove(1)
sslist.remove(3)
print("after removing")
sslist.printNodes()