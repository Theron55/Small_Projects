# returns a string
# only has 1 or 0
def one_bit_NOT(a):
    if a == "0":
        return "1"
    if a == "1":
        return "0"
"""
this is the main program ask for input from the user and calculate the answer and print it back
"""
def three_bit_NOT(a):
    h = one_bit_NOT(a[0])
    h += one_bit_NOT(a[1])
    h += one_bit_NOT(a[2])
    return h

def one_bit_OR(a, b):
    if a == "1" or b == "1":
        return "1"
    else:
        return "0"

def three_bit_OR(a, b):
    h = one_bit_OR(a[0],b[0])
    h += one_bit_OR(a[1],b[1])
    h += one_bit_OR(a[2],b[2])
    return h

def one_bit_AND(a, b):
    if a == "1" and b == "1":
        return "1"
    else:
        return "0"

def three_bit_AND(a,b):
    h = one_bit_AND(a[0],b[0])
    h += one_bit_AND(a[1],b[1])
    h += one_bit_AND(a[2],b[2])
    return h
def main():
    v = input("Enter a operation (NOT, AND, OR): ")
    if v == "NOT":
            a = input("Enter a number: ")
            print(three_bit_NOT(a))
    elif v == "OR":
        a = input("Enter a number1: ")
        b = input("Enter a number2: ")
        print(three_bit_OR(a,b))
    elif v == "AND":
        a = input("Enter a number1: ")
        b = input("Enter a number2: ")
        print(three_bit_AND(a,b))

if __name__ == "__main__":
    main()
