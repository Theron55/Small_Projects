def longest_word(a, b, c):

    if len(a) > len(b) and len(a) > len(c):
        return a
    elif len(b) > len(c) and len(b) > len(a):
        return b
    elif len(c) > len(b) and len(c) > len(a):
        return c
a = str(input("Enter a word: "))
b = str(input("Enter a word: "))
c = str(input("Enter a word: "))
print(longest_word(a, b, c))
