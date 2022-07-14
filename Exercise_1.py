'''
myStack:
  Space Complexity: O(n) where n is the number of current elements in the stack
isEmpty():
  Time Complexity: O(1) as we simply check current self.length and return a boolean
push():
  Time Complexity: O(1) as we simply append the element to the end of self.stack and return a boolean
pop():
  Time Complexity: O(1) as we simply pop the last element at the end of self.stack and return it
peek():
  Time Complexity:  O(1) as we simply peek the last element at the end of self.stack and return it
size():
  Time Complexity: O(1) as we simply return self.length
show():
  Time Complexity: O(1) as we simply return self.stack
  
'''


class myStack:
  # Please read sample.java file before starting.
  # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []
        self.length = 0

    def isEmpty(self):
        if self.length == 0:
            return True
        return False

    def push(self, item):
        self.stack.append(item)
        self.length += 1
        return True

    def pop(self):
        # If empty return 0 and print "Stack Underflow"
        if not self.isEmpty():
            self.length -= 1
            return self.stack.pop()
        print("Stack Underflow")
        return 0

    def peek(self):
        if self.isEmpty():
            return None
        return self.stack[-1]

    def size(self):
        return self.length

    def show(self):
        return self.stack


# Default Test Case
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

######################Additional Test Cases##########################
# (1) Stack isEmpty
s = myStack()
assert s.isEmpty(
) == True, f"Expected True as output but instead got {s.isEmpty()}"
s.push('1')
s.push('2')
assert s.isEmpty(
) == False, f"Expected False as output but instead got {s.isEmpty()}"

# (2) Push Stack and Show
s = myStack()
assert s.show() == [], f"Expected [] as output but instead got {s.show()}"
s.push(1)
s.push(2)
s.push(3)
op = s.push(4)
assert op == True, f"Expected True as output but instead got {op}"
assert s.show() == [
    1, 2, 3, 4], f"Expected [1,2,3,4] as output but instead got {s.show()}"

# (3) Stack Pop
s = myStack()
a = s.pop()
assert a == 0, f"Expected 0 as output but instead got {a}"
s.push('1')
s.push('2')
a = s.pop()
assert a == '2', f"Expected 2 as output but instead got {a}"
a = s.pop()
assert a == '1', f"Expected 1 as output but instead got {a}"
a = s.pop()
assert a == 0, f"Expected 0 as output but instead got {a}"

# (4) Peek Stack
s = myStack()
assert s.peek() == None, f"Expected None as output but instead got {s.peek()}"
s.push(1)
s.push(2)

assert s.peek() == 2, f"Expected 2 as output but instead got {s.peek()}"
s.pop()
assert s.peek() == 1, f"Expected 1 as output but instead got {s.peek()}"

# (5) Size of stack
s = myStack()
assert s.size() == 0, f"Expected 0 as output but instead got {s.size()}"
s.push('1')
s.push('2')
assert s.size() == 2, f"Expected 2 as output but instead got {s.size()}"
s.pop()
assert s.size() == 1, f"Expected 1 as output but instead got {s.size()}"
#######################################################################
