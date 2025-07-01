from exercise10.A1.Student import Student


class LearningGroup:
    def __init__(self, students = None):
        # Liste aller Studierenden in der Gruppe
        if students is None:
            self.studentList = []
        else:
            self.studentList = students

    def add_student(self, student):
        if not isinstance(student, Student):
            raise TypeError("Only Student instances can be added.")
        self.studentList.append(student)

    def __add__(self, other):
        new_group = LearningGroup()
        new_group.studentList = self.studentList.copy()

        if isinstance(other, Student):
            new_group.add_student(other)
        elif isinstance(other, LearningGroup):
            new_group.studentList.extend(other.studentList)
        else:
            raise TypeError("Kann nur Student oder LearningGroup hinzufügen")

        return new_group

    def __str__(self): # das ist eine to_String() Methode
        return str([str(student) for student in self.studentList])
