def count_case(s):
    upper, lower = 0, 0
    for char in s:
        if char.isupper():
            upper += 1
        elif char.islower():
            lower += 1
    return upper, lower

s = input("Enter a string: ")
upper, lower = count_case(s)
print("Number of uppercase letters: ", upper)
print("Number of lowercase letters: ", lower)