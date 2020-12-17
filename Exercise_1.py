'''
Time Complexity :
init(): O(1)
isEmpty(): O(1)
push(): O(1)
pop(): O(1)
peek(): O(1)
size(): O(1)
show(): O(1)

Space Complexity :
init(): O(1)
isEmpty(): O(1)
push(): O(1)
pop(): O(1)
peek(): O(1)
size(): O(1)
show(): O(1)

Did this code successfully run on Leetcode :
Didnt run since the identifiers used had different names and I was running late to individually rename all.

Any problem you faced while coding this :
No.
'''

#Your code here along with comments explaining your approach
class myStack:
    def __init__(self):
        self.stackk = []
        self.size = 0

    def isEmpty(self):
        if len(self.stackk) == 0:
            return True
        return False

    def push(self, item):
        self.stackk.append(item)
        self.size += 1

    def pop(self):
        top_elem = self.stackk[-1]
        self.stackk = self.stackk[0:len(self.stackk)]
        self.size -= 1
        return top_elem

    def peek(self):
        return self.stackk[-1]

    def size(self):
        return self.size

    def show(self):
        return self.stackk


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
