from sortedcontainers import SortedSet
from collections import defaultdict

class NumberContainers:

    def __init__(self):
        self.index_map = {} 
        self.number_map = defaultdict(SortedSet)

    def change(self, index: int, number: int) -> None:
        if index in self.index_map:
            number_old = self.index_map[index]
            if number_old in self.number_map:
                self.number_map[number_old].discard(index)
                if not self.number_map[number_old]: 
                    del self.number_map[number_old]

        self.index_map[index] = number
        self.number_map[number].add(index) 
    def find(self, number: int) -> int:
        if number in self.number_map and self.number_map[number]: 
            return self.number_map[number][0] 
        return -1
