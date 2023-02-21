/*void ShowDiapazone(int quad)
{
    if (quad == 1) Console.WriteLine("x > 0 and y > 0");
    else if (quad == 2 ) Console.WriteLine("x < 0 and y > 0");
    else if (quad == 3 ) Console.WriteLine("x < 0 and y < 0");
    else if (quad == 4 ) Console.WriteLine("x > 0 and y < 0");
    else Console.WriteLine("uncorrect input!");
}
Console.Write ("Input a number of quadrant: ");
int quadrant = Convert.ToInt32 (Console.ReadLine());

ShowDiapazone(quadrant);*/

/*Задача2. */

/*getQuadrant(int x, int y)
{
    if (x > 0 && y > 0)
    return 1;
     if (x < 0 && y > 0)
    return 2;
     if (x < 0 && y < 0)
    return 3;
     if (x > 0 && y < 0)
    return 4;
    return -1;
}
Console.Write(" vvedite koordinaty x: ");
int x = Convert.ToInt32(Console.ReadLine);
Console.Write(" vvedite koordinaty y: ");
int y = Convert.ToInt32(Console.ReadLine);

int quarter = getQuadrant(x,y);
if (quarter>0)
Console.WriteLine($"point is in {quarter} quarter");
else
Console.WriteLine($"point is not  quarter");
*/

/*Задача 3. Программа принимает на вход координвты двух точек, найти расстояние между ними.*/
/*double getDistance (double xa, double ya, double xb, double yb)
{
    return Math.Sqrt((xb-xa)*(xb-xa)+(yb-ya)*(yb-ya));
}
Console.Write("vvedite koord x pervoi tochki : ");
double xa = Convert.ToDouble(Console.ReadLine());

Console.Write("vvedite koord y pervoi tochki : ");
double ya = Convert.ToDouble(Console.ReadLine());

Console.Write("vvedite koord x vtoroi tochki : ");
double xb = Convert.ToDouble(Console.ReadLine());

Console.Write("vvedite koord y vtoroi tochki : ");
double yb = Convert.ToDouble(Console.ReadLine());

Console.WriteLine("rasstoyanie mezdy tochkami: " +
Math.Round(getDistance(xa,ya,xb,yb),2));*/

/*Задача 4. Напишите программу , которая принимает на вход число N и выдает таблицу квадратов числе от 1 до N*/

/*void squareTable(int N)
{
    int currentNumber = 1;
    while (currentNumber <=N)
    {
        Console.WriteLine(currentNumber + "-" + (currentNumber * currentNumber));
        currentNumber ++;
    }
}
Console.Write("vvedite chislo: ");
int N = Convert.ToInt32(Console.ReadLine());
if (N > 0)
squareTable(N);
else 
Console.Write("vvedite chislo bolshe 0");
*/


/*Домашнее задание.*/


/*Задача 5. Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом. 
*/
/*Console.WriteLine("vvedite 5-zn chislo: ");
string number = Console.ReadLine();
int len = number.Length;

if (len == 5)
{
    if (number[0] == number[4] && number [1] == number[3])
    {
        Console.WriteLine(number + " Palindrom");
    }

    else
    {
        Console.WriteLine(number + " Ne palindrom");
    }
}
else
{
    Console.WriteLine ("vi vveli ne 5-zn chislo");
}
*/

/*Задача 6. Напишите программу, которая принимает на вход 
координаты двух точек и находит расстояние между ними в 3D пространстве.
*/
/*int x1 = ReadInt("vvedite х1: ");
int y1 = ReadInt("vvedite y1: ");
int z1 = ReadInt("vvedite z1: ");
int x2 = ReadInt("vvedite х2: ");
int y2 = ReadInt("vvedite y2: ");
int z2 = ReadInt("vvedite z2: ");

int A = x2 - x1;
int B = y2 - y1;
int C = z2 - z1;

double length = Math.Sqrt(A * A + B * B + C * C);
Console.WriteLine("rasstoyania = " + length);

int ReadInt(string message)
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}
*/
/*

Задача 7. Напишите программу, которая принимает на вход число (N) 
и выдаёт таблицу кубов чисел от 1 до N.*/

/*void squareTable(int N)
{
    int currentNumber = 1;
    while (currentNumber <=N)
    {
        Console.WriteLine(currentNumber + "-" + (currentNumber * currentNumber * currentNumber));
        currentNumber ++;
    }
}
Console.Write("vvedite chislo: ");
int N = Convert.ToInt32(Console.ReadLine());
if (N > 0)
squareTable(N);
else 
Console.Write("vvedite chislo bolshe 0");
*/