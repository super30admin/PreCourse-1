class myStack:
     def __init__(self):
          self.mylist=[]
         
     def isEmpty(self):
          return self.mylist.__len__()>0
         
     def push(self, item):
          self.mylist.append(item)
         
     def pop(self):
          if self.mylist.__len__()>0:
               elemnt=self.mylist[len(self.mylist)-1]
               del self.mylist[len(self.mylist)-1]
               return elemnt
     def peek(self):
          if self.isEmpty():
               return self.mylist[len(self.mylist)-1]
        
     def size(self):
          if self.isEmpty():
           return self.mylist.__len__()
         
     def show(self):
          stackvalue=''
          for elemnt in self.mylist:
               stackvalue+=" "+elemnt
          return stackvalue


def main():
     s = myStack()
     s.push('1')
     s.push('2')
     s.push('12')
     s.push('23')
     s.push('11')
     s.push('28')
     print(s.peek())
     print(s.show())
     print(s.pop())
     print(s.show())
main()
