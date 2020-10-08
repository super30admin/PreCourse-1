 # Time Complexity : append O(n) find O(n) remove O(n) overall O(n)
# Space Complexity :?
# Did this code successfully run on Leetcode :not checked yet
# Any problem you faced while coding this :
# Linklist
# nodes are keeping the track of there next element
# append 1
# append 2 // 1->2 // appending at the end the ListNode
#remove 1->2->3 remove 2 result 1->3(will change the next of 1 and point it to the 3)


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next

class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        tempNode=ListNode(data)
        tempHead=self.head
        if self.head==None:
            self.head=tempNode
        else:
            prev=None
            while tempHead!=None:
                prev=tempHead
                tempHead=tempHead.next
            prev.next=tempNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tempHead=self.head
        if self.head==None:
            return None
        else:
            #print(tempHead.data)
            while tempHead and tempHead.data!=key:
                #print("f")
                tempHead=tempHead.next
            if tempHead:
                return tempHead.data
            else:
                return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        tempHead=self.head
        if self.head==None:
            return None
        else:
            prev=None
            #print(tempHead.data)
            while tempHead and tempHead.data!=key:
                prev=tempHead
                tempHead=tempHead.next
            if tempHead:
                prev.next=tempHead.next
                del tempHead
            else:
                return None
    def display(self):
        temp=""
        tempHead=self.head
        while tempHead:
            temp += tempHead.data
            tempHead=tempHead.next
        return temp

s = SinglyLinkedList()

s.append('1')
print(s.find('1'))
print(s.remove('2'))
s.append('2')
s.append('3')
print(s.display())
print(s.find('2'))
s.remove('2')
print(s.find('2'))
print(s.find('1'))
