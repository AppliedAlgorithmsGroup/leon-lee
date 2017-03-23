from python.spiral_matrix import SpiralMatrix

def arrange_spiral_matrix_test():
    matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    spiral_matrix = SpiralMatrix()
    assert spiral_matrix.reorder_matrix(matrix) == [1, 2, 3, 6, 9, 8, 7, 4, 5]
