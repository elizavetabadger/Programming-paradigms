""" Задача №1
Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.Задача №1
Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки."""

def sort_list_imperative(numbers):
    flag = True
    while flag:
        flag = False
        for i in range(len(numbers) - 1):
            if numbers[i] < numbers[i + 1]:
                numbers[i], numbers[i + 1] = numbers[i + 1], numbers[i]
                flag = True
    return numbers