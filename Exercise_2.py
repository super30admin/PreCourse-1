class Node:
    def __init__(self,initdata):
        self.data = initdata
        self.next = None

    def get_data(self):
        return self.data

    def get_next(self):
        return self.next

    def set_data(self,newdata):
        self.data=newdata

    def set_next(self,newnext):
        self.next=newnext


class stack():

        def __init__(self):
            self.head=None
            self.tail=None
            self.length=0


        def isEmpty(self):
            return self.head == None

        def show(self):
            j=[]
            current=self.head
            while current !=None:
                j.append(current.get_data())
                current=current.get_next()
            return j


        def push(self,item):
            temp=Node(item)
            temp.set_next(self.head)
            self.head=temp
            self.length=self.length+1


        def pop(self):
            current=self.head
            data=current.get_data()
            self.head=current.get_next()
            self.length =self.length-1
            return data

s = stack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
