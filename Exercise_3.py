'''
Approach:

1. Implemented according to the classes created and description mentioned
2. Desired time complexity is achieved for the methods

Didn't check on leet-code. Don't have the problem link
'''

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = None
        self.next = None
    
    def createNode(self,data):
        self.data = data
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.tail = None
        self.length = 0
        
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # Create and object of class list node
        objNewNode = ListNode()
        objNewNode.createNode(data)
        
        if self.length == 0:
            # Our linked-list is empty
            self.head = objNewNode
            self.tail = self.head
        else:
            # Update the tail
            self.tail.next = objNewNode
            self.tail = objNewNode
                
        self.length +=1
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # Return rtrResult
        rtrResult = None
        
        # Create rfr to head node
        currentNode = self.head
        
        while currentNode != None:
            if currentNode.data == key:
                rtrResult = key
                break
            
            currentNode = currentNode.next
            continue
        
        return rtrResult
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Create currentNode rfr
        currentNode = self.head
        
        # Boundary Case
        # Case 1 Delete head
        if self.head.data == key:
            self.head = self.head.next
            currentNode.next = None
            currentNode = None
        
        # Case 2 Not head node
        else:
        
            # Create rfr previousNode
            previousNode = None
            
            # Iterate the currentNode
            while currentNode != None:
                
                if currentNode.data == key:
                    break
                
                previousNode = currentNode
                currentNode = currentNode.next
                continue
            
            if currentNode == None:
                # Key doesnt exist
                previousNode = None
                return "Key doesn't exist"
            
            elif currentNode == self.tail:
                # Delete  the tail node
                self.tail = previousNode
                self.tail.next = None
                previousNode = None
                currentNode = None
            
            else:
                # Delete the node
                previousNode.next = currentNode.next
                currentNode.next = None
                currentNode = None
                previousNode = None
                
        self.length -=1
        return "Key is removed, print the linked-list"
    
    # Added functon to test the result
    def printLinkedList(self):
        
        # Output List
        rtrList = []
        
        # Create rfr to head
        currentNode = self.head
        
        # Iterate the currentNode
        while currentNode != None:
            rtrList.append(currentNode.data)
            currentNode = currentNode.next
            continue
        
        # Return the result
        return (rtrList,self.length)

singlyLL = SinglyLinkedList()

# Append into linkedList
singlyLL.append(-10) 
singlyLL.append(1)
singlyLL.append(2)
singlyLL.append(3)
singlyLL.append(4)
singlyLL.append(5)
singlyLL.append(-6)
print(singlyLL.printLinkedList())

# Check if key is available
print(singlyLL.find(3))

# Remove the node from linkedList
singlyLL.remove(4)
print(singlyLL.printLinkedList())
print("\nHead is:\t",vars(singlyLL.head))
print("Tail is:\t",vars(singlyLL.tail))

singlyLL.remove(-6)
print(singlyLL.printLinkedList())
print("\nHead is:\t",vars(singlyLL.head))
print("Tail is:\t",vars(singlyLL.tail))

singlyLL.remove(-10)
print(singlyLL.printLinkedList())
print("\nHead is:\t",vars(singlyLL.head))
print("Tail is:\t",vars(singlyLL.tail))
