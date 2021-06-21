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
        newNode = ListNode(data)
        if self.head:
            current_node = self.head
            while current_node.next != None:
                current_node = current_node.next

            ## assigning the new node to the next pointer of last node
            current_node.next = newNode

        else:
            ## head is empty
            ## assigning the node to head
            self.head = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            current = self.head
            while current != None:
                if current.data == key:
                    print("Element found")
                    return key
                current = current.next
            print("Element not found")
            return None
        else:
            print("List has no elements")
            return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            current = self.head
            if current.data==key:
                self.head = current.next #if its in first position remove element and assign head to next item
                return
            prev_node = self.head
            while current != None:
                if current.data==key:
                    prev_node.next=current.next
                    return
                prev_node = current
                current = current.next

                    
        else:
            print("The list has no element to delete")
            return          


    def display(self):
            ## variable for iteration
        temp_node = self.head

        ## iterating until we reach the end of the linked list
        while temp_node != None:
            ## printing the node data
            print(temp_node.data, end='->')

            ## moving to the next node
            temp_node = temp_node.next

        print('Null')



if __name__ == '__main__':
        ## instantiating the linked list
    linked_list = SinglyLinkedList()
    linked_list.display()
    ## appending the data into the linked list
    linked_list.append(1)
    linked_list.append(2)
    linked_list.display()
    linked_list.find(1)
    linked_list.find(3)
    linked_list.append(3)
    linked_list.find(3)
    linked_list.display()
    linked_list.remove(2)
    linked_list.display()
    linked_list.remove(1)

    linked_list.append(4)
    linked_list.append(5)
    linked_list.append(6)
    linked_list.append(7)

    ## printing the linked list
    linked_list.display()