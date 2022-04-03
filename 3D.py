import math

def vector_length(p):
    # sqrt(x^2 + y^2 + z^2)
    return math.sqrt(
        p["x"] * p["x"] + p["y"] * p["y"] + p["z"] * p["z"]
        )

def vector_diff(p1,p2):
    result = {}
    result["x"] = p1["x"] - p2["x"]
    result["y"] = p1["y"] - p2["y"]
    result["z"] = p1["z"] - p2["z"]
    return result

def vector_dot(p1,p2):

def main():
    point1 = {"x": 1, "y": 1, "z": 1}
    point2 = {"x": 26, "y": -2, "z": 0}

    print(vector_length(point1))
    print(vector_diff(point1,point2))

if __name__ == "__main__":
    main()
