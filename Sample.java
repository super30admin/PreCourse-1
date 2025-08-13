// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/* 
Exercise 1 -> 
In the stack constructor, I initialized the top variable to be -1, indicating that there is no element in the stack right now (empty).

Anytime an element is added, we increment top first, then ww push in the provided value to a[top]. The edge case here is pushing to a stack which
is full. This case is handled by the if condition which checks if (top >= MAX-1).

For pop, we decrement the top variable, indicating that the element @ index top is going to be popped. Then we return the value @ index top + 1.
The edge case to be handled here is popping from an empty stack. This is handled by the if condition which checks whether top < 0.

For peek, we return the element @ the index top, after checking whether the stack is empty or not.

For isEmpty, we check if top == -1 (empty case).
*/

/* 
Exercise 2 -> 
Since stack is LIFO, we need to keep track of the last added element for O(1) pop and we need to be able to avoid a traversal for push/pop operations.
To achieve this, we can follow a 'add at head' approach, instead of adding at the tail of the linked list.

For push, first create a new node and assign the new node->data as the data to be pushed. Then make node->next point to root and then assign root to node.
For ex: if we have a linked list stack with element 10 and we push 20 on top =>
new node = 20
20 -> next = 10* (* = root). The list becomes 20->10*
make root as 20, the list becomes 20*->10

Now when we pop, we can first store root node in a temp variable as shown below:
temp = 20
Then we can make root point to root->next:
20->10*
we can then store 20 as return value and delete the temp node. This makes sure that the memory allocated using the `new` keyword is freed.
Edge case for pop is popping from empty stack, handled by the if condition at the beginning.
Final list will become: 10*->NULL

isEmpty is straightforward, if root == null, then we havent pushed anythign into the stack, so its empty.

Peek is also easy, just return value at root (if its not nullptr [edge case]).
*/

/*
Exercise 3 ->
For push (add at head), create the new node, make the next ptr of the new node point to head and make new node thhe new head.

For append (add at tail), create new node and assign its next ptr to nullptr. Then traverse to the end of the linked lsit and add this node to the end. 
Edge case for append -> if list is empty, simply create the new node and make it the head of the linked list.

For insertAfter, we get a reference to the node we need to insert after. So just create the new node and perform rewiring. Make the next ptr of new node 
point to the next pointer of the previous node. Then make the next pointer of the previous node point to the new node added. Edge case: If prev node 
provided is null then don't do anything and return.

For printList, traverse over the whole list and keep printing node values till we encounter a nullptr.
*/

/* TC and SC of each individuaL functions are mentioned on top of the respective code files. */