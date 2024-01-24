#225. Implement Stack using Queue

#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : Get the Top / peek element

#Your code here along with comments explaining your approach

class MyStack(object):

    def __init__(self):
        self.length = 0
        self.data = {}

# get the nth element from the array
    def get(self, index):
        return self.data[index]
    
#Checking if the array is empty
    def empty(self):
        return self.length == 0
            
#Returning the size of the array        
    def size(self):
        return self.length
    
#Iterating and returning the array length 
    def show(self):
        #print array
        for i in range(self.length):
            print(self.data[i])

#pushing an element
    def push(self, item):
        self.data[self.length] = item
        self.length += 1
        return self.length

#poping an element
    def pop(self):
        if self.length == 0:
            return None
        
        poppedItem = self.data[self.length -1]
        self.data[self.length -1] = None
        self.length -= 1

        return poppedItem

#Inserting an element at a specific index    
    def insert(self, index, item):
        if index > self.length -1 or index < 0:
            return None
        
        #increase length of the array by +1
        self.length += 1

        for i in range(self.length -1, index - 1, -1):
            self.data[i] = self.data[i -1]

        self.data[index] = item

        return self.data

#peek / top of the element, it shoud be last as head == last element after pushing an element into the array
    def top(self):
        if self.length == 0:
            return None
        return self.data[self.length - 1]
        
#Remoing an element from the specific index
    def remove(self, index):
        if index > self.length - 1:
            return None
               
        removedItem = self.data[index]

        #shift items inward
        for i in range(index, self.length - 1):
            self.data[i] = self.data[i+1]
        
       #Reduced the length of the array
        self.length -= 1

        return removedItem


#Your MyStack object will be instantiated and called as such:
#obj = MyStack()
#obj.push(x)
#param_2 = obj.pop()
#param_3 = obj.top()
#param_4 = obj.empty()