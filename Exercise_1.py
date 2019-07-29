
def createStack():
    stack=[]
    return stack

def isEmpty(stack):
    return len(stack)==0

def push(stack,item):
    stack.append(item)
    print(item + " pushed")

def pop(stack):
    if(isEmpty(stack)):
        return -1
    return stack.pop()

def peek(stack):
    if isEmpty(stack):
        return - 1
    return stack[len(stack)-1]


if __name__== "__main__":

    stack1 = createStack()
    print(isEmpty(stack1))
    push(stack1, str(10))
    push(stack1, str(20))
    print(isEmpty(stack1))
    print(peek(stack1)+"item at top")
    push(stack1, str(30))
    push(stack1, str(200))
    print(peek(stack1))
    print(pop(stack1) + " popped from stack")
    print(pop(stack1) + " popped from stack")
    print(pop(stack1) + " popped from stack")
    print(pop(stack1) + " popped from stack")
    print(isEmpty(stack1))

