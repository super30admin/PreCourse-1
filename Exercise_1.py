'''
# Exercise_1 : Implement Stack using Array.

# Author: Neha Doiphode
# Date  : 06-15-2022

# Approach:
    Stack is Last In First Out(LIFO) type of data structure.
    Built in operations provided by python list (array-like data structure) is used to implement a stack.

# Time Complexity                            : Please check method doc-strings below.
# Space Complexity                           : O(n), to create a list with n elements.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this    : Nothing critical.
'''


class myStack:
     def __init__(self):
         self._stack = []

     def isEmpty(self):
         '''
         Time complexity: O(n), as we find length of the list/array to decide if the stack is empty.
                          Alternative approach would be to maintain a "_size" variable and increment it on each push operation.
                          And decrement it on each pop operation.
                          When we need to check if the stack isEmpty or not, we simply check _size and return the result to be True if 0 else False.
         '''
         return (len(self._stack) == 0)

     def push(self, item):
         '''
         Time complexity:
                          * For dynamic size arrays: Amortized O(1) worst case

                            After reserved number of 'n' elements are appended,
                            resources need to be reallocated with new set of n elements followed by O(1) append operation for the new element.
                            So, if n = 4 initially, for 5th element, 2 * n elements need to be reallocated
                            and then push operation for the 5th element can happen.

                            So, if, n = 4 followed by n = 8. Essentially
                            1. 4 * O(1) push operations.
                            2. O(n)(4 + 4) for pushing n elements onto the list after reallocation.

                            So on average, for each element O(n)/n = O(1), if we amortize per element.

                          * For fixed size arrays: O(1) as the top is moved simply to the right.
         '''
         self._stack.append(item)

     def pop(self):
         '''
         Time complexity: O(1) as the top is moved to the left as remove the last element of the list/array.
         '''
         item = self._stack.pop()
         return item

     def peek(self):
         '''
         Time complexity: O(1) as we simply return the top position.
         '''
         return self._stack[-1]

     def size(self):
         '''
         Time complexity: O(n), each element will be counted once depending on total number of elements present in the list/array.
         '''
         return len(self._stack)

     def show(self):
         return self._stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
