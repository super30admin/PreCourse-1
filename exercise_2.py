class node():
	def __init__(self, data):
	  self.data=data
	  self.next= None
class stack():
	 def __init__(self):
	 	self.head= None

	 def push(self,value):
	    if self.head is None:
	    	 self.head=node(value)
	    else:
	       new_node=node(value)
	       new_node.next=self.head
	       self.head=new_node

	 def pop(self):
	  	if self.head is 0:
	  		return("list is empty")
	  	else:
	  	   temp=self.head.data
	  	   self.head=self.head.next
	  	   print(temp)

	 def isempty(self):
	  	if self.head == None:
	  		print("stack is empty")
	  	else:
	  		print("stack is not empty")

	 def top(self):
	 	if self.head == None:
	 		print("stack is empty")
	 	else:
	 		value=self.head.data
	 		print(value)



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
	 	temp=self.head
	 	while temp!=0:
	 		temp.next=temp
	 		print(temp)

	         


s=stack()
s.isempty()
s.push(10)
s.push(20)
s.push(40)
s.pop()
s.isempty()
s.top()
s.len()
