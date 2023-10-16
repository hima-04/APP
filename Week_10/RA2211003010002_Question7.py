import math

def circle(radius):
    return math.pi * radius * radius, 2 * math.pi * radius

def rectangle(length, width):
    return length * width, 2 * (length + width)

def triangle(base, height):
    return 0.5 * base * height, "Cannot be determined with only base and height"

def square(side):
    return pow(side,2),4*side

shape = input("Enter the shape (circle, rectangle, triangle, square): ")
if shape.lower() == 'circle':
    radius = float(input("Enter the radius: "))
    area, perimeter = circle(radius)
elif shape.lower() == 'rectangle':
    length = float(input("Enter the length: "))
    width = float(input("Enter the width: "))
    area, perimeter = rectangle(length, width)
elif shape.lower() == 'triangle':
    base = float(input("Enter the base: "))
    height = float(input("Enter the height: "))
    area, perimeter = triangle(base, height)
elif shape.lower() == 'square':
    side = float(input("Enter the side: "))
    area, perimeter = square(side)
else:
    print("Invalid shape")
    exit(1)
    
print("Area:", area, "Perimeter:", perimeter)