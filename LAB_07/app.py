import sys

nRows = int(input("Введіть розмір квадратної матриці: "))
lst = []
filler = input("Введіть символ-заповнювач: ")

for i in range(nRows):
    if i < nRows // 2:
        lst.append([filler] * (i + 1))
    else:
        lst.append([filler] * (i + 1 - nRows // 2))

for row in lst:
    row[-1] = "*"

for i in range(nRows):
    if i < nRows // 2:
        for j in range(nRows):
            if j < len(lst[i]):
                print(lst[i][j], end="")
            else:
                print(" ", end="")
        print()
    else:
        k = 0
        for j in range(nRows):
            if j < nRows // 2:
                print(" ", end="")
            else:
                if k < len(lst[i]):
                    print(lst[i][k], end="")
                    k += 1
                else:
                    print(" ", end="")
        print()
