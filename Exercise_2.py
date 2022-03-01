class Node:

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        
        self.head = None

    def append(self, data):
        
        curr = self.head
        if curr is None:
            self.head = Node(data)
        else:
            while curr.next is not None:
                curr = curr.next
            curr.next = Node(data)
        
    def find(self, key):
        
        if self.head is None:
            return None
       
        curr = self.head
        while curr is not None:
            if curr.data == key:
                return curr.data
            curr = curr.next
        return None
        
    def remove(self, key):
        
        curr = self.head
        if(curr != None):      
            if(curr.data == key):
                nodeToDelete = self.head
                self.head = self.head.next
                nodeToDelete = None     
            else:
                while(curr.next != None):
                    if(curr.next.data == key):
                        nodeToDelete = curr.next
                        curr.next = curr.next.next
                        nodeToDelete = None
                        break
                    curr = curr.next
    def PrintList(self):
        temp = self.head
        if(temp != None):
          print("The list contains:", end=" ")
          while (temp != None):
            print(temp.data, end=" ")
            temp = temp.next
          print()
        else:
          print("The list is empty.")
      
    # test the code                
MyList = SinglyLinkedList()
MyList.append(10)
MyList.append(20)
MyList.append(30)
MyList.remove(10)
print(MyList.find(20))
MyList.PrintList()

