//var value: String? = null
//lateinit var lateValue: String
//fun main(){
//
//
////    value = "Kotlin"
//
////Safe call operator( ?.)
////    println(value?.length)
////Safe call with let ( ?.let)
//    value?.let {
////        println(it.length)
//    }
////Elvis operator (?:)
//    val length = if(value != null) {
//        value!!.length
//    } else {
//        -1
//    }
//    val length2 = value?.length ?: -1
////    println(length2)
//
//// Non null assertion operator (!!)
////    println(value!!.length)
//
//// "lateinit" keyword
//    lateValue = "Java"
//    println(lateValue.length)
//
//
//}

//Homework 3
fun main(){
    print("Введите первое число: ")
    val firstNum: String? = readLine()
    print("Введите второе число: ")
    val secondNum: String? = readLine()

    val a: Int? = firstNum?.toInt()
    val b: Int? = secondNum?.toInt()
    val c: Int = a!! + b!!


    println("Ответ = $c")

    print("Введите первое число: ")
    val thirdNum: String? = readLine()
    print("Введите второе число: ")
    val forthNum: String? = readLine()

    val f: Int? = thirdNum?.toInt()
    val k: Int? = forthNum?.toInt()


    val d: Int = f!! - k!!
    print("Ответ = $d")
}
