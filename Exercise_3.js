//Time Complexity is O(n) since it has to traverse the entire list before adding the new node at the end.
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
    
    
    push(data) {
      let incomingNode = new Node(data)
      let existingNode = this.head
      
      if(existingNode === null) {
        incomingNode.nextElement = existingNode
        return this.head = incomingNode
      } 
      
      while(existingNode && existingNode.nextElement !== null){
        existingNode = existingNode.nextElement;
      }
  
      existingNode.nextElement = incomingNode;
      
      return 'Added incoming node ' + JSON.stringify(this.head)
    }
  }
  
  const myLinkedList = new LinkedList()
  
  //Pushing data at the end of the list. Prints the entire list everytime there is a new push
  console.log(myLinkedList.push(1))
  console.log(myLinkedList.push(2))
  console.log(myLinkedList.push(3))
  
  