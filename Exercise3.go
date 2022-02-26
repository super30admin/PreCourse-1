package main

import (
	"fmt"
)
type ListNode struct {
  Val int
  Next *ListNode
}

func insert(head *ListNode, val int) *ListNode {
  if head == nil {
    head = &ListNode{Val: val}
    return head
  }
  current := head
  // 1-2-3-4
  for current.Next != nil  {
    current = current.Next
  }
  current.Next = &ListNode{Val: val}
  return head
}
func printList(s *ListNode) {
	if s == nil {
		return
	}
	msg := ""
	current := s
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
  var head *ListNode
  head = insert(head, 10)
  head = insert(head, 20)
  head = insert(head, 30)
  printList(head)
}
