import kotlin.math.sqrt
import kotlin.math.pow

fun main(){
//    val score = 35

//    when (score) {
//        in 90..100 -> println("5")
//        in 70..89 -> println("4")
//        in 50..69 -> println("3")
//        in 30..49 -> println("2")
//        in 0..29 -> println("1")
//        else -> println("invalid score")
//    }

//    val a = 5
//    val b = 3
//    val maxValue = when(a>b){
//        true -> a
//        false -> b
//
//    }
//    println("maxValue: $maxValue")

//    when(score){
//        in 90..100 -> println("5")
//        in 70..89 -> println("4")
//        in 50..69 -> println("3")
//        in 30..49 -> println("2")
//        in 0..29 -> println("1")
//        else -> {
//            println("score is invalid")
//        }
//
//    }
//    when{
//        3<2 -> println("3>2")
//        "string".length == 6 -> println("length is 6")
//        2>3 -> println("2>3")
//        else -> {
//            println("else called")
//        }
//    }

    fun findDaysNumber() {
        val month: Int = readLine()!!.toInt()

        when(month) {
            2 -> print("Month $month - 28 days")
            4, 6, 9, 11 -> print("Month $month - 30days")
            1, 3, 5, 7, 8, 10, 12 -> print("Month $month - 31days")
            else -> print("invalid month number")
        }
    }



    fun isCircleHasPoint() {
        println("Enter coordinates x and y:")
        val (x, y) = readLine()!!.split(' ')

        println("Enter radius:")
        val radius = readLine()!!.toDouble()

        val h: Double = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))

        when {
            h > radius -> print("The circle has not any point")
            else -> print("The circle has a point")
        }
    }

    isCircleHasPoint()
}
