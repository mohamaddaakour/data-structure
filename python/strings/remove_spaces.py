def removeSpaces(s):
    new_string: str = ""

    s[3] = "h"

    for el in s:
        if el == " ":
            continue

        new_string += el

    return new_string

print(removeSpaces("g  eeks   for ge  eeks  "))