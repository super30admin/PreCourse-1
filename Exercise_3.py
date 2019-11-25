
# PreCourse_1: Exercise_3 : Implement a Singly Linked List.
class Node:
    def __init__(self, initdata):
        self.data = initdata
        self.next = None

class UnorderedList:  
    def __init__(self):
        self.head = None

    def isEmpty(self):
        return self.head == None

    def add(self, item):
        if self.head == None:
            self.head = Node(item)
        else:
            current = self.head
            while current.next != None:    
                current = current.next     #identifying the last node
            current.next = Node(item)      #adding the new node as the last node in the linkedlist
    
    def iterate(self):
        if self.head == None:
            print ("It's an Empty List.")
        else:
            current = self.head
            while current.next != None:
                print (current.data)
                current = current.next
            print (current.data)

    def length(self):
        count = 0
        current = self.head
        if current == None:
            return count
        else:
            while current != None:
                count += 1
                current = current.next
        return count

    def search(self, item):
        current = self.head
        found = False
        while current != None and not found:
            if current.data == item:
                found = True
            else:
                current = current.next
        return found

    def remove(self, item):
        current = self.head
        found = False
        previous = None
        while not found:  #finding the node to be deleted
            if current.data == item:
                found = True
            else:
                if current.next != None:
                    previous = current
                    current = current.next
                else:
                    break
        if previous == None:   #deleting the node
            self.head = current.next
        else:
            previous.next = current.next





mylist = UnorderedList()
mylist.add(12)
mylist.add(23)
mylist.add(45)
mylist.iterate()
print (mylist.length())
print (mylist.search(23))
# Deleting the node with value 12
mylist.remove(12)
mylist.iterate()





    
                
        
    


    


