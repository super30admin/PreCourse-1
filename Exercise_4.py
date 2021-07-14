# Python program to insert element in binary tree  

class Insert_BST:

    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

   
    def insert(self, val):
        
        if val == self.val:
            return
        if val < self.val:
                    
            if self.left:
                self.left.insert(val)
            else:
                self.left = Insert_BST(val)
        else:
            
            if self.right:
                self.right.insert(val)
            else:
                self.right = Insert_BST(val)
                
                
                
    def printBST(self):
    
        values = []
    
        if self.right:
        	values += self.right.printBST()

        
        if self.left:
            values += self.left.printBST()  
        

        values.append(self.val)
        return values
                
numbers = [34123429,63457,454345435,1290873,754354355,4453455,85453451,3454345,554345,54353,243532,53553,3535353,353591]
bst = Insert_BST(numbers[0])


for i in range(1, len(numbers)):
    bst.insert(numbers[i])

bst.insert(8990)
    
print(bst.printBST())
