package main

import (
	"fmt"
)

type Stack struct {
  items []int
}

// time: o(1)
// space: o(1) -- len of items == 0
func NewStack() *Stack {
  return &Stack{
    items: []int{},
  }
}

// time: o(1)
// space: o(1)
func (s *Stack) isEmpty() bool  {
  return len(s.items) == 0
}

// time: o(1) -- well since I am using dynamic slice here, it may become o(n) because if pre-allocated space is no longer enough, go has to dupe 
// space: o(1) -- well since I am using dynamic slice here, it may become o(n) because if pre-allocated space is no longer enough, go has to dupe
func (s *Stack) Push(x int) {
  s.items = append(s.items, x)
}

// time: o(1)
// space: o(1)
func (s *Stack) Pop() int {
  if s.isEmpty() {
    panic("Stack is empty, nothing to pop....")
  }
  out := s.items[len(s.items)-1]
  s.items = s.items[:len(s.items)-1]
  return out
}

// time and space: o(1)
func (s *Stack) Peek() int {
  if s.isEmpty() {
    panic("Stack is empty, nothing to pop....")
  }
  return s.items[len(s.items)-1]
}



func main() {
	s := NewStack()
  s.Push(10)
  fmt.Println("Peek: ", s.Peek())
  fmt.Println("isEmpty: ", s.isEmpty())

  top := s.Pop()
  fmt.Println("Top: ", top)
  fmt.Println("isEmpty: ", s.isEmpty())
  s.Peek()
}
