class Node:
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
        self.node = None


    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if(self.head == None):
            print('Head Insertion')
            self.head = Node(data)
            print('address: ',self.head)
            self.node = self.head
            print('address: ',self.node)
            return self.node.data

        else:
            temp = Node(data)
            print('address temp', temp)
            self.node.next = temp
            self.node = temp
            print('Node address',self.node)
            return self.node.data
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        i = self.head
        while(i!=None):

            if(i.data == key):
                return i.data
            else:
                i = i.next

        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        count = 0
        i = self.head
        
        while(i!=None):

            if(i.data == key):
                if(count == 0):
                    print('data: ',i.data)
                    print('address: ',i)
                    removed_data = i.data
                    self.head = i.next
                    return removed_data
                else: #count > 0
                    if(i.next != None):
                        print('data: ',i.data)
                        removed_data = i.data
                        temp_relocation = i.next
                        print('Before change: ',temp_previous_address.data)
                        print(i.data)
                        temp_previous_address.next = temp_relocation
                        return removed_data
                    else:
                        print('data: ',i.data)
                        removed_data = i.data
                        temp_previous_address.next = None
                        return removed_data
            else:
                temp_previous_address = i
                i = i.next
                count = count + 1

        return None
        

    def traverse(self):

        if(self.head == None):
            return None            

        i = self.head.next
        
        print('data: ', self.head.data)
        while(i!= None):
            print('data: ', i.data)
            i = i.next



sl = SinglyLinkedList()

while True:

    print('Push')
    print('Remove')
    print('find')
    print('Enter value example: push 11')

    input_ = input('Please enter your input: ').split(' ')

    operation = input_[0]
    if(operation == 'push'):
        sl.append(input_[1])
    elif(operation == 'remove'):
        sl.remove(input_[1])
    elif(operation == 'traverse'):
        sl.traverse()