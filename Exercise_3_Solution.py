
#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : while removing the node.

#Your code here along with comments explaining your approach

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    def __init__(self):
        
        self.head = None

    def append(self, data):
        appendNode = ListNode(data)

        if not self.head:
            self.head = appendNode
        
        #Iterating to the linked list       
        currentNode = self.head

        while currentNode.next != None:
            currentNode = currentNode.next

        currentNode.next = appendNode 

        
        
    def find(self, key):
        current = self.head

        while current:
            if current.data == key:
                return True
        
            current = current.next

        return False    
      
        
    def remove(self, key):
        currentNode = self.head
        previousNode = None

        while currentNode:
            if currentNode.data == key:
                if previousNode:
                    previousNode.next = currentNode.next

                else:
                    self.head = currentNode.next

                return True
            
            previousNode = currentNode
            currentNode = currentNode.next

        return False
