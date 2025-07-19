#Time Complexity :O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : did not find this on leetcode
#Any problem you faced while coding this : syntax issues and some minor errors

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
        node_tobe_added=ListNode(data)  # create a new node to be added 
        if not self.head:               # if the list is empty add the new node as the starting node
            self.head=node_tobe_added
            return
        curr_node=self.head             # if the list is not empty traverse the entire list and add at the end 
        while curr_node.next:
            curr_node=curr_node.next
        curr_node.next=node_tobe_added

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr_node=self.head
        while curr_node:
            if curr_node.data==key:
                return curr_node
            curr_node=curr_node.next
        return None


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr_node=self.head
        prev_node=None
        while curr_node:
            if curr_node.data==key:
                if prev_node:
                    prev_node.next=curr_node.next
                else:
                    self.head=curr_node.next
                return
            prev_node=curr_node
            curr_node=curr_node.next
    
    def printList(self):
        curr_node=self.head
        while curr_node:
            print(curr_node.data, end="->")
            curr_node=curr_node.next
        print("None")


#Tocheck 
myList=SinglyLinkedList()
myList.append(2)
myList.append(4)
myList.append(6)
myList.printList()
found_element=myList.find(4)
if found_element:
    print("Found")
else:
    print("Not found")

myList.remove(4)
myList.printList()



                
