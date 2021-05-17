'''
===== Submission Details ======
Student Name: Pavan Kumar K. N.
Email       : pavan1011@gmail.com
S30 SlackID : RN32MAY2021
=================================
'''

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
        new_element = ListNode(data)

        if(self.head is None):
            self.head = new_element
            return

        else:

            traverse_node = self.head
            
            while (traverse_node.next):
                traverse_node = traverse_node.next
            
            traverse_node.next = new_element


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        traverse_node = self.head
        while traverse_node:
            if traverse_node.data == key:
                return traverse_node
            else:
                traverse_node = traverse_node.next
        
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("Empty List!", end = "")
            return None
        
        #Found at head
        elif self.head.data == key:
            self.head = self.head.next
            return True

        else:

            #Not found at head. Traversing...
            traverse_node = self.head

            while traverse_node.next:
                
                #Next element has key
                if traverse_node.next.data == key:
                    
                    #Next element replaced by its consequent item in the list  
                    traverse_node.next = traverse_node.next.next
                    return True
                
                #Next element doesn't have key. Continue traversing...
                else:
                    traverse_node = traverse_node.next
            
            #Not found in list
            return None

#     #Helper function
#     def printList(self):
#         """
#         Prints the list starting from head.
#         Takes O(n) time.
#         """
#         traverse_node = self.head

#         while (traverse_node):
#             print(traverse_node.data, end="")
#             if (traverse_node.next):
#                 print("->", end="")
#             traverse_node = traverse_node.next

# # Driver code modified from Exercise 2.
# sll = SinglyLinkedList()
# while True:
#     print('\nappend <data>')
#     print('find <key>')
#     print('remove <key>')
#     print('print')
#     print('quit')
#     do = input('What would you like to do? ').split()
 
#     operation = do[0].strip().lower()
#     if operation == 'append':
#         element = int(do[1])
#         sll.append(element)
    
#     elif operation == 'find':
#         key = int(do[1])
#         found = sll.find(key)
#         if found is not None:
#             print("Element {0} found!".format(key))
#         else:
#             print('Element not found')
    
#     elif operation == 'remove':
#         key = int(do[1])
#         found = sll.remove(key)
#         if found is not None:
#             print("Element {0} found!".format(key))
#         else:
#             print('Element not found')
    
#     elif operation == 'print':
#         print("Singly Linked List: ", end="")
#         sll.printList()
#         print("\n")

#     elif operation == 'quit':
#         break
