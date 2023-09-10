srcArrSize = int(input("Enter array size: "))

srcArray = []
for i in range(srcArrSize):
    print("Enter ", i + 1,  " string: ")
    srcArray.append(input())

dstArray = []
for str in srcArray:
    if len(str) <= 3:
        dstArray.append(str)

print("In source array", srcArray, "strings less than four characters long", dstArray)