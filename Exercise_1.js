class myStack {
  constructor() {
    this.arr = []
  }

  isEmpty() {
    if (this.arr.length == 0) return true
    return false
  }

  push(item) {
    this.arr.push(item)
  }

  pop() {
    this.arr.pop()
  }

  size() {
    return this.arr.length
  }

  peek() {
    return this.arr[this.arr.length-1]
  }

  show() {
    return this.arr
  }
}