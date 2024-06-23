// Exercise 1 - Implement Stack Using Array

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Not on leetcode but tried this locally on laptop
// Any problem you faced while coding this : While coding some errors occured but fixed it by running multiple cases


// Your code here along with comments explaining your approach
// I decided not to delete anything in the array but to maintain a top pointer and based on this pointer I did all the operations.
// If top is -1 then stack is empty. Increased top while pushing/adding an element in the array. Decreased the pointer without deleting any element in array.
// For peek simply extracted an element in the array with top pointer. 


// Exercise 2 - Implement Stack Using Linked List

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Not on leetcode but tried this locally on laptop
// Any problem you faced while coding this : While coding some errors occured but fixed it by running multiple cases. I feel I always find it hard to implement 
// a linked list.


// Your code here along with comments explaining your approach
// I used same logic as I did in the stack using array. I kept root node as a pointer.
// Everytime I push a new node I assigned new node pointer to root that means previous element or null and changed root pointer to new added element.
// This way we are keeping track of the latest added element as well. So, while removing/popping the element we can simply change the current root pointer 
// to next pointer of root. In peek simply returned data present at root and if root is null that means there are no elements in the stack.
// So, in isEmpty just returned true if root is null.


// Exercise 3 - Implement Singly Linked List

// Time Complexity : Insertion will be O(1) and Printing will be O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Not on leetcode but tried this locally on laptop
// Any problem you faced while coding this : While coding some errors occured but fixed it by running multiple cases. I feel I always find it hard to implement 
// a linked list.


// Your code here along with comments explaining your approach
// First to insert a new node I initialized one node and assigned data using constructor. Then assigned it to list head if the list is empty.
// Otherwise I traversed till end of the list by using a temporary node and then at the end of the list assigned this new node to the curr end of list pointer.
// In printing the linked list, I just simply traversed the whole linked list till end and just printed the data of current node.