class Robot:
    #def __init__(self,data,next):
        #self.data = data
        #self.next = next
    def introduce(self):
        print("I am "+ self.name)
r1 = Robot()
r1.name = "balu"
r1.color = "white"
r1.introduce()