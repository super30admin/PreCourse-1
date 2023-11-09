
'''
// Time Complexity :
    - O(N) all three operations
// Space Complexity :
    - O(N) where as N is number of nodes appended
// Did this code successfully run on Leetcode :
    - No suitable LeetCode problem :(

// Any problem you faced while coding this :
    - Initially tried implementing remove without whiteboarding and struggled.
    - After I went back to the board, the problem was easy to solve.

// Your code here along with comments explaining your approach
    - See comments inline.
'''


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self,data=None):
        """
        Create a new singly-linked list.
        Takes O(1) time. 
        """
        '''
            Head would be initialized if an instnace is passed with a data
        '''
        self.head = None

        if data is not None:
            self.head=ListNode(data)
        

    def append(self, data) -> None :
        """
        Insert a new element at the end of the list.
        Takes O(n) time.  N is number of elements in LinkedList
        """
        '''
        1. HEAD is None
        2. Append to tail
        '''
        if self.head is None:
            self.head=ListNode(data)
        
        node=self.head
        while node.next is not None:
            node=node.next
        
        node.next=ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(N) time.  N is number of elements in LinkedList
        """
        '''
            1. HEAD is None
            2. Iterate through nodes and find
        '''

        node = self.head
        if node is None:
            return None

        while node.next is not None:
            if node.data==key:
                return node.data
            node=node.next

        if node.data==key:
            return node.data
        else:
            return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(N) time, N is number of elements in LinkedList
        """

        '''
        Remove could have been any one of the following,
            1. HEAD is None     - Nothing to do
            2. remove HEAD      - make head as head.next
            3. remove MID/TAIL  - Iterate until next node is not None| 
                                 When you find next node as to be removed - set next as next.next

        '''        

        if self.head is None:
            return 'No head'
        
        tmp=None
        if self.head.data==key:
            tmp=self.head
            self.head=self.head.next
            return 'Removed '+str(key)
        
        node=self.head
        while node.next is not None:
            if node.next.data==key:
                node.next=node.next.next
                return 'Removed '+str(key)
            else:
                node=node.next
        

            

        
ll=SinglyLinkedList()

while True:
    print('append')
    print('find <key>')
    print('remove <key>')

    do=input('what do you want to do ?').split()

    op=do[0].strip().lower()
    if op=='append':
        ll.append(int(do[1]))
    elif op=='find':
        print(ll.find(int(do[1])))
    elif op=='remove':
        print(ll.remove(int(do[1])))
    elif op=='quit':
        break


