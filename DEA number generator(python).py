import random
name = input("Enter the last name of prescriber: \n")
firstletteroflName = name[0]
dea = "B"
dea = dea+firstletteroflName.upper()
s = []
for i in range(2,8):
    t = random.randint(0,9)
    s.append(t)
for i in range(len(s)):
    x = str(s[i])
    dea = dea+x
even = []
odd = []
for i in range(len(s)):
    if i%2==0:
        even.append(s[i])
    else:
        odd.append(s[i])
finalsum = sum(even)+(sum(odd)*2)
dea = dea+str(finalsum%10)
print(dea)