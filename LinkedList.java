//Exercise_3

public class LinkedList {
    public static void main(String[] args) {
        LkdList lL=new LkdList();
        lL.insertNode(2);
        lL.insertNode(1);
        lL.insertNode(4);
        System.out.println("displaying all nodes");
        lL.display();
        lL.insertAtPosition(3,10); //inserting node at third position
        lL.deleteAtPosition(3);
    }
}

 class Node{
    int data;
    Node next;
}

 class LkdList{
    Node head=new Node();
    
    public void insertNode(int data){
        
        if(head==null){
            head.data=data;
        }
        else{
            Node tempNode=head;
            while(tempNode.next!=null){
                tempNode=tempNode.next;
            }
            Node newNode=new Node();
             newNode.data=data;
                tempNode.next=newNode;
        }
    }
     
    public void insertAtPosition(int pos,int data){
        int currentPos=1;
        Node tempNode=head;
        Node newNode=new Node();
        newNode.data=data;
        while(currentPos!=pos){
            tempNode=tempNode.next;
            currentPos++;
        }
        newNode.next=tempNode.next;
        tempNode.next=newNode;
        System.out.println("displaying after adding new node in between");
        display();
    }
    
    public void display(){
        if(head==null){
            System.out.println();
        }
        else{
            Node traverseNode=head.next;
            while(traverseNode.next!=null){
                System.out.println(traverseNode.data);
                traverseNode=traverseNode.next;
            }
            System.out.println(traverseNode.data);
        }
    }
    
    public void deleteAtPosition(int pos){
        Node tempNode=head;
        int currentPos=1;
        while(currentPos!=pos){
            tempNode=tempNode.next;
            currentPos++;
        }
        tempNode.next=tempNode.next.next;
        System.out.println("displaying after deleting node at "+pos);
        display();
    }
}
