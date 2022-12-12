package main

type listNode struct {
	val  int
	next *listNode
}

type LinkedList struct {
	head *listNode
	tail *listNode
}

func (l *LinkedList) Append(x int) {
	l.pushToHead(x)
}
func (l *LinkedList) Prepend(x int) {
	l.pushToTail(x)
}

func (l *LinkedList) pushToHead(x int) {
	newHead := &listNode{val: x}
	if l.head == nil {
		l.head = newHead
		l.tail = newHead
		return
	}
	newHead.next = l.head
	l.head = newHead
}

func (l *LinkedList) pushToTail(x int) {
	newNode := &listNode{val: x}
	if l.head == nil {
		l.head = newNode
		l.tail = newNode
		return
	}
	l.tail.next = newNode
	l.tail = newNode
}

func (l *LinkedList) PopFromHead() *listNode {
	if l.head == nil {
		panic("LL is empty, nothing to remove from head")
	}
	out := l.head
	newHead := l.head.next
	l.head.next = nil
	l.head = newHead
	return out
}

func (l *LinkedList) RemoveFromTail() *listNode {
	if l.head == nil {
		panic("LL is empty")
	}
	// when we only have 1 node
	if l.head == l.tail {
		out := l.head
		l.head = nil
		l.tail = nil
		return out
	}
	curr := l.head
	var prev *listNode
	for curr.next != nil {
		prev = curr
		curr = curr.next
	}
	prev.next = nil
	l.tail = prev
	return curr
}
