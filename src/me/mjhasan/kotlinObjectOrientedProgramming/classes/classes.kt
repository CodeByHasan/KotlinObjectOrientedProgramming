package me.mjhasan.kotlinObjectOrientedProgramming.classes

fun main() {
    print("How many times do you want to run? ")
    val testCase: Int = readln().toInt()

    for (i in 1..testCase) {
        print("[$i] Enter an Integer Number: ")
        val number: Int = readln().toInt()
        val numberObject = NumberClass(number)
        println(numberObject.getOrdinal())
    }

    println(1.getOrdinal())
    println(11.getOrdinal())
    println(0.getOrdinal())
    println((-1).getOrdinal())
    println((-154).getOrdinal())

    for (i in -10..10) {
        println("$i: ${i.getOrdinal()}")
    }

}


class NumberClass(private val number: Int) {
    fun getOrdinal(): String {
        return if (number >= 0) {
            when (number) {
                0 -> "0th (zeroth)"
                1 -> "1st"
                2 -> "2nd"
                3 -> "3rd"
                else -> "${number}th"
            }
        } else {
            return when(number) {
                -1 -> "-1st"
                -2 -> "-2nd"
                -3 -> "-3rd"
                else -> "${number}th"
            }
        }
    }
}


fun Int.getOrdinal(): String {
    if (this >= 0) {
        return when(this) {
            0 -> "0th (zeroth)"
            1 -> "1st"
            2 -> "2nd"
            3 -> "3rd"
            else -> "${this}th"
        }
    } else {
        return when(this) {
            -1 -> "-1st"
            -2 -> "-2nd"
            -3 -> "-3rd"
            else -> "${this}th"
        }
    }
}