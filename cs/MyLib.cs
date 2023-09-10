namespace MyLib
{
    class MyLibClass
    {
        public static string Propmt(string message)
        {
            Console.WriteLine(message);
            return Console.ReadLine();
        }
        public static int Propmt()
        {
            return Convert.ToInt32(Console.ReadLine());
        }

        public static void PrintArray(string[] strings)
        {
            Console.Write("[ ");
            for (int i = 0; i < strings.Length; i++)
            {
                Console.Write($"{strings[i]} ");
            }
            Console.Write("]");
        }
    }
}