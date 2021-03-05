fun drawRectangle() {
    for(i in 1..4){
        for (j in 1..5) {
            print("* ")
        }
        println()
    }
}

fun drawTriangle() {
    val number = 5
    for (i in 1..number) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

fun getNumbersLength() {
    var count: Int = 0

    print("Enter a number: ")
    var number: Int = readLine()!!.toInt()

    while (number > 0) {
        number /= 10
        count++
    }

    println("Total number of digits : $count")
}

fun getValues() {
    var counter = 1
    for (i in 1..20) {
        print("${counter * 2} ")
        counter *= 2
    }
}

fun main() {
    drawRectangle()
    drawTriangle()
    getNumbersLength()
    getValues()
}


// For loop
//     val names = arrayListOf("Kotlin", "Java", "Dart")
//    for(i in 0..2){
////        println(names[i])
//    }
//    for(name in names){
//        println(name)
//}
//    names.forEach {println (it) }
//    names.forEachIndexed { index, name ->
////        println("$index $name")
//    }
//    for(i in 0..10 step 2){  // in 10 downTo 0
//        println(i)
//    }
//    for(i in 0..10){ //continue /break
//        if(i==6)break
////        println(i)
//    }

    //while
//    var j = 11
//    while( j<=10){
////        println("while $j")
//        j++
//    }


    //do while
//    var k = 11
//    do{
////        println("do while $k")
//        k++
//    }while (k<=10)



