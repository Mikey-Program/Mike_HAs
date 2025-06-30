class Node:
    def __init__(self, value,):
        self.value = value
        self.left_child = None
        self.right_child = None

    def add(self, value):
        if value > self.value:
            if self.right_child is None:
                self.right_child = Node(value)
            else:
                self.right_child.add(value)
        else:
            if self.left_child is None:
                self.left_child = Node(value)
            else:
                self.left_child.add(value)

    # ist von GPT
    def get(self, value):
        if self.value == value:
            return self
        elif value < self.value and self.left_child is not None:
            return self.left_child.get(value)
        elif value > self.value and self.right_child is not None:
            return self.right_child.get(value)
        else:
            return None

    # ist von GPT
    def remove(self, value):
        if value < self.value:
            if self.left_child:
                self.left_child = self.left_child.remove(value)
        elif value > self.value:
            if self.right_child:
                self.right_child = self.right_child.remove(value)
        else:
            # Fall: Node gefunden
            if self.left_child is None and self.right_child is None:
                return None  # kein Kind
            if self.left_child is None:
                return self.right_child  # nur rechts
            if self.right_child is None:
                return self.left_child  # nur links

            # Zwei Kinder → Ersatz finden (Minimum im rechten Teilbaum)
            min_larger_node = self.right_child
            while min_larger_node.left_child:
                min_larger_node = min_larger_node.left_child

            # Aktuellen Wert ersetzen
            self.value = min_larger_node.value
            # Dann das Duplikat rechts entfernen
            self.right_child = self.right_child.remove(min_larger_node.value)

        return self


