class Node:
     
    # Constructor to initialize the
    # node object
    def __init__(self, data):
        self.data = data
        self.next = None
 
# Function to sort a singly
# linked list using insertion
# sort
def insertionSort(head_ref):
 
    # Initialize sorted linked list
    sorted = None
 
    # Traverse the given linked list
    # and insert every node to sorted
    current = head_ref
    while (current != None):
     
        # Store next for next iteration
        next = current.next
 
        # Insert current in sorted
        # linked list
        sorted = sortedInsert(sorted,
                              current)
        # Update current
        current = next
     
    # Update head_ref to point to
    # sorted linked list
    head_ref = sorted
    return head_ref
 
# Function to insert a new_node in a list.
# Note that this function expects a pointer
# to head_ref as this can modify the head
# of the input linked list (similar to push())
def sortedInsert(head_ref, new_node):
    current = None
     
    # Special case for the head end
    if (head_ref == None or
       (head_ref).data >= new_node.data):   
        new_node.next = head_ref
        head_ref = new_node
     
    else:
     
        # Locate the node before the point
        # of insertion
        current = head_ref
        while (current.next != None and
               current.next.data < new_node.data):       
            current = current.next
         
        new_node.next = current.next
        current.next = new_node
         
    return head_ref
 
# Utility Functions
# Function to print linked list
def printList(head):
    temp = head
    while(temp != None):   
        print( temp.data, end = " ")
        temp = temp.next
     
# A utility function to insert a node
# at the beginning of linked list
def push( head_ref, new_data):
 
    # Allocate node
    new_node = Node(0)
 
    # Put in the data
    new_node.data = new_data
 
    # Link the old list of the
    # new node
    new_node.next = (head_ref)
 
    # Move the head to point to
    # the new node
    (head_ref) = new_node
    return head_ref
 
# Driver code
a = None
a = push(a, 5)
a = push(a, 20)
a = push(a, 4)
a = push(a, 3)
a = push(a, 30)
 
print("Linked List before sorting ")
printList(a)
 
a = insertionSort(a)
 
print("Linked List after sorting ")
printList(a)