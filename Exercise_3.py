# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class ListNode:
	"""
	A node in a singly-linked list.
	"""
	def __init__(self, data=None, next=None):
		self.data = data
		self.next = next
    
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
		newNode = ListNode(data=data)
		if self.head == None:
			self.head = newNode
			return
		cur = self.head
		while cur.next != None:
			cur = cur.next
		cur.next = newNode
		
        
	def find(self, key):
		"""
		Search for the first element with `data` matching
		`key`. Return the element or `None` if not found.
		Takes O(n) time.
		"""
		cur = self.head
		while cur != None:
			if cur.data == key:
				return cur.data
			cur = cur.next
		return None
        
	def remove(self, key):
		"""
		Remove the first occurrence of `key` in the list.
		Takes O(n) time.
		"""
		if self.head != None:
			if self.head.data == key:
				self.head = self.head.next
				return
		cur = self.head
		prev = None
		while cur != None:
			if cur.data == key:
				prev.next = cur.next
				break
			prev = cur
			cur = cur.next
