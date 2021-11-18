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
        if self.head == None:
            ''' If its a first element then append next reference as None. Head will be the first element of the List'''
            self.head = ListNode(data,None) 
        else:
            '''Append next element's reference to head (First element of the Linked List)'''
            node = ListNode(data)
            self.head.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        """ 1. Itereate till the last element of the Linked List and 
            2. Check if key is present is Linked List if present then return key otherwise return None
        """
        temp_node = self.head
        while temp_node.next:
            if temp_node.data == key:
                return temp_node.data
            temp_node = temp_node.next
        else :
            return 'None'
       
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        '''
        1. Fetched the previous node of matching data linked list 
        2. Then update the previous node's reference to the matching linked list's reference
        '''
        node = self.head
        while node.next:
            if node.next.data == key:
                self.head.next = node.next
                break
            node = node.next 
        
sll = SinglyLinkedList()
sll.append(2)
sll.append(3)
sll.append(2)
print(sll.find(3))
