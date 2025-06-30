from HA10.A2.Node import Node

class BinaryTree:
    def __init__(self):
        self.root = None

    def add(self, value):
        if self.root is None:
            self.root = Node(value)
        else:
            self.root.add(value)

    def get(self, value):
        if self.root is None:
            return None
        return self.root.get(value)

    def remove(self, value):
        if self.root is not None:
            self.root = self.root.remove(value)

    def print(self):
        if self.root is None:
            print("Baum ist leer.")
        else:
            self._print_recursive(self.root)

    def _print_recursive(self, node, level=0):
        if node is not None:
            self._print_recursive(node.right_child, level + 1)
            print("    " * level + f"→ {node.value}")
            self._print_recursive(node.left_child, level + 1)

