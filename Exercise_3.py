## Time Complexity : O(N)
## Space Complexity : O(N)
## Did this code successfully run on Leetcode : Yes
## Any problem you faced while coding this : No
##
##
## Your code here along with comments explaining your approach

class ListNode:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next_node = next_node


class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.head = new_node
            return
        current_node = self.head
        while current_node.next_node:
            current_node = current_node.next_node
        current_node.next_node = new_node

    def find(self, key):
        current_node = self.head
        while current_node:
            print(current_node.data, end=" -> ")
            current_node = current_node.next_node
        print("None")

    def remove(self, key):
        if self.is_empty():
            return

        if self.head.data == data:
            self.head = self.head.next_node
            return

        current_node = self.head
        while current_node.next_node and current_node.next_node.data != data:
            current_node = current_node.next_node

        if current_node.next_node:
            current_node.next_node = current_node.next_node.next_node