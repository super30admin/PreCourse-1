class StackAsLinkedList:
	class Node:
		def __init__(self, dataval=None):
			self.dataval = dataval
			self.nextval = None

	def __init__(self):
		self.root = None
		self.lastNode = None

	def isEmpty(self):
		if self.root == None:
			return True
		else:
			return False

	def push(self, data):
		if self.isEmpty():
			self.root = self.Node(data)
			self.lastNode = self.root
		else:
			temp = self.Node(data)
			self.lastNode.nextval = temp
			self.lastNode = self.lastNode.nextval

	def pop(self):
		if self.isEmpty():
			print("Stack Undeflow")
			return 0
		else:
			if self.root.nextval == None:
				data = self.root.dataval
				self.root = None
				self.lastNode = None
				return data
			else:
				temp = self.root
				while(temp.nextval.nextval != None):
					temp = temp.nextval
				data = temp.nextval.dataval
				temp.nextval = None
				self.lastNode = temp
				return data

	def peek(self):
		if self.isEmpty():
			print("Stack Undeflow")
			return 0
		else:
			return self.lastNode.dataval

if __name__=="__main__":
	sll = StackAsLinkedList()
	print(sll.pop(), "Popped from stack")
	sll.push(10)
	sll.push(20)
	sll.push(30)
	print(sll.pop(), "Popped from stack")
	print("Top element is", sll.peek()); 