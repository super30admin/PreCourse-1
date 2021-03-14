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
    def print(self):
        temp = self.head
        if self.head != None:
            while temp != None:
                print(temp.data)
                temp = temp.next
        else:
            print("stack is empty")
        print("=======================")
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data)
        else:
            temp = self.head
            while temp.next != None:
                temp = temp.next
            newnode = ListNode(data)
            temp.next = newnode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # newnode = data
        if self.head == None:
            print("None")
        else:
            if self.head.data == key:
                return self.head.data
            else:
                temp = self.head
                while temp.next !=None:
                    if temp.data ==key:
                        return temp.data
                    temp = temp.next
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head 
        if (temp is not None): 
            if (temp.data == key): 
                self.head = temp.next
                temp = None
                return
        while(temp is not None): 
            if temp.data == key: 
                break
            prev = temp 
            temp = temp.next
        if(temp == None): 
            return
        prev.next = temp.next
        temp = None
t = SinglyLinkedList()
t.append(1)
t.print()
t.append(2)
t.print()
t.append(3)
t.print()
t.remove(1)
t.print()
# // Did this code successfully run on LeetCode?:
# //         No did not find the problems. 

# //     Problems faced while coding this:
# //         Yes sorting out how to insert took a long time. 

# //     Approach:
# //        defined the linkedlist , understood what each fucntions have to do and then coded them. 