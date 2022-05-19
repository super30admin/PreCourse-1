from multiprocessing.dummy import current_process


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self,data):
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
        newNode=ListNode(data)  
        if self.head==None:
            self.head=newNode
            return
        last=self.head
        while last.next:
            last=last.next
        last.next=newNode
        print("the newly added and last itme ", last.data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
     
        if key==self.head.data:
            return self.head.data
        current=self.head
        while current!=None:
            print("curent.data", current.data)
            if current.data==key:
                return current.data
            current=current.next
        return None
    
  
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data==key:
            temp=self.head
            self.head=temp.next
            print("deleting=", temp.data)
            temp=None
            return 
            
        ptr2=self.head
        while ptr2.next:
            if ptr2.next.data==key:
                tobedeleted=ptr2.next
                ptr2.next=ptr2.next.next
                print("deleting=", tobedeleted.data)
                tobedeleted=None
                return 
            ptr2=ptr2.next
        print("Nothing to Delete")
        return

s = SinglyLinkedList()
s.append('1')
s.append('2')
s.append('3')
s.append('4')
s.append('5')
s.append('6')
print(s.find("1"))
print(s.find("6"))
print(s.find("2"))
print(s.find("3"))
print(s.find("4"))
print(s.find("9"))
s.remove("1")
s.remove("3")
s.remove("6")

