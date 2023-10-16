def max(a,b,c):
    if a>b and a>c:
        print(a,"is greater")
    elif b>a and b>c:
        print(b,"is greater")
    elif c>a and c>b:
        print(c,"is greater")
print("Comparsion of Three Numbers")
a=int(input("Enter A: "))
b=int(input("Enter B: "))
c=int(input("Enter C: "))
max(a,b,c)