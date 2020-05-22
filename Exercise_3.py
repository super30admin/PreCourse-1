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
		searchnode = self.head
		if not searchnode:
			self.head = ListNode(data = data)
			return
		while searchnode.next:
			searchnode = searchnode.next

		searchnode.next = ListNode(data = data)

		
	def find(self, key):
		"""
		Search for the first element with `data` matching
		`key`. Return the element or `None` if not found.
		Takes O(n) time.
		"""
		findnode = self.head
		while(findnode):
			if findnode.data == key:
				return findnode.data
			findnode = findnode.next    
		return None
		
	def remove(self, key):
		"""
		Remove the first occurrence of `key` in the list.
		Takes O(n) time.
		"""
		removenode = self.head
		while(removenode):
			if removenode.data == key:
				self.head = removenode.next
				return

			elif removenode.next.data == key:
				if removenode.next.next:
					removenode.next = removenode.next.next
					return
				else:
					removenode.next = None
					return
			removenode = removenode.next
		return