# Time Complexity : append O(1) Find O(N) Remove O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode :

# Any problem you faced while coding this :

# Your code here along with comments explaining your approach

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
        self.head = ListNode()
        self.curr= None
        self.size= 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if(self.head.data==None):
            self.head.data=data
            self.curr=self.head
            self.size+=1
        else:
            new_node=ListNode(data)
            self.curr.next=new_node
            self.curr=self.curr.next
            self.size+=1
            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp= self.head
        while(temp!= None):
            if(temp.data==key):
                return temp
            temp=temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp= self.head.next
        prev=self.head
        if(key==self.head.data):
            self.head=self.head.next
            print(prev.data, "has been removed")
        else:
            while(temp!= None):

                if(temp.data==key):
                    prev.next=temp.next
                    temp.next= None
                    break
                prev=temp
                temp=temp.next
            print(temp.data, "has been removed")
        
single_linked_list= SinglyLinkedList()
single_linked_list.append(10)
single_linked_list.append(11)
single_linked_list.append(12)
single_linked_list.append(13)
single_linked_list.append(14)

print(single_linked_list.find(10).data, "found")
print(single_linked_list.remove(10))
print(single_linked_list.find(12).data, "found")

