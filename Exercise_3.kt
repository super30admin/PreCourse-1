// Time Complexity: insert() - O(n), printList() - O(n)
// Space Complexity: O(n) where n = number of nodes in the list

class LinkedList {
    var head: Node? = null

    class Node(var data: Int, var next: Node? = null)
}

fun insert(list: LinkedList, data: Int): LinkedList {
    val newNode = LinkedList.Node(data)

    // If the Linked List is empty, make the new node as head
    if (list.head == null) {
        list.head = newNode
    } else {
        // Else traverse till the last node and insert the new_node there
        var last = list.head!!
        while (last.next != null) {
            last = last.next!!
        }
        last.next = newNode
    }
    // Return the list by head
    return list
}

fun printList(list: LinkedList) {
    var current = list.head
    while (current != null) {
        print("${current.data} ")
        current = current.next
    }
    println()
}

fun main() {
    val list = LinkedList()

    // Insert the values
    insert(list, 1)
    insert(list, 2)
    insert(list, 3)
    insert(list, 4)
    insert(list, 5)

    // Print the LinkedList
    printList(list)
}
