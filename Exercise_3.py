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
        # tc - o(1)
        # sc - o(1)
        return self.head ==None

    def add(self,item):
        # tc - o(n)
        # sc - o(1)
        temp=Node(item)
        current=self.head
        if current:
            while current.get_next() != None:
                current=current.get_next()
            current.set_next(temp)
        else:
            self.head=temp

    def size(self):
            # tc - o(n)
            # sc - o(1)
            size=0
            current=self.head
            while current !=None:
                current=current.get_next()
                size=size+1
            return size

    def print_elements(self):
            # tc - o(n)
            # sc - o(n)
            current=self.head
            v=[]
            while current !=None:
                v.append(current.get_data())
                current=current.get_next()
            return v


    def remove(self,item):
        # tc - o(k) 
        # sc - o(1) 
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