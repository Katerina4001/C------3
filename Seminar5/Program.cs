/*Домашнее задание к семинару 5*/

/*Задача. Задайте массив заполненный случайными положительными трёхзначными числами. 
Напишите программу, которая покажет количество чётных чисел в массиве.*/


/*Console.WriteLine("Введите размер массива:  ");
int size = Convert.ToInt32(Console.ReadLine());

int[] num = new int[size];
FillArrayRandomNumbers(num);
Console.WriteLine(" получившийся массив: ");
PrintArray(num);
int count = 0;

for (int z = 0; z < num.Length; z++)
if (num[z] % 2 == 0)
count++;

Console.WriteLine($"всего {num.Length} чисел, {count} из них чётные");

void FillArrayRandomNumbers(int[] num)
{
    for(int i = 0; i < num.Length; i++)
    {
        num[i] = new Random().Next(100,1000);
    }
}
void PrintArray(int[] num)
{
    Console.Write("[ ");
    for(int i = 0; i < num.Length; i++)
    {
        Console.Write(num[i] + " ");
    }
    Console.Write("]");
    Console.WriteLine();
}
*/

/*Задача. Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечетных позициях.*/
/*
 Console.WriteLine("Введите  массив  ");
int size = Convert.ToInt32(Console.ReadLine());

int[] num = new int[size];
FillArrayRandomNumbers(num);
Console.WriteLine("массив: ");
PrintArray(num);
int sum = 0;

for (int z = 0; z < num.Length; z+=2)
    sum = sum + num[z];

    Console.WriteLine($"всего {num.Length} чисел, сумма элементов  на нечётных позициях = {sum}");

void FillArrayRandomNumbers(int[] num)
{
    for(int i = 0; i < num.Length; i++)
        {
            num[i] = new Random().Next(1,10);
        }
}
void PrintArray(int[] num)
{
    Console.Write("[ ");
    for(int i = 0; i < num.Length; i++)
        {
            Console.Write(num[i] + " ");
        }
    Console.Write("]");
    Console.WriteLine();
}
*/

/*Задача. Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива*/
/*
int size = 8;
int[] num = new int[size];
FillArrayRandomNumbers(num);
PrintArray(num);

int max = num[0];
int min = num[0];

for (int i = 0; i < num.Length; i++)
{
    if (num[i] > max)
    {
        max = num[i];
    }
    else if (num[i] < min)
    {
        min = num[i];
    }
}

Console.WriteLine($"Минимальное число: {min}");
Console.WriteLine($"Минимальное число: {max}");
Console.WriteLine($"Разница между максимальным и минимальным числами: {max-min}");



void FillArrayRandomNumbers(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(1, 100);
    }
}


void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write(array[i] + " ");
    }
    Console.WriteLine();
}
*/