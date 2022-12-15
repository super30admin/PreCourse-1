#Time Complexity :
# Append , find, remove,  O(N) ,  N = size of list 

#Space Complexity :
# O(N), N is the number of elements in the array

#Did this code successfully run on Leetcode :
#No - I did not find this problem on leetcode. I ran this on local test cases

#Any problem you faced while coding this :
#No. Only problem was that I did not find it on leetcode and hence have tested it only locally

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next_elem=None):
        self.data = data
        self.next = next_elem
    
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
        if self.head == None :
            self.head=  ListNode(data)
        else :
            current = self.head
            while current.next != None :
                current = current.next
            current.next = ListNode(data)    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while (current != None):
            if current.data == key :
                return current
            else :
                current = current.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if self.head == None:
            return None

        if self.head.data == key:
            self.head = self.head.next
            return 1
        else :
            if current.next == None:
                return None
            else :
                while (current.next != None):
                    if current.next.data == key:
                        current.next = current.next.next
                        return 1
                    current = current.next

        return None

    def show(self):
        """
        Takes O(n) time.
        """
        current = self.head
        while (current != None) :
            print (current.data)
            current = current.next
            

a_stack = SinglyLinkedList()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('show')
    #print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'append':
        a_stack.append(int(do[1]))
    elif operation == 'find':
        popped = a_stack.find(int(do[1]))
        if popped is None:
            print('Element not found')
        else:
            print('Popped value: ', popped.data)
    elif operation == 'remove':
        removed = a_stack.remove(int(do[1]))
        if removed is None:
            print('Element does not exist')
    elif operation == 'show':
        a_stack.show()
    elif operation == 'quit':
        break
