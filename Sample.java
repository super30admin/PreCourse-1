// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Exercise_1 : Implement Stack using Array. 
//approach - 



//Exercise 2 : implment stack using linkedlist
//approach - use a singly linkedlist
// each node has data and next pointer , ex 1->2->3->4->5->6
// will use a pointer to point the head that is stack top 
// to push : each new node created with value x
// set the newnode.next=top (as top points head or stack top)
// update top to newnode
//push,pop,peek all at O(1) time complexity and space is O(1)

//Exercise 3:
//linkedlist - traversal 
// maintain curr pointer and add new node if current not null at the end of list
// time complexity- 
// insert at end position O(n) - as need to traverse the list and add at end
//space O(1)