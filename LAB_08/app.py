import os
import struct
import sys
import math


def writeResTxt(fName, result):
    with open(fName, "w") as f:
        f.write(str(result))


def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, "r") as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


def writeResBin(fName, result):
    with open(fName, "wb") as f:
        f.write(struct.pack("f", result))


def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, "rb") as f:
                result = struct.unpack("f", f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


def calculate(x):
    return 1 / math.tan(x)


if __name__ == "__main__":
    resTxt = "D:/repos/CPPT_LABS/LAB_08/textRes.txt"
    binTxt = "D:/repos/CPPT_LABS/LAB_08/binRes.txt"
    data = float(input("Enter data: "))
    result = calculate(data)
    print(f"Result is: {result}")
    try:
        writeResTxt(resTxt, result)
        writeResBin(binTxt, result)
        print("Result of Bin File is: {0}".format(readResBin(binTxt)))
        print("Result of Txt File is: {0}".format(readResTxt(resTxt)))
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)
