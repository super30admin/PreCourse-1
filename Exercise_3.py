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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        temp = self.head
        
        #if new_node is the first element in the linked list
        if self.head is None:
            self.head = new_node
            new_node.next = None
        else:
            while temp.next is not None: #if linked list is not empty
                temp = temp.next
            temp.next = new_node
            new_node.next = None
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        
        #empty linked list
        if self.head is None:
             print("Empty Linkedlist")
        else:
            if self.head.data == key: #first occurence of key is first element in the list
                return self.head.data
            
            while temp is not None:
                if temp.data == key:
                    return temp.data
                else:
                    return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
       
        #empty linked list
        if self.head is None:
             print("Empty Linkedlist")
        else:
            if self.head.data == key: #first occurence of key is first element in the linked list
                self.head = temp.next
                temp = None
            
            #first occurence of key is not first element in the linked list
            while temp is not None: 
                if temp.data == key:
                    break
                        
                prev = temp
                temp = temp.next
                
            #key not found in list
            if temp == None:
                return
            
            #Breaking ties with node to be deleted
            prev.next = temp.next
            temp = None
    
    #display output
    def display(self):
        temp = self.head
        
        if self.head is None:
            print("Empty Linkedlist")
        else:
            while temp:
                print(temp.data,"->",end=' ')
                temp = temp.next
            print()
            
        
l1 = SinglyLinkedList()
l1.append(10)
l1.append(10)
l1.append(90)
l1.display()
l1.remove(10)
element = l1.find(90)
print(element)
l1.display()
