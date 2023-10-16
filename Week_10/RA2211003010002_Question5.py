import string
def reverse_using_slicing(a):
    return a[::-1]
def palindrome(a):
    if(a.lower()==a.lower()[::-1]):
        print(a,"is Palindrome")
    else:
        print(a,"is not Palindrome")
a=input("Enter a string to reverse it and check whether it is a palindrome or not: ")
print(reverse_using_slicing(a),"is the reverse of",a)
palindrome(a)