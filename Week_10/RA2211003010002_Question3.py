def factorial(n):
   factorial = 1
   if n < 0:
      print("Sorry, factorial does not exist for negative numbers")
   elif n == 0:
      return 1
   else:
      for i in range(1,n + 1):
         factorial = factorial*i
   return factorial

n = int(input("Enter a number: "))
print("The factorial of", n, "is", factorial(n))