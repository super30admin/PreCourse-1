class Node(object):
    def __init__(self,value):
        self.value = value
        self.nextNode = None
        pass

class LinkedList(object):
    def __init__(self):
        self.headval = None
        pass

    def print_list(self):
        x = self.headval
        while x is not None:
            print(x.value)
            x = x.nextNode
        pass

    def remove(self, val):
        p = self.headval
        if (p == None):
            return
        if (p.value == val):
            self.headval = p.nextNode
            HeadVal = None
            return
        while (p is not None):
            if (p.value == val):
                break
            prev = p
            p = p.nextNode
        prev.nextNode = p.nextNode
        p = None
        pass

    def Beggining(self,new_data):
        new_node = Node(new_data)
        new_node.nextNode = self.headval
        self.headval = new_node
        pass

    def End(self,new_data):
        new_node = Node(new_data)
        if self.headval is None:
            self.headval = new_node
        else:
            a = self.headval
            while(a.nextNode):
                a = a.nextNode
            a.nextNode = new_node
        pass

    def Between(self,node,data):
        if node is None:
            print("Can't add node next to the gien node")
        new_node = Node(data)
        new_node.nextNode = node.nextNode
        node.nextNode = new_node
        pass

l = LinkedList()
a = Node(1)
b = Node(2)
c = Node(3)
a.nextNode = b
b.nextNode = c
c.nextNode = None
l.headval = a
l.print_list()
l.Beggining(0)
l.End(4)
l.End(5)
l.print_list()
l.Between(b,100)
l.print_list()
