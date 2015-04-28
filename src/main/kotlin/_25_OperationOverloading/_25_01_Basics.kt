package _25_OperationOverloading
import _25_OperationOverloading.TimeInterval.YEAR;
import _25_OperationOverloading.TimeInterval.DAY;
import _25_OperationOverloading.TimeInterval.WEEK;

fun task15_1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task15_2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}


