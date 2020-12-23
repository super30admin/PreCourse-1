# // Time Complexity : O(1)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this : No
# // Your code here along with comments explaining your approach

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
        if self.head is None:
            self.head = ListNode(data)
        else:
            current = self.head
            while(current.next != None):
                current = current.next
            newNode = ListNode(data)
            current.next = newNode
        # self.printStack()


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("Stack is Empty")
            return None
        else:
            current = self.head
            while(current != None):
                if current.data == key:
                    print("found ", current.data)
                    return current.data
                else:
                    current = current.next
            

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("Stack is empty")
        elif self.head.data == key:
            self.head = self.head.next
        else:
            current = self.head
            while(current is not None):
                if(current.data == key):
                    break
                prev = current
                current = current.next
            prev.next = current.next
        # self.printStack()
            

    # def printStack(self):
    #     current = self.head
    #     while(current.next != None):
    #         print(current.data)
    #         current = current.next
    #     print(current.data)



# s = SinglyLinkedList()
# s.append(1)
# s.append(3)
# s.append(5)
# s.append(6)
# s.append(4)
# s.find(5)
# s.remove(6)