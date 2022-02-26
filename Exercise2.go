package main

import (
	"fmt"
)

type StackNode struct {
	Val  int
	Next *StackNode
}

type Stack struct {
	head *StackNode
}

func NewStack() *Stack {
	return &Stack{
		head: nil,
	}
}

func (s *Stack) isEmpty() bool {
	return s.head == nil
}

func (s *Stack) Push(x int) {
	newHead := &StackNode{Val: x}
	if s.head == nil {
		s.head = newHead
		return
	}
	newHead.Next = s.head
	s.head = newHead
}

func (s *Stack) Pop() int {
	if s.isEmpty() {
		panic("Stack is empty, nothing to pop....")
	}
	out := s.head.Val
	newHead := s.head.Next
	s.head.Next = nil
	s.head = newHead
	return out
}

func (s *Stack) Peek() int {
	if s.isEmpty() {
		panic("Stack is empty, nothing to pop....")
	}
	return s.head.Val
}

func (s *Stack) printStack() {
	if s.head == nil {
		return
	}
	msg := ""
	current := s.head
	for current != nil {
		msg += fmt.Sprintf("%v", current.Val)
		if current.Next != nil {
			msg += "->"
		}
		current = current.Next
	}
	fmt.Println(msg)
}

func main() {
	s := NewStack()
	s.Push(10)
	s.Push(20)
	s.Push(30)

	s.printStack()
	fmt.Println("Peek: ", s.Peek())
	s.printStack()

	top := s.Pop()
	fmt.Println("Top: ", top)
	s.printStack()
}
