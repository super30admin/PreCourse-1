# Time complexity:O(1)
# Space complexity: 0(n)
# Did code run successfully on leetcode: yes
# Any problem you faced: No



class myStack:
     def __init__(self):
         self.ini = []
     def isEmpty(self):
         return self.ini == []
     def push(self, item):
         self.ini.append(item)
     def pop(self):
         self.ini.pop()

     def peek(self):
         return self.ini[len(self.ini) - 1]
     def size(self):
         return len(self.ini)
     def show(self):
         return self.ini

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
