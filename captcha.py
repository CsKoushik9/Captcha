from random import randint
from random import shuffle
i='A'
s=ord(i)
j='Z'
t=ord(j)
l=1
n=[]
c=""
while l<=3:
    r=randint(s,t)
    n.append(chr(r))
    l=l+1
l=1
while l<3:
    n.append(str(randint(0,9)))
    l=l+1
shuffle(n)
for i in n:
    c=c+i
print('The Captcha is ',c)
