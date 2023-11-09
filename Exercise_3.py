#Time Complexity is O(n) 
#Space Complexity is O(1) constant space

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        if self.head == None:
            self.head = ListNode(data)
            return data

        temp = self.head

        while temp !=None:
            if temp.next == None:
                temp.next = ListNode(data)
                return data
            temp = temp.next
        
        
    def find(self, key):
        if self.head == None:
            print("Empty List")
            return None
        temp = self.head
        


        while temp !=None:
            if temp.data == key:
                print(str(key) +" Key found ")
                return key
            temp = temp.next
            
        print(str(key) + " Key not found")
        
    def remove(self, key):
        if self.head == None:
            print("Empty Head")
            return None
        temp = self.head
        if temp.data == key:
            self.head = self.head.next
            return
            

        while temp !=None:
            if temp.data == key:
                print(str(key) + " Key removed")
                break
            prvious = temp
            temp = temp.next

        prvious.next = temp.next
        temp = None
               
        

        

sg = SinglyLinkedList()

sg.append(10)

sg.append(20)

sg.append(30)

sg.append(60)

sg.find(20)

sg.find(50)

sg.remove(10)

sg.remove(30)

sg.append(100)

print("done")