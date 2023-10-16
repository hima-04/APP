def sum_2(a, b):
    return a + b

def sum_3(a, b, c):
    return a + b + c

n = int(input("Enter Number of digits to be added (2 or 3): "))

if n == 2:
    a = int(input("Enter A: "))
    b = int(input("Enter B: "))
    if 120 <= sum_2(a, b) <= 320:
        print("The sum is",200)
    else:
        print(sum_2(a, b))
elif n == 3:
    a = int(input("Enter A: "))
    b = int(input("Enter B: "))
    c = int(input("Enter C: "))
    if 120 <= sum_3(a, b, c) <= 320:
        print("The sum is",200)
    else:
        print(sum_3(a, b, c))
else:
    print("Invalid input for the number of digits to be added. Please enter either 2 or 3.")