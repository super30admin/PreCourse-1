class myStack:
     def __init__(self):
        self.my_array = []
     def isEmpty(self):
        if len(self.my_array) == 0:
            return True
        else: 
            return False
     def push(self, item):
        self.my_array.append(item)
        print(item+ " -- pushed to the stack")
     def pop(self):
        return self.my_array.pop()
     def peek(self):
        return self.my_array[-1]
     def size(self):
        return len(self.my_array)
     def show(self):
        return self.my_array

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

# // Did this code successfully run on LeetCode?:
# //         No did not find the problems. 

# //     Problems faced while coding this:
# //         Nope

# //     Approach:
# //        defined the stack, understood what each fucntions have to do and then coded them. 