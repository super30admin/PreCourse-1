class myStack:
  #Time complexity: insert/Push  O(1), delete/Pop O(1), Size O(1), Peek O(1), Isempty O(1)
  #Space Complexity: O(N), Size of input elements

    MAX = 1000; 
    top=0; 

    def __init__(self):
      self.e=[]
         
    def isEmpty(self):
      return len(self.e)==0
         
    def push(self, item):
      
      if self.top >= self.MAX:
        print("Stack Overflow")
        return
      self.e.append(item)
      self.top+=1
      

    def pop(self):
      if self.isEmpty(): 
        return ("Stack is Empty")
      self.top-=1
      return (f"Popped Item from Stack: {self.e.pop()}")
      
        
    def peek(self):
      return (f"Top Element in stack:{self.e[-1]}")

    def size(self):
      return (f"Size of Stack: {self.top}")
         
    def show(self):
      return (f"Stack: {self.e}")

         

s = myStack()
s.push('1')
s.push('2')
s.push("3")
s.push("4")

print(s.size())
print(s.peek())
print(s.pop())
print(s.show())
