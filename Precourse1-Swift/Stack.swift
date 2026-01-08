//
//  Stack.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 12/16/25.
//

struct Stack<T> {
    private var storage: [T] = []
    
    //checks if the stack is empty
    var isEmpty: Bool {
        return storage.isEmpty
    }
    
    //returns the number of elements in the stack
    var count: Int {
        return storage.count
    }
    
    //adds a new element to the top of the stack
    mutating func push(element: T) {
        storage.append(element)
    }
    
    //pop - pops the last element and returns the last element
    mutating func pop() -> T? {
        return storage.popLast()
    }
    
    func peek() -> T? {
        return storage.last
    }
    
    func printDescription() {
        for element in storage {
            print(element)
        }
    }
}

struct StringStack {
    private var stringStack = Stack<String>()

    init() {
        stringStack.push(element: "first")
        stringStack.push(element: "second")
        stringStack.push(element: "third")
        
        //check the top element
        if let topElement = stringStack.peek() {
            print("the top element is \(topElement)")
        } else {
            print("The stack is empty")
        }
        
        let poppedItem = stringStack.pop()
        print("popped item is \(poppedItem ?? "NA")")
        
        print("is stack empty? \(stringStack.isEmpty)")
        print("stack size \(stringStack.count) *** stack is \(stringStack.printDescription())")
    
        print("string stack \(stringStack)")
        //Example with integers
        var intStack = Stack<Int>()
        intStack.push(element: 1)
        intStack.push(element: 2)
        print("stack count \(intStack.count)")
    }
}
