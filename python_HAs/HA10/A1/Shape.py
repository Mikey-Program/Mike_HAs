import math
from abc import ABC, abstractmethod

# d)
class Shape(ABC): # ABC = Abstract Base Class
    @abstractmethod
    def get_area(self):
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def get_area(self):
        return math.pi * self.radius ** 2
