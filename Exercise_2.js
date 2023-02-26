class Node {
    constructor(data){
      this.data = data
      this.nextElement = null
    }
  }
  
  class LinkedList {
    constructor() {
      this.head = null
    }
    
    isEmpty() {
      return this.head === null
    }
    
    peek() {
      return this.head !== null ? 'Top element is ' + this.head.data : 'Add node data'
    }
    
    push(data) {
      let incomingNode = new Node(data)
      let existingNode
      
      existingNode = this.head
      incomingNode.nextElement = existingNode
      this.head = incomingNode
      
      return 'Added incoming node ' + JSON.stringify(this.head)
    }
    
    pop() {
      if (this.isEmpty()) return 'Please add nodes before deleting'
      
      let existingNode = this.head
      this.head = existingNode.nextElement
      return 'Deleted top node ' + JSON.stringify(existingNode.data)
    }
  }
  
  const myLinkedList = new LinkedList()
  //Initial empty Linked List
  console.log(myLinkedList.isEmpty())

  //Pushing nodes
  console.log(myLinkedList.push(1))
  console.log(myLinkedList.push(2))

  //Get top node
  console.log(myLinkedList.peek())

  //Delete top node
  console.log(myLinkedList.pop())

  //Get updated top node
  console.log(myLinkedList.peek())

  //Delete new top node
  console.log(myLinkedList.pop())

  //Get updated top node
  console.log(myLinkedList.peek())
  