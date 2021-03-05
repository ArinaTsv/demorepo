fun main(){
    /*Array*/

    //element 42 0 0 0 322
    //index   0 1 2 3 4
//    val myArray = Array(5){0}
    val myArray = arrayOf(1,2,3,4,5)
//    val myArray= arrayListOf<String>("Javascript")
//    myArray[0] = 42
//    myArray[4] = 322
//    println(myArray[0])
//    println(myArray[1])

    /*ArrayList*/
    val myArrayList = ArrayList<String>()
    myArrayList.add("Kotlin")
    myArrayList.add("Java")
    myArrayList.add("Dart")
    myArrayList.add(1, "Python")
    myArrayList.removeAt(2)

//    println(myArrayList)
//    println(myArrayList.size)


//    val array1 = arrayOf(1,2,3)
//    val array2 = arrayOf(4,5,6)
//    println(array1.sum()+ array2.sum())

    val numbers = arrayOf(5, -3, 15, 61, 29, 10, -2, 7)
    println(numbers.max())

}