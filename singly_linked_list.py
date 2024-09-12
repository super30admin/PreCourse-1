'''


'''


class Node:
    def __init__(self,val):
        self.val = val
        self.next = None


if __name__=="__main__":
    elements = [1,2,3,4,5]
    head = Node(0)
    temp = head
    for element in elements:
        temp.next = Node(element)
        temp = temp.next
    
    head = head.next

    temp = head
    while temp:
        print(temp.val)
        temp = temp.next