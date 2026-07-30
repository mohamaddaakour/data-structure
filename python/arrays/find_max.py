def find_max(numbers: list[int]) -> int:
    current_max: int = numbers[0]

    for num in numbers[1:]:
        if num > current_max:
            current_max = num

    return current_max

print(find_max([1, 2, 3, 4]))