# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None): #initialising a node with data and next pointer
       self.data = data
       self.next = None

class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None #assigning head to none at start

    def printList(self): # method to print the elements in the linked list from start
        temp = self.head
        while (temp):
            print (temp.data)
            temp = temp.next

    def append(self, data): #appending the new node to the end of list
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data) #initialising a new node
        if self.head is None: #if there are no nodes in the list then assigning the new node to the head
            self.head = new_node
            return
        last = self.head # or else go to the last node
        while(last.next): 
            last = last.next 
        last.next = new_node # update the last.next to the new node
        
    def find(self, key):  # finding the key in the list
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head 
        found = False
        while current != None:
            if current.data == key:
                return current.data
            else:
                current = current.next
            print("Data not found")
            return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head #assigning the head to current
        if (current is not None): 
            if (current.data == key): #checking if the key we are removing is the head node itself
                self.head = temp.next
                current = None
                return
        while(current is not None): # traversing through the list and searching the key to remove
            if  current.data == key:
                break
            prev = current  #modifying the prev and current values
            current =  current.next

        if(current == None): # if there is no key present in the list just return
            return

        prev.next = current.next #remove the link by modifying the prev.next
        current = None

if __name__=='__main__':

    list1 = SinglyLinkedList()

    list1.head = ListNode(1)
    second = ListNode(2)
    third = ListNode(3)
    list1.head.next = second
    second.next = third
    list1.append(4)
    list1.remove(2)
    list1.printList()
    list1.find(2)