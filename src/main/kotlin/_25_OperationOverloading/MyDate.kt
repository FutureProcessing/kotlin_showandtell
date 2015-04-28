package _25_OperationOverloading

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return (year - other.year) * 10000 + (month - other.month)*100 + dayOfMonth - other.dayOfMonth;
    }

    public fun plus(other: _25_OperationOverloading.TimeInterval): MyDate {
        return this.addTimeIntervals(other, 1)
    }

    public fun plus(other: Temp): MyDate {
        return this.addTimeIntervals(other.timeInterval, other.number)
    }
}

public fun MyDate.rangeTo(to: MyDate): DateRange {
    return DateRange(this, to)
}

data class Temp(val timeInterval: TimeInterval, val number: Int)

enum class TimeInterval {
    DAY
    WEEK
    YEAR

    public fun times(howmany: Int): Temp = Temp(this, howmany)
}

class DateRange(public override val start: MyDate, public override val end: MyDate) : Iterable<MyDate>, Range<MyDate> {
    override fun contains(item: MyDate): Boolean =
        item >= start && item <= end

    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            public var current: MyDate = start
            override fun next(): MyDate {
                val cc: MyDate = current
                current = current.nextDay()
                return cc
            }

            override fun hasNext(): Boolean {
                return current <= end
            }

        }
    }
}
