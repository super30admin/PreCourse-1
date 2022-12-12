package main

import (
	"fmt"
)

func main() {
	st := NewStack()
	st.push(5)
	st.push(4)
	st.push(3)
	st.push(2)
	st.push(1)
	st.print()             // 1 2 3 4 5
	fmt.Println(st.peek()) // 1
	st.print()             // 1 2 3 4 5
	fmt.Println(st.pop())  // 1
	st.print()             // 2 3 4 5
	fmt.Println(st.pop())  // 2
	fmt.Println(st.pop())  // 3
	fmt.Println(st.pop())  // 4
	fmt.Println(st.pop())  // 5
	//fmt.Println(st.pop())  // panic - stack is empty
}

type stack struct {
	items []int
}

func NewStack() *stack {
	s := new(stack)
	s.items = []int{} // initialize it so its not nil
	return s
}

func (s *stack) isEmpty() bool {
	return s.items == nil || len(s.items) == 0
}

func (s *stack) peek() int {
	if s.isEmpty() {
		panic("stack is empty, nothing to peek here..")
	}
	return s.items[len(s.items)-1]
}

func (s *stack) push(x int) {
	s.items = append(s.items, x)
}

func (s *stack) pop() int {
	if s.isEmpty() {
		panic("stack is empty, nothing to peek here..")
	}
	out := s.items[len(s.items)-1]
	s.items = s.items[:len(s.items)-1]
	return out
}

func (s *stack) print() {
	msg := "TOP -> "
	for i := len(s.items) - 1; i >= 0; i-- {
		msg += fmt.Sprintf("%v ", s.items[i])
	}
	fmt.Println(msg)
}
