from exercise10.A1.LearningGroup import LearningGroup


class Student:
    def __init__(self, name, matNr):
        self.name = name
        self.matNr = matNr

    def __add__(self, other):
        # Zwei Studenten bilden zusammen eine neue Lerngruppe
        group = LearningGroup()
        group.add_student(self)
        if isinstance(other, Student):
            group.add_student(other)
        elif isinstance(other, LearningGroup):
            group = other + self  # Student wird zur bestehenden Gruppe hinzugefügt
        else:
            raise TypeError("Student can only be added to Student or LearningGroup.")
        return group

    def __str__(self):
        return self.name + ' ' + str(self.matNr)
