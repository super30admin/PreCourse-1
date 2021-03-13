class myStack:
     def __init__(self):
          print("Self loop")
     def isEmpty(self):
         print("self loop2")
     def push(self, item):
         print("self loop3")
     def pop(self):
        print("self loop4")
        
     def peek(self):
        print("self loop5")
     def size(self):
         print("self loop6")
     def show(self):
         print("self loop7")

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
