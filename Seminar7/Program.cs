/*Домашнее задание к семинару 7*/

/*Задача. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.*/

/*Console.WriteLine("введите количество строк двумерного массива:");
int rows = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("введите количество столбцов двумерного массива:");
int colums = Convert.ToInt32(Console.ReadLine());

double[,] twoDimArray = new double[rows, colums];
Random rnd = new Random();

void PrintArray(double[,] matr)
{ 
    for (int i = 0; i < rows; i++)
    { 
    for (int j = 0; j < colums; j++)
        {
        Console.Write($"{matr[i, j]} ");
        }
        Console.WriteLine();
     }
 }

void FillArray(double[,] matr)
{
     for (int i = 0; i < rows; i++)
    { 
        for (int j = 0; j < colums; j++)
        { 
            matr[i,j] = Convert.ToDouble(rnd.Next(-100, 100)/10.0);
        }
    }
}
FillArray(twoDimArray);
Console.WriteLine();
PrintArray(twoDimArray);*/

/*Задача . Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.*/

/*Console.WriteLine("введите количество строк двумерного массива:");
int rows = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("введите количество столбцов двумерного массива:");
int colums = Convert.ToInt32(Console.ReadLine());

int[,] numbers = new int[4, 8];
CreateRandomArray(numbers);
Show2Array(numbers);

if (rows < numbers.GetLength(0) && colums < numbers.GetLength(1)) Console.WriteLine(numbers[rows, colums]);
else Console.WriteLine($"{rows}{colums} -> 'элемента с таким индексом в  массиве нет");


void CreateRandomArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = new Random().Next(1, 10);
        }
    }
}


void Show2Array(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write(array[i, j] + " ");
        }
        Console.WriteLine();
    }
    Console.WriteLine();
}


int ReadInt(string message)
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}*/

/*Задача. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.*/

/*Console.WriteLine("введите количество строк");
int rows = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("введите количество столбцов");
int colums = Convert.ToInt32(Console.ReadLine());

int[,] numbers = new int[rows, colums];
CreateRandomArray(numbers);


for (int j = 0; j < numbers.GetLength(1); j++)
{
    double avarage = 0;
    for (int i = 0; i < numbers.GetLength(0); i++)
    {
        avarage = (avarage + numbers[i, j]);
    }
    avarage = avarage / rows;
    Console.Write(avarage + "; ");
}
Console.WriteLine();
Show2Array(numbers);


void CreateRandomArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = new Random().Next(0, 10);
        }
    }
}

void Show2Array(int[,] array)
{

    for (int i = 0; i < array.GetLength(0); i++)
    {
        Console.Write("[ ");
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write(array[i, j] + " ");
        }
        Console.Write("]");
        Console.WriteLine("");
    }
}
*/