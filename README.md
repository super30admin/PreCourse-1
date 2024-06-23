# PreCourse_1

# All Instructions are already provided in the respective files.

Exercise_1 : Implement Stack using Array.
I decided not to delete anything in the array but to maintain a top pointer and based on this pointer I did all the operations.
If top is -1 then stack is empty. Increased top while pushing/adding an element in the array. Decreased the pointer without deleting any element in array.
For peek simply extracted an element in the array with top pointer. 

Exercise_2 : Implement Stack using Linked List.
I used same logic as I did in the stack using array. I kept root node as a pointer.
Everytime I push a new node I assigned new node pointer to root that means previous element or null and changed root pointer to new added element.
This way we are keeping track of the latest added element as well. So, while removing/popping the element we can simply change the current root pointer 
to next pointer of root. In peek simply returned data present at root and if root is null that means there are no elements in the stack.
So, in isEmpty just returned true if root is null.

Exercise_3 : Implement Singly Linked List.
First to insert a new node I initialized one node and assigned data using constructor. Then assigned it to list head if the list is empty.
Otherwise I traversed till end of the list by using a temporary node and then at the end of the list assigned this new node to the curr end of list pointer.
In printing the linked list, I just simply traversed the whole linked list till end and just printed the data of current node.

*After completing the project kindly submit a pull request*
