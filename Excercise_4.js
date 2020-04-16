//Insert an element in a Binary Tree.

class Node {
    constructor(value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
  
  class BinarySearchTree {
    constructor() {
      this.root = null;
    }
    insert(value) {
      let newNode = new Node(value);
      if (!this.root) {
        this.root = newNode;
        return this;
      }
      let current = this.root;
      while (true) {
        if (value === current.value) return undefined;
        else if (value < current.value) {
          if (!current.left) {
            current.left = newNode;
            return this;
          }
          else current = current.left;
        }
        else {
          if (!current.right) {
            current.right = newNode;
            return this;
          }
          else current = current.right;
        }
      }
    }
  }
  //     9
  //  4     20
  //1  6  15  170
  
  const tree = new BinarySearchTree();
  tree.insert(9)
  tree.insert(4)
  tree.insert(6)
  tree.insert(20)
  tree.insert(170)
  tree.insert(15)
  tree.insert(1)