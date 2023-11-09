'''
SinglyLinkedList:
  Space Complexity: O(n) where n is the number of current elements in the linked list
append():
  Time Complexity: O(n) as we have iterate through the whole linked list to find the last element
find():
  Time Complexity: O(n) as in the worst case we have iterate through the whole linked list to find the last element
remove():
  Time Complexity: O(n) as in the worst case we have iterate through the whole linked list to find the last element
show():
  Time Complexity: O(n) as we have iterate through the whole linked list
'''


class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if not self.head:
            self.head = ListNode(data)
        else:
            temp = self.head
            while temp.next != None:
                temp = temp.next
            temp.next = ListNode(data)
        return self.head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            print(f"Singly-linked list is empty")
            return None
        temp = self.head
        # Check if head is the key
        if temp.data == key:
            return temp
        while temp.next != None:
            temp = temp.next
            if temp.data == key:
                return temp
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            print(f"Singly-linked list is empty")
            return None

        prev = temp = self.head
        # Check if head is the key
        if temp.data == key:
            self.head = self.head.next
            return True

        while temp.data != key or temp.next != None:
            prev = temp
            temp = temp.next

        if temp.data == key:
            prev.next = temp.next
            return True

        print(f"Key not in Singly-linked list")
        return False

    def show(self):
        res = []
        temp = self.head
        if not temp:
            return []
        res.append(temp.data)
        while temp.next != None:
            temp = temp.next
            res.append(temp.data)
        return res


# ######################Custom Test Cases##########################
# (1) Append Link List
s = SinglyLinkedList()
s.append(1)
s.append(2)
s.append(3)
op = s.append(4)
assert op.data == 1, f"Expected 1 as output but instead got {op}"
assert s.show() == [
    1, 2, 3, 4], f"Expected [1,2,3,4] as output but instead got {s.show()}"

# (2) Find Link List
s = SinglyLinkedList()
assert s.find(
    '13') == None, f"Expected None as output but instead got {s.find('13')}"
s.append(1)
s.append(2)
s.append(3)
s.append(4)
assert s.find(
    1).data == 1, f"Expected 1 as output but instead got {s.find(1).data}"
assert s.find(
    2).data == 2, f"Expected 2 as output but instead got {s.find(2).data}"
assert s.find(
    3).data == 3, f"Expected 3 as output but instead got {s.find(3).data}"
assert s.find(
    4).data == 4, f"Expected 4 as output but instead got {s.find(4).data}"
assert s.find(
    '13') == None, f"Expected None as output but instead got {s.find('13')}"

# (2) Remove Link List
s = SinglyLinkedList()
assert s.remove(
    '13') == None, f"Expected None as output but instead got {s.remove('13')}"
s.append(1)
s.append(2)
s.append(3)
s.append(4)
assert s.remove(
    1) == True, f"Expected 1 as output but instead got {s.remove(1)}"
assert s.show() == [
    2, 3, 4], f"Expected [2, 3, 4] as output but instead got {s.show()}"
assert s.find(
    1) == None, f"Expected None as output but instead got {s.find(1)}"
assert s.remove(
    4) == True, f"Expected 4 as output but instead got {s.remove(4)}"
assert s.show() == [
    2, 3], f"Expected [2, 3] as output but instead got {s.show()}"
assert s.find(
    4) == None, f"Expected None as output but instead got {s.find(4)}"

assert s.remove(
    2) == True, f"Expected 2 as output but instead got {s.remove(2)}"
assert s.show() == [3], f"Expected [3] as output but instead got {s.show()}"
assert s.find(
    2) == None, f"Expected None as output but instead got {s.find(2)}"
assert s.remove(
    3) == True, f"Expected 3 as output but instead got {s.remove(3)}"
assert s.show() == [], f"Expected [] as output but instead got {s.show()}"

assert s.find(
    3) == None, f"Expected None as output but instead got {s.find(3)}"
assert s.remove(
    3) == None, f"Expected None as output but instead got {s.remove(3)}"
# #######################################################################
