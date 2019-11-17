class Node(object):
  def __init__(self,data):
    self.data=data
    self.nextnode=None

A=Node(1)
B=Node(2)
C=Node(3)

A.nextnode=B
B.nextnode=C
