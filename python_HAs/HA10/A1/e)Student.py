class Student:
    def __init__(self, name):
        self.name = name
        self.grades = {} #oder: dict() - was ist besser/gängiger?

        def set_grade(self, course, grade):
            self.grades[course] = grade

        def get_average(self):
            if not self.grades:
                return 0
            total = sum(self.grades.values())
            return total / len(self.grades)