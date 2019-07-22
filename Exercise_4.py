import queue

class GFG:
	class Node:
		def __init__(self, dataval=None):
			self.data = dataval
			self.left = None
			self.right = None

	def __init__(self):
		self.root = None
		self.temp = self.root

	def inorder(self, temp):
		if(temp == None):
			return
		self.inorder(temp.left)
		print(temp.data, " ")
		self.inorder(temp.right)

	def insert(self, temp, key):
		q = queue.Queue()
		if temp == None:
			temp = self.Node(key)
		else:
			q.put(temp)
			while not q.empty():
				ele = q.get()
				if ele.left == None:
					ele.left = self.Node(key)
					break
				else:
					q.put(ele.left)
				if ele.right == None:
					ele.right = self.Node(key)
					break
				else:
					q.put(ele.right)

	def main(self):
		self.root = self.Node(10)
		self.root.left = self.Node(11)
		self.root.left.left = self.Node(7)
		self.root.right = self.Node(9)
		self.root.right.left = self.Node(15)
		self.root.right.right = self.Node(8)
		print("Inorder traversal before insertion:")
		self.inorder(self.root)
		self.insert(self.root, 12)
		print("\nInorder traversal after insertion:")
		self.inorder(self.root)

if __name__=="__main__":
	BT = GFG()
	BT.main()