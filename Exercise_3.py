from dataclasses import dataclass

#time complexity: append-O(n), find-O(n), remove-O(n), print-O(n)
#space complexity: O(n)

#run on leetcode successfully:yes
#No difficulties faced

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
        node=ListNode(data,None)
        if(self.head==None):
            self.head=node
        else:
            temp=self.head
            while(temp.next!=None):
                temp=temp.next
            temp.next=node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while(temp):
            if(temp.data==key):
                return temp
            temp=temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        if(self.head==None):
            return
        if(temp.data==key):
            self.head=self.head.next
            del(temp)
            return
        
        while(temp.next):
            if(temp.next.data==key):
                T=temp.next
                temp.next=T.next
                del(T)
                break
            temp=temp.next
    def Print(self):
        temp=self.head
        while(temp):
            print(temp.data,end=" ")
            temp=temp.next

s=SinglyLinkedList()

while True:
    #Give input as string if getting an EOF error. Give input like "add 10" or "remove 20"
    #print('append <value>')
    #print('pop')
    #print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "add 10" or "remove 20"
    operation = do[0].strip().lower()
    if operation == 'add':
        s.append(int(do[1]))
    elif operation == 'remove':
        popped = s.remove(int(do[1]))
    elif operation=='find':
        found=s.find(int(do[1]))
        if(found):
            print("Data found")
        else:
            print("data not found")
    elif operation=='print':
        s.Print()
    elif operation == 'quit':
        break

