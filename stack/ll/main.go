package main

import "fmt"

func main() {
	fmt.Println("------------")
	st := NewStack()
	push(st, 5)
	push(st, 4)
	push(st, 3)
	push(st, 2)
	push(st, 1)
	print(st)                       // 1 2 3 4 5
	fmt.Println("peek: ", peek(st)) // 1
	print(st)                       // 1 2 3 4 5
	fmt.Println("pop: ", pop(st))   // 1
	print(st)                       // 2 3 4 5
	fmt.Println(pop(st))            // 2
	fmt.Println(pop(st))            // 3
	fmt.Println(pop(st))            // 4
	fmt.Println(pop(st))            // 5

}

type listNode struct {
	val  int
	next *listNode
}

type stack struct {
	head *listNode
}

func NewStack() *stack {
	return &stack{
		head: nil,
	}
}

func isEmpty(s *stack) bool {
	return s.head == nil
}

func peek(s *stack) int {
	if isEmpty(s) {
		panic("stack is empty")
	}
	return s.head.val
}

func push(s *stack, x int) {
	newHead := &listNode{val: x}
	if s.head == nil {
		s.head = newHead
		return
	}
	newHead.next = s.head
	s.head = newHead
}

func pop(s *stack) int {
	if isEmpty(s) {
		panic("stack is empty")
	}
	out := s.head.val
	if s.head.next == nil {
		s.head = nil
	} else {
		newHead := s.head.next
		s.head.next = nil
		s.head = newHead
	}
	return out
}

func print(s *stack) {
	msg := "TOP -> "
	curr := s.head
	for curr != nil {
		msg += fmt.Sprintf("%v ", curr.val)
		curr = curr.next
	}
	fmt.Println(msg)
}
