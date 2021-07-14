




class Node:
 

    def __init__(self, values):
        self.values = values  
        self.next = None  
 

class Singly_Linked_list:
 

    def __init__(self):
        self.head = None
 
   
    def printList(self):
        temp = self.head
        while (temp):
            print (temp.values)
            temp = temp.next
 
 

def main():
 

    list = Singly_Linked_list()
 
    list.head = Node(1)
    second = Node(23)
    third = Node(67)
    fourth =Node(98)
 
    list.head.next = second; 
    second.next = third;
    third.next=fourth;
 
    list.printList()
    
    
main()
