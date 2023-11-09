class ListNode:
        def __init__(self, data=None, next=None):
                self.data = data

class SinglyLinkedList:
        def __init__(self):
                self.head = None

        def append(self, data):
                NewNode = ListNode(data)
                NewNode.next = self.head
                self.head = NewNode
                print("Element appended :", data)

        def find(self, key):
                current = self.head
                i = 1
                flag = False
                if(self.head == None):
                        print("List is empty")
                else:   
                        while(current!=None):
                                if(current.data == key):
                                        flag = True
                                        break
                                i=i+1;
                                current = current.next

                if(flag):
                        print("Element is present in the list at postion : " + str(i))
                else:   
                        print("element is not present")



        def remove(self, key):
                HeadVal = self.head
                if (HeadVal is not None):
                        if (HeadVal.data == key):
                                self.head = HeadVal.next
                                HeadVal = None
                                return
                        while (HeadVal is not None):
                                if HeadVal.data == key:
                                        break
                                prev = HeadVal
                                HeadVal = HeadVal.next

                if (HeadVal == None):
                        return

                prev.next = HeadVal.next
                HeadVal = None
                print("Element removed :", key)

llist = SinglyLinkedList()
llist.append("Mon")
llist.append("Tue")
llist.append("Wed")
llist.append("Thu")
llist.remove("Tue")
llist.find("Wed")