'''
Time and space complexity:
initialization: Time -> O(1); Space -> O(1)
append(): Time -> O(n); Space -> O(1)
find(): Time -> O(n); Space -> O(1)
remove(): Time -> O(n); Space -> O(1)
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
    newNode = ListNode(data)
    if self.head == None:
      self.head = newNode
    else:
      pointer = self.head
      while pointer.next:
        pointer = pointer.next
      pointer.next = newNode 
      
  def find(self, key):
    """
    Search for the first element with `data` matching
    `key`. Return the element or `None` if not found.
    Takes O(n) time.
    """
    pointer = self.head
    while pointer:
      if pointer.data == key:
        return pointer.data
      pointer = pointer.next
    return

  def remove(self, key):
    """
    Remove the first occurrence of `key` in the list.
    Takes O(n) time.
    """
    if self.head.data == key:
      self.head = self.head.next

    pointer = self.head
    while pointer.next:
      if pointer.next.data == key:
        pointer.next = pointer.next.next
        break
      pointer = pointer.next
    return


l1 = SinglyLinkedList()
print('append(5)')
l1.append(5)
print('append(8)')
l1.append(8)
print('append(15)')
l1.append(15)
print('append(2)')
l1.append(2)
print("l1.find(5):",l1.find(5))
print('remove(5)')
l1.remove(5)
print("l1.find(5):",l1.find(5))
print("l1.find(15):", l1.find(15))
print("l1.find(8):",l1.find(8))
print('remove(15)')
l1.remove(15)
print("l1.find(15):",l1.find(15))
print("l1.find(2):",l1.find(2))
print("l1.find(45):",l1.find(45))
print('append(45)')
l1.append(45)
print("l1.find(45):",l1.find(45))
print("l1.find(5):",l1.find(5))
