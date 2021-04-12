"""
#####################################################################
Append Method: Since the element is to be inserted at the end, the linked list has to be traversed till the end.
Time Complexity : O(N)
Space Complexity : O(1)
#####################################################################
Find Method: Worst case would be when the element is not present in the linked list or is present at the end.
Time Complexity : O(N)
Space Complexity : O(1)
#####################################################################
Remove Method: Worst case would be when the element to be removed is present at the end.
Time Complexity : O(N)
Space Complexity : O(1)
#####################################################################
Show Method: Since all the elements have to be printed, all elements have to be traversed.
Time Complexity : O(N)
Space Complexity : O(1)
#####################################################################

"""

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        """
        #If the list is empty.
        if self.head == None:
            self.head = ListNode( data)

        #If the list has 1 or more elements.
        else:
            pointer = self.head
            while pointer.next != None:
                pointer = pointer.next
            pointer.next = ListNode(data)
        
        return self.head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        pointer = self.head
        #Checking if the key is the head.
        if pointer.data == key:
            return pointer.data
        
        #Checking if the key is located elsewhere.
        while pointer.next != None:
            if pointer.data == key:
                return pointer.data
            pointer = pointer.next

        return pointer.data if pointer.data == key else None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        pointer = self.head

        #Key element is the head element
        if pointer.data == key:
            
            #If the head element is the only element in the list.
            if pointer.next == None:
                self.head = None
            else:
                self.head = pointer.next
        else:
            
            while pointer.next.data != key:
                pointer = pointer.next
            
            #Checking if the node with key points to None. Key element is the last element.
            if pointer.next.next == None:
                pointer.next = None
            
            #Key element is neither last nor in the front.
            else:
                pointer.next = pointer.next.next
        return "Removed Key:" + str(key)
        
    def show(self):
        pointer = self.head
        print("------------------------------")
        print("Printing Linked List")
        while pointer.next != None:
            print(pointer.data)
            pointer = pointer.next
        print(pointer.data)
        print("--------------------------")
        return 
s = SinglyLinkedList()
s.append('1')
s.append('2')
s.append('1')
s.append('2')
s.append('1')
s.append('2')
s.append('1')
s.append('2')
s.append('5')
s.append('10')

s.show()
print(s.remove('2'))
s.show()
key = '11'
if s.find(key ) == None:
    print("Didnt find the key :(")
else:
    print("Found the key:", key)

