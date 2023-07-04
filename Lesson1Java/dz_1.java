package ru.geekbrains.lesson1;
import java.util.Scanner;

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

public class lesson2Java {
    public static void main(String[] args) {
        System.out.printf("Введите  n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            mult *= i;            
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, mult);
        num.close();
     }
}

// 2) Вывести все простые числа от 1 до 1000

public class lesson2Java {
    public static void main(String[] args) {
        for (int i = 1; i <= 1001; i++) {    
            boolean isPrime = true;  
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                if ((i % j) == 0) { 
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " "); 
            }
        }
    }
}

// 3) Реализовать простой калькулятор

public class lesson2Java {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Введите первое число:");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        
        System.out.println("Введите второе число:");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);

        int result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            }
    System.out.println("Результат : " + result);
    n1.close();
    n2.close();
    }
}
 