'''
Created on May 19, 2015

@author: jianming
'''


class Apple:
    'This is a Apple class'

    __name = 'apple'
    count = 0
    def __init__(self, name):
        self.__name = name;
        Apple.count += 1;
    def displayName(self):
        print self.__name;
    def displayCount(self):
        print Apple.count;    
# print globals();

class Pear:
    'This is a Apple class'
    name = 'apple'
    count = 0
    def __init__(self, name):
        self.name = name;
        Pear.count += 1;
    def displayName(self):
        print self.name;
    def displayCount(self):
        print Pear.count;    
# print globals();



app1 = Apple("apple1")
app2 = Apple("apple2")
app1.displayName()
app1.displayCount()
app2.displayName()
app2.displayCount()

pear1 = Pear("pear1")
pear2 = Pear("pear2")
pear3 = Pear("pear3")
pear1.displayName()
pear2.displayCount()
pear2.displayName()
pear2.displayCount()
setattr(pear2, 'name', 'pear007')
print getattr(pear2, 'name')
print app1._Apple__name
