// Time Complexity : O(1)
// Space Complexity : O(N)
// KOTLIN program to implement
// a Singly Linked List
class LinkedList {
    var head: Node? = null // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    class Node  // Constructor
        (var data: Int = 0) {
        var next: Node? = null
    }

    companion object {
        // Method to insert a new node
        fun insert(list: LinkedList?, data: Int): LinkedList {
            // Create a new node with given data
            val node = Node(data)

            // If the Linked List is empty,
            // then make the new node as head

            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
            // Return the list by head
            if(list == null){
                val list2 = LinkedList()
                list2.head = node
                return list2
            }else{
                if (list.head==null){
                    list.head = node
                    return list
                }
                var dummy = list.head
                while (dummy?.next != null){
                    dummy = dummy?.next
                }
                dummy?.next = node
                return list
            }


        }

        // Method to print the LinkedList.
        fun printList(list: LinkedList?) {
            // Traverse through the LinkedList
            if(list == null){
                return
            }
            var dummy = list.head
            // Print the data at current node
            // Go to next node
            while (dummy != null){
                println("data: ${dummy.data}")
                dummy = dummy.next
            }
        }

        // Driver code
        @JvmStatic
        fun main(args: Array<String>) {
            /* Start with the empty list. */
            var list = LinkedList()

            //
            // ******INSERTION******
            //

            // Insert the values
            list = insert(list, 1)
            list = insert(list, 2)
            list = insert(list, 3)
            list = insert(list, 4)
            list = insert(list, 5)

            // Print the LinkedList
            printList(list)
        }
    }
}