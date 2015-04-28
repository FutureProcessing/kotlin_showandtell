package _09_Arrays

fun arrays() {
    val arr = array(1, 2, 3)
    val nulls: Array<String?> = arrayOfNulls(5)
    val asc = Array(5, { i -> (i * i).toString() })
    val x: IntArray = intArray(1, 2, 3)
    x[0] = x[1] + x[2]

    // iterate over indices
    for (i in arr.indices)
        print(arr[i])

    arr.forEachIndexed {(index, value) -> "Bla" }
}
