using MyLib;

namespace FinalTestOnTheMainBlock;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter array size: ");
        string[] sourceArray = new string[MyLibClass.Propmt()];

        for (int i = 0; i < sourceArray.Length; i++)
        {
            sourceArray[i] = MyLibClass.Propmt($"Enter {i + 1} string: ");
        }

        string[] destinationArray = GetDstArrayInOneCycle(sourceArray);

        Console.Write($"In source array: [ {string.Join(", ", sourceArray)} ] strings less than four characters long: [ {string.Join(", ", destinationArray)} ]");
    }

    public static string[] GetDstArray(string[] srcArray)
    {
        int size = 0;
        for (int i = 0; i < srcArray.Length; i++)
        {
            if (srcArray[i].Length <= 3)
            {
                size++;
            }
        }
        string[] dstArray = new string[size];
        for (int i = 0, j = 0; i < srcArray.Length; i++)
        {
            if (srcArray[i].Length <= 3)
            {
                dstArray[j] = srcArray[i];
                j++;
            }
        }

        return dstArray;
    }
    public static string[] GetDstArrayInOneCycle(string[] srcArray)
    {
        int size = 0;
        string[] dstArray = new string[size];
        for (int i = 0, j = 0; i < srcArray.Length * 2 + 1; i++)
        {
            if (i < srcArray.Length && srcArray[i].Length <= 3)
            {
                size++;
            }
            else if (i == srcArray.Length) dstArray = new string[size];
            else if (i > srcArray.Length && srcArray[i - srcArray.Length - 1].Length <= 3)
            {
                dstArray[j++] = srcArray[i - srcArray.Length - 1];
            }
        }
        return dstArray;
    }
}
