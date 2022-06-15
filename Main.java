
public class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Exercise 1: Popped from stack");


        //Excercise 2
        StackAsLinkedList sll = new StackAsLinkedList();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " Exercise 2: popped from stack");
        System.out.println("Execise 2: Top element is " + sll.peek());


        //Exercise 3
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);

        // Print the LinkedList
        list.printList(list);
    }
}
