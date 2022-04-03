class Quadratic:
    def __init__(self,a,b,c):
        self.coefficients = [c,b,a]

    def __str__(self, other):
        """return ax^2 + bx + c """
        return (str(self.coefficients[2]) + "x^2 + " +
        str(self.coefficients[1]) + "x + " +
        str(self.coefficients[0])
        )
def main():
p1 = Quadratic(2,5,-3)
print(p1)
p2 = p1.diff()
print(p2)

if __name__ == "__main__":
    main()
