class HeapPriorityQueue:
    def __init__(self):
        self.heap = []

    def upheap(self, index):
        parent_index = (index - 1) // 2
        if index > 0 and self.heap[index] < self.heap[parent_index]:
            self.heap[index], self.heap[parent_index] = self.heap[parent_index], self.heap[index]
            self.upheap(parent_index)

    # Method to add an element, used for testing upheap
    def add(self, element):
        self.heap.append(element)
        self.upheap(len(self.heap) - 1)

# Testing the upheap method
heap = HeapPriorityQueue()
heap.add(10)
heap.add(4)
heap.add(15)
heap.add(3)  # Triggers upheap

print(heap.heap)
