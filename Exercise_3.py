### Time Complexity: ###
# append operation: Takes O(n) time as we are inserting new element at the end of the linked list
# find operation: takes O(n) time
# remove operation: takes O(n) time 

### Space Complexity: ###
# Since we are using a new singly linked list to store values
# space complexity is O(n)

# could not find this question on leetcode to run and see.

# No issues faced while coding this exercise

## Code along with comments explaining my approach
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
        curr = ListNode(data)                                               #create new listnode with the data
        if self.head == None:                                               # if head is None then the newlist node is the first node(head)
            self.head = curr
            print(f"Element {curr.data} Inserted on to Linked List")
            return
        
        while self.head.next:                                               #checking if next node exists after head                                             
            self.head = self.head.next
        self.head.next = curr                                               #else we insert the new node after the head
        print(f"Element {curr.data} Inserted on to Linked List")

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        while self.head:
            if self.head.data == key:                                                   #if head node's data matches with key
                print(f"Found key at element with node value: {self.head.data}")
                return self.head                                                        #return head
            else:
                self.head = self.head.next                                              #otherwise check next node
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev, curr = None, self.head                            # we use two pointers prev is set to None, Curr is set to head
        while curr:
            if curr.data == key:                                #if curr node's data matches with key
                if prev:                                        #if prev node exists
                    prev.next = curr.next                       #we shift the prev.next ptr to curr.next ptr removing the existing connection of current node(removed)
                else:                                           # if prev does not exist then we are removing first node
                    self.head = curr.next                       # then we just shift the head ptr to next node where curr is pointing

            prev = curr                                         #updating pointers accordingly
            curr = curr.next


l = SinglyLinkedList()
l.append(1)
l.append(2)
l.append(3)
l.find(2)
l.remove(2)