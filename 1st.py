class MyHashSet:

    def __init__(self):
        self.size=10000
        self.bucket =[None] * self.size
    
    def hash_function(self,key):
        return key % self.size
        

    def add(self, key: int) -> None:
        hash_val=self.hash_function(key)
        if self.bucket[hash_val]== None:
            self.bucket[hash_val] = [key]
        else:
            self.bucket[hash_val].append(key)
            
    def remove(self, key: int) -> None:
        hash_val=self.hash_function(key)
        if self.bucket[hash_val]!= None:
            while key in self.bucket[hash_val]:
                self.bucket[hash_val].remove(key)
        

    def contains(self, key: int) -> bool:
        hash_val=self.hash_function(key)
        
        if self.bucket[hash_val]!= None:
            return key in self.bucket[hash_val]

        return False

        
        