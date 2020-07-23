s1 = input()
s2 = input()

s3 = s1*2

x = s3.count(s2)

if len(s1) == len(s2):
    if x == 1:
        print("Yes")
    
    else:
        print("No")
