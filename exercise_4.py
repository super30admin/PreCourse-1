class node:
	def __init__(self,data):
		
		self.left=None
		self.right=None
		self.data=data

	def insert(self,data):
		if self.data:
			if data<self.data:
				if self.left is None:
					self.left=node(data)
				else:
					self.left.insert(data)
			elif data > self.data:
				if self.right is None:
					self.right = node(data)
				else:
					self.right.insert(data)
		else:
			self.data=data

					
		

	def printtree(self):
		if self.left:
			self.left.printtree()
			print(self.left.data)
			if self.right:
				self.right.printtree()
				print(self.right.data)

s=node(12)
s.insert(6)
s.insert(14)
s.insert(3)

s.printtree()

