""" Условие: На вход подается число n.
Задача: Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
Обоснуйте выбор парадигм.
Пример вывода:
1 * 1 = 1
1 * 2 = 2
1 * 3 = 3
1 * 4 = 4
1 * 5 = 5
1 * 6 = 6
..
1 * 9 = 9 """

# Структурная парадигма (быстро, есть for)
number = int(input("Введите число N: "))          

for count in range(1, 11):     
   print(number, 'x', count, '=', number * count)  

print(f"Таблица умножения числа", number)


# Процедурная парадигма (функция multiplication_table())

def multiplication_table():
	for i in range(1, 11):
		print(n, "*", i, "=", i)
	
n = int(input("Введите число N: "))
multiplication_table()