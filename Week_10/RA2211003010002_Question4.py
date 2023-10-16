def check_odd_or_even(n):
    if(n==0):
        print("0 is either even or odd")
    elif(n<0):
        print("Enter Positive number")
    elif(n%2!=0):
        print(n,"is an Odd Number")
    else:
        print(n,"is an Even Number")

def check_prime_or_not(n):
    flag = False
    if n == 1:
        print(n,"is neither prime nor composite")
    elif n < 2:
        print(n," is not a prime number")
    else:
        for i in range(2, n):
            if n % i == 0:
                flag=True
        if (flag==True):
            print(n," is not a prime number")
        else:
            print(n,"is a prime number")

n=int(input("Enter a Number: "))
check_odd_or_even(n)
check_prime_or_not(n)