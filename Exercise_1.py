# Time Complexity : O(1)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class myStack:
    def __init__(self):
        self.arr = []

    def isEmpty(self):
        if len(self.arr) == 0:
            return True
        return False

    def push(self, item):
        self.arr.append(item)


    def pop(self):
        if not self.isEmpty():
            x = self.arr[len(self.arr)-1]
            del self.arr[len(self.arr)-1]
            return x
        return None

    def peek(self):
        if not self.isEmpty():
            return self.arr[len(self.arr)-1]
        return None

    def size(self):
        return len(self.arr)

    def show(self):
        return self.arr[::-1]
         

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.peek())
print(s.pop())
print(s.show())