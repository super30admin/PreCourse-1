class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data, next=None):
        self.data = data
        self.next = next


def append(data, head):
    """
    Insert a new element at the end of the list.
    Takes O(n) time.
    """
    node = ListNode(data)
    if head is None:
        head = node
        return head

    temp = head

    while temp.next != None:
        temp = temp.next

    temp.next = node
    return head


def find( key, head):
    """
    Search for the first element with `data` matching
    `key`. Return the element or `None` if not found.
    Takes O(n) time.
    """
    temp = head
    while temp != None:
        if temp.data == key:
            return key
        else:
            temp = temp.next
    return None

def remove( key, head):
    """
    Remove the first occurrence of `key` in the list.
    Takes O(n) time.
    """
    if head == None or (head.data == key and head.next == None):
        return None
    if head.data == key and head.next != None:
        head = head.next
        return head

    temp = head

    while temp.next != None:
        if temp.next.data == key:
            temp.next = temp.next.next
            break
        temp = temp.next

    return head


def show(head):
    """
    Takes O(n) time
    :return: an array of elements from head to tail
    """
    
    elements = []
    if head != None:
        temp = head
        while temp != None:
            elements.append(temp.data)
            temp = temp.next
    
    
    print(elements)


head: ListNode = None
show(head)
head = append(1, head)
head = append(2, head)
show(head)
print(find(2, head))
head = append(3, head)
print(find(11, head))
head = append(4, head)
show(head)
head = remove(4, head)
show(head)
head = remove(43, head)
show(head)
print(find(12, head))
head = remove(4, head)
show(head)
head = remove(3, head)
show(head)
head = remove(2, head)
show(head)
head = remove(1, head)
show(head)
