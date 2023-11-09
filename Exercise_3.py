#Space complexity for ListNode and SinglyLinkedList is O(1)
#Time Complexity for append(),find() and remove() is O(n)
#Problem ran successfully on leetcode compiler
#I faced no problem while implementing the code

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None
    
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
        #creating a new node with the provided data
        newnode=ListNode(data)

        #if the linked list is empty
        if self.head==None:
            self.head=newnode
            print("Value has been successfully inserted in the linked list")

        #if there are some values in linked list
        else:
            val=self.head
            #traversing through the linked list to reach the end of the linked list
            while(val.next):
                val=val.next
            #appending the new value at the end
            val.next=newnode    
            print("Value has been successfully inserted in the linked list")
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #if the linked list is empty
        if self.head==None:
            return None
        else:
            #assigning the value of head to node
            node=self.head
            while(node is not None):
                if(node.data==key):
                    #if the value is found, we will be returning the data
                    return node.data
                #if the value not found, we will be moving to next node
                node=node.next
            #if the value is not present in the linked list, we will be returning None
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        #checking whether the value in first node matches the key 
        if(temp is not None):
            if(temp.data==key):
                #if the value matches we will be modifying the head value
                self.head=temp.next
                temp.next=None
                print("Node removed from the linked list with the specific key")
        #storing the head value in temp (1st node value)
        prev=temp
        #now temp contains 2nd node address
        temp=temp.next
        #removed value will be used if key is not found in linked list
        removed=0
        while(temp is not None):
            if(temp.data==key):
                #if the key is founf in linked list, we will be coming out of loop
                prev.next=temp.next
                removed=1
                print("Node removed from the linked list with the specific key")
            #if not we will be storing current temp value in prev which can be used in next iteration
            prev=temp
            #moving to the next node           
            temp=temp.next
        #if the key is not found, it will print the below line
        if(removed!=1): 
            print("Key not found in the linked list")
    
    

sll = SinglyLinkedList()
sll.append("1")
sll.append("2")
sll.append("3")
sll.append("4")
sll.remove("6")
x=sll.find("2")
if(x==None):
    print("There is no such element in the linked list")
else:
    print("Found the element",x,"in the linked list")
