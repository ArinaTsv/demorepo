fun main(){
//    sayHelloKotlin("Kotlin",  3)
//val max = getMax(5, 6)
    println(getMax(8, 6))
    println(getMax(6.0, 9.0))
    println(getMax(7,4,5))
    sayHello(reps = 2)
//    printInts(arrayOf(1,2,3))
    printInts(1,3,5,6)

}
fun getMax(num1:Int, num2:Int) = if(num1>num2) num1 else num2
//    return if(num1>num2) num1 else num2
//    return if(num1>num2) num1 else num2
//    println ("I am after return")
fun getMax(num1:Int, num2:Int, num3:Int):Int{
    return when{
        num1>num2 && num1>num3 -> num1
        num2>num1 && num2>num3 -> num2
        else -> num3
    }
}


fun getMax(num1:Double, num2:Double):Double{
    return if(num1>num2) num1 else num2
}
fun printInts(vararg ints: Int){
    for(i in ints) println(i)
}




fun sayHello(name: String = "Kotlin", reps: Int = 1): Unit{
    var counter = reps
    while(counter> 0){
        println("Hello $name! Where are you?")
        counter--

    }

//    for(i in 0 until reps)

}