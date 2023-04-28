# Задача 26: Напишите программу, которая на вход принимает два числа A и B,
# и возводит число А в целую степень B с помощью рекурсии.
# A = 3; B = 5 -> 243 (3⁵)
# 3
# A = 2; B = 3 -> 8'''

# def recApowB(a, b):
#     if b == 0:
#        return 1
#  return a * recApowB(a, b - 1)

# a = int(input('Введите число: '))
# b = int(input('Введите степень: '))
# print(recApowB(a, b))


# Задача 28: Напишите рекурсивную функцию sum(a, b),
# возвращающую сумму двух целых неотрицательных чисел.
# Из всех арифметических операций допускаются только +1 и -1.
#Также нельзя использовать циклы.
# 2 2
# 4


def recursive_sum(a, b):
    if a == 0:
        return b
    else:
        return recursive_sum(a - 1, b + 1)

a = int(input("Введите первое неотрицительное число "))
b = int(input("Введите второе неотрицательно число "))

print(recursive_sum(a, b))