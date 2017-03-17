from python.wiggle_sort_ll import WiggleSortII


def wiggle_sort_test():
    nums = [1, 5, 1, 1, 6, 4]
    wiggle_sort = WiggleSortII()
    assert wiggle_sort.wiggle_sort(nums) == [1, 6, 1, 5, 1, 4]
    another_nums = [1, 3, 2, 2, 3, 1]
    assert wiggle_sort.wiggle_sort(another_nums) == [2, 3, 1, 3, 1, 2]
