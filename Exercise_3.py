class LinkedList:
	class Node:
		def __init__(self, dataval=None):
			self.dataval = dataval
			self.nextval = None

	def __init__(self):
		self.head = None

	def insert(self, data):
		tempNode = self.Node(data)
		if self.head == None:
			self.head = tempNode
		else:
			temp = self.head
			while(temp.nextval != None):
				temp = temp.nextval
			temp.nextval = tempNode

	def printList(self):
		if self.head == None:
			print("List is empty")
		else:
			print("Values in the list are :")
			temp = self.head
			while(temp != None):
				print(temp.dataval)
				temp = temp.nextval

if __name__=="__main__":
	llist = LinkedList()
	llist.insert(1)
	llist.insert(2)
	llist.insert(3)
	llist.insert(4)
	llist.insert(5)
	llist.printList()