class node():
	def __init__(self, data):
	  self.data=data
	  self.next= None

class linkedlist():
	 def __init__(self):
	 	self.head=None

	 def push(self,value):
	    if self.head==None:
	    	 self.head=node(value)
	    else:
	       new_node=node(value)
	       new_node.next=self.head
	       self.head=new_node
	
	 def append(self,e):
		if self.head is None:
			new_node=node(e)
			self.head=new_node
		else:
			temp=self.head
			while temp.next!= None: 
				temp=temp.next
			new_node=node(e)
			temp.next=new_node

	 def len(self):
	 	if self.head is None:
	 		print("list is empty le is 0")

	 	else:

		 	temp=self.head
		 	le=1
		 	while temp.next!=None:
		 		le+=1
		 		temp=temp.next
		print(le) 

	 def printlist(self):
	 	if self.head is None:
	 		print("list is empty")
	 	else:
	 		temp=self.head
	 		while temp!=None:
	 			print(temp.data)
	 			temp=temp.next
		



	 
	     
s=linkedlist()
s.push(10)
s.push(20)
s.push(40)
s.append(70)
s.len()
s.printlist()
