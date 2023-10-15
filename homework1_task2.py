""" Задача №2
Дан список целых чисел numbers. Необходимо написать в декларативном стиле процедуру для
сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки. """

def sort_list_declarative(numbers):
    numbers.sort(reverse=True)
    return numbers

print(f"Declarative style -> {sort_list_imperative([21, 2, -3, 16, 7, 35, -14])}")