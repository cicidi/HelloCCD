'''
Created on May 16, 2015

@author: jianming
'''
import phone

print "Hello Python";
counter = 100  # An integer assignment
miles = 1000.0  # A floating point
name = "John"  # A string

# del  miles

print counter
print miles
print name

str = 'Hello World!'

print str  # Prints complete string
print str[0]  # Prints first character of the string
print str[2:5]  # Prints characters starting from 3rd to 5th
print str[2:]  # Prints string starting from 3rd character
print str * 2  # Prints string two times
print str + "TEST"  # Prints concatenated string
dict = {}
dict [2] = "THis is one"
dict ["1"] = "This is String one"
dict ['1'] = 'this is Char one'
print dict[2]
print dict["1"]
print dict['1']
tinydict = {1:"this is one", "2":"This is String Two"}
# print tinydict.keys()
print tinydict.get(1)
print tinydict.get('2')

LIGHT_MESSAGES = {
    'English': "There are %(number_of_lights)s lights.",
    'Pirate':  "Arr! Thar be %(number_of_lights)s lights."
}

def lights_message(language, number_of_lights):
    """Return a language-appropriate string reporting the light count."""
    return LIGHT_MESSAGES[language] % locals()
print lights_message

# def is_pirate(message):
#   """Return True if the given message sounds piratical."""
#  return re.search(r"(?i)(arr|avast|yohoho)!", message) is not None

a = 2
b = 3
print a ** b


for letter in 'Python': 
   if letter == 'h':
      # pass
      print 'This is pass block'
   print 'Current Letter :', letter

print "Good bye!"

for letter in 'Python': 
   if letter == 'h':
      pass
      print 'This is pass block'
   print 'Current Letter :', letter

print "Good bye!"



var = 100
if var < 200:
   print "Expression value is less than 200"
   if var == 150:
      print "Which is 150"
   elif var == 100:
      print "Which is 100"
   elif var == 50:
      print "Which is 50"
elif var < 50:
   print "Expression value is less than 50"
else:
   print "Could not find true expression"

print "Good bye!"

def changeme(myList):
       "This is a passed List into this function"
       myList.append([1, 4, 9, 10])
       print "Values inside the function" , myList
       print locals()
       return
   
myList = [123, 33333]
changeme(myList)
print globals()

phone.ApplePhone()
phone.GooglePhone()
phone.HuaweiPhone()