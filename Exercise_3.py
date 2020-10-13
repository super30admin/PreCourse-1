#Exercise_3 : Implement Singly Linked List
class Node:
    def __init__(self,initdata):
        self.data=initdata
        self.next=None

    def set_data(self,newdata):
        self.data=newdata

    def set_next(self,newnode):
        self.next=newnode

    def get_data(self):
        return self.data

    def get_next(self):
        return self.next

class linked_list:

    def __init__(self):
        self.head=None

    def isempty(self):
        return self.head ==None

    def add(self,item):
        temp=Node(item)
        current=self.head
        if current:
            while current.get_next() != None:
                current=current.get_next()
            current.set_next(temp)
        else:
            self.head=temp

    def size(self):
            size=0
            current=self.head
            while current !=None:
                current=current.get_next()
                size=size+1
            return size

    def print_elements(self):
            current=self.head
            v=[]
            while current !=None:
                v.append(current.get_data())
                current=current.get_next()
            print(v)


    def remove(self,item):
        current =self.head
        previous=None
        found =False

        while not found:
            if current.get_data() == item:
                found=True
            else:
                    previous = current
                    current = current.get_next()

        if previous == None:
            self.head = current.get_next()
        else:
            previous.set_next(current.get_next())


        
