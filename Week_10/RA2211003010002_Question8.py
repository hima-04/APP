def celsius_to_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_to_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

a=float(input("Enter in celsius: "))
print("Conversion: ",a,"°C to",celsius_to_fahrenheit(a),"°F")
b=float(input("Enter in fahrenheit: "))
print("Conversion: ",b,"°F to",fahrenheit_to_celsius(b),"°C")