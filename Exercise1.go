package main

import (
	"fmt"
)

type Stack struct {
  items []int
}

func NewStack() *Stack {
  return &Stack{
    items: []int{},
  }
}

func (s *Stack) isEmpty() bool  {
  return len(s.items) == 0
}

func (s *Stack) Push(x int) {
  s.items = append(s.items, x)
}

func (s *Stack) Pop() int {
  if s.isEmpty() {
    panic("Stack is empty, nothing to pop....")
  }
  out := s.items[len(s.items)-1]
  s.items = s.items[:len(s.items)-1]
  return out
}

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
