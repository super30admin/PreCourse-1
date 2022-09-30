# Implementing Stack using an array. 

# Time complexity:
# isEmpty function - O(1)
# push function - O(1)
# pop function - O(1)
# peek function - O(1)
# size function - O(n)
# show function - O(n)
# Space complexity:
# Any problem you faced while coding this: 

class myStack:

    # This is the constructor of the myStack class
    def __init__(self):
        self.array = []

    # This isEmpty function will check whether or not the stack is empty and returns a boolean value.
    # This is same as checking the length of the list.
    def isEmpty(self):
        if self.array!= []:
            return False
        else:
            return True

    # This push function pushes the given element on to the top of the stack.
    # It is sames as appending the given element to the end of the list.
    def push(self, item):
        self.array.append(item)
        return

    # This pop function pops the element that is on the top of the stop.
    # This is same as popping the last element from the stack.
    def pop(self):
        if len(self.array)>0:
            return(self.array.pop())
             
        else:
            return("The Stack is empty")
             

    # This peek function returns the top element of the stack, which is the last element in the list. 
    def peek(self):
        return(self.array[-1])

    # This function returns the size of the stack. This can be done by returning the length of the list. 
    def size(self):
        return len(self.array)

    # This show function prints the elements of the stack. 
    # As the elements in the stack are printed from the top of the stack to the bottom of the stack,
    # We print the elements of the list from backwards to the beginning of the list. 
    def show(self):
        length = len(self.array)
        for i in range(length-1, -1, -1):
            print(self.array[i])
        return
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.show()
s.pop()
s.push(3)
print(s.isEmpty())
