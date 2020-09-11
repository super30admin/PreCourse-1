class myStack:
     def __init__(self):
          self.arr=[0 for i in range(0,10)]
          self.next_index=0
          self.num_elements=0
         
     def isEmpty(self):
          return self.num_elements == 0

         
     def push(self, item):
          # if self.next_index == len(self.arr):
          #      self._handle_stack_capacity_full()
     
          self.arr[self.next_index] = item
          self.next_index += 1
          self.num_elements += 1
          
     def _handle_stack_capacity_full(self):
        old_arr = self.arr

        self.arr = [0 for _ in range( 2* len(old_arr))]
        for index, element in enumerate(old_arr):
            
            self.arr[index] = element 
         
     def pop(self):
          if self.isEmpty():
            self.next_index = 0
            return None
          temp=self.arr.pop(self.next_index-1)
          self.next_index -= 1
          self.num_elements -= 1
          return temp
        
        
     def peek(self):
          if self.isEmpty()==True:
            return
          return self.arr[self.next_index-1]
        
     def size(self):
          return self.num_elements
         
     def show(self):
          if self.isEmpty==True:
            return
          for f in range(self.next_index):
               print(self.arr[f])  
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.show()
