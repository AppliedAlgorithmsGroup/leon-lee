from python.largest_number import LargestNumber

def largest_number_test():
    array_a = [3, 30, 34, 5, 9]
    largest_number = LargestNumber()
    assert largest_number.arrange_largest_number(array_a) == "9534330"
