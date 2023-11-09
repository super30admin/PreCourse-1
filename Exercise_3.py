#time Comlexity: O(n)
#space complexity: O(n)
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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node=ListNode(data)
        if self.head.next==None:
            self.head.next=new_node
        else:
            temp=self.head.next
            while(temp.next!=None):
                temp=temp.next
            else:
                temp.next=new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head.next!=None:
            temp=self.head.next
            while(temp!=None):
                if temp.data==key:
                    return temp.data
                temp=temp.next
            else:
                return "Not Found"
        else:
            print("linked list is empty")

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.next!=None:
            temp=self.head.next
            prev=self.head
            while(temp!=None):
                if temp.data==key:
                    prev.next=temp.next
                    return f"element {temp.data} removed"
                prev=temp
                temp=temp.next
            else:
                return "Not found"
        else:
            return "linked list is empty"
    def print_list(self):
        if self.head.next!=None:
            temp=self.head.next
            while(temp!=None):
                print(f"{temp.data}  ")
                temp=temp.next
        else:
            print("linked list is empty")
s=SinglyLinkedList()
s.append(5)
s.append(10)
s.append(15)
s.append(20)
s.append(25)
s.print_list()
print(s.remove(5))
s.print_list()
