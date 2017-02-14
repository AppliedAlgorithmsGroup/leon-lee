from python.hamming_distance import HammingDistance


def calculate_hamming_distance_test():
    hamming_distance = HammingDistance()
    assert hamming_distance.calculate_distance(1, 4) == 2
    assert hamming_distance.calculate_distance(-1, 4) == -1
