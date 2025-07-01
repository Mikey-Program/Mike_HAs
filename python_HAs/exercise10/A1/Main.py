from exercise10.A1.Student import Student

def main():
    student1 = Student('Alice Wonderland ', 42424242)
    student2 = Student('Bob Miller ', 1564153)
    student3 = Student('Charly Robert ', 4681398)

    group = student1 + student2
    group = group + student3
    group2 = student1 + student2 + student3

    # In-place Hinzufügen (verändert die Gruppe direkt)
    group += student3

    print(group)
    print(group2)

if __name__ == '__main__ ':
    main()