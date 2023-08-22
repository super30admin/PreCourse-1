import java.io.*;

class MyLinkedList {
    Entry startingElement;
    
    static class Entry {
        int value;
        Entry followingEntry;
        
        Entry(int val) {
            value = val;
            followingEntry = null;
        }
    }

    public static MyLinkedList addElement(MyLinkedList myList, int value) {
        Entry newEntry = new Entry(value);
        if (myList.startingElement == null) {
            myList.startingElement = newEntry;
        } else {
            Entry lastEntry = myList.startingElement;
            while (lastEntry.followingEntry != null) {
                lastEntry = lastEntry.followingEntry;
            }
            lastEntry.followingEntry = newEntry;
        }
        return myList;
    }

    public static void showList(MyLinkedList myList) {
        Entry currentEntry = myList.startingElement;
        while (currentEntry != null) {
            System.out.print(currentEntry.value + " ");
            currentEntry = currentEntry.followingEntry;
        }
    }

    public static MyLinkedList removeElement(MyLinkedList myList, int value) {
        if (myList.startingElement == null) return myList;

        // element delete from start
        if (myList.startingElement.value == value) {
            myList.startingElement = myList.startingElement.followingEntry;
            return myList;
        }

        Entry currentEntry = myList.startingElement;
        while (currentEntry.followingEntry != null && currentEntry.followingEntry.value != value) {
            currentEntry = currentEntry.followingEntry;
        }

        if (currentEntry.followingEntry == null) return myList;
        
        currentEntry.followingEntry = currentEntry.followingEntry.followingEntry;
        return myList;
    }

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList = addElement(myList, 1);
        myList = addElement(myList, 2);
        myList = addElement(myList, 3);
        myList = addElement(myList, 4);
        myList = addElement(myList, 5);
        showList(myList);// ans =  1 2 3 4 5 
        System.out.println();
        myList = removeElement(myList, 3);  
        showList(myList);  // ans =  1 2 4 5 
    }
}
