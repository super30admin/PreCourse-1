'''Time complexity:
push --> O(1)
pop --> O(1)
isEmpty --> O(1)
peek --> O(1)
size --> O(1)
show --> O(n) since looping from the reverse order 


Space Complexity
O(n) for array list
'''


class myStack:
    def __init__(self):
        self.ls = []
        self.c = 0   #for having the count 
         
    def isEmpty(self):
        if self.c==0: #if count is 0 then empty
            return True
        else:
            return False
    
    def push(self, item):
        self.ls.append(item)
        self.c+=1
    def pop(self):
        v = self.ls[-1]  #last element of the array
        del(self.ls[-1])
        self.c-=1
        return v
    
    def peek(self):
        return self.ls[-1]  #Top element 
    
    def size(self):
        return self.c
    def show(self):
        for i in range(self.c-1, -1, -1):
            print(self.ls[i],end =' ')      #Reverse wof the stack
    

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.pop())
s.show()