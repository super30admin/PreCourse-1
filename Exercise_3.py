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
        temp=ListNode(data)
        if(self.head==None):
            #Here the linked list is empty
            self.head=temp
        else:
            #Here the linked list is not empty 
            temp1=self.head
            while(temp1.next!=None):
                temp1=temp1.next
            temp1.next=temp
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        index=0
        while(temp!=None):
            if(temp.data==key):
                return f"the given key {temp.data} is present at index {index}"
            temp=temp.next
            index+=1
        
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev=None
        present=self.head
        while(present!=None):
            if(present.data==key):
                #Modify the data
                #Here we have two possibilities
                if(prev==None):
                    #The key is present in first element
                    self.head=present.next
                else:
                    #The key is not present in the first element
                    prev.next=present.next
            
                del present #Here we are deleting the node
                break
            prev=present
            present=present.next

    #This is just an additional method     
    def display(self):
        temp=self.head
        print("--Start--")
        while(temp!=None):
            print(temp.data)
            temp=temp.next
        print("--End--")
    

l=SinglyLinkedList()
l.append(1)
l.append(2)
l.display()
l.append(3)
l.display()
print(l.find(1))
print(l.find(4))
l.remove(1)
l.display()
l.remove(5)
l.display()
l.append(2)
l.remove(2)
l.display()