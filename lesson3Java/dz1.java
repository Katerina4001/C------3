// Пусть дан произвольный список целых чисел.

//1) Нужно удалить из него чётные числа

package lesson3Java;
import java.util.Arrays;4
import java.util.Scanner;


public class dz1 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество элементов массива: ");
            int n = sc.nextInt();
            int[] newArr = new int[n];
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < n; i++){
                newArr[i] = sc.nextInt();           
            }
            System.out.println("Исходный массив: " + Arrays.toString(newArr));
        
            int[] filterArr = Arrays.stream(newArr).filter(i -> i%2 != 0).toArray();
            System.out.println("Полученный массив: " + Arrays.toString(filterArr));
    } 
}