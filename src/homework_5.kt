

fun main(){

//    val a = 3
//    val b = 2
////    val bool = a!= b
//
//////    if (a>b || a<b){ // >, <, >=, <=, ==, !=
////        println("if block is called")
////    }
//
//    if(false){
//        println("if block is called")
//    } else if(true){
//        println(" else if block is called")
//    }
//    else{
//        println("else block is called")
//    }

//    val score = 35
//
//    if(score in 90..100){
//        println("5")
//    }else if(score>=70 && score<90){
//        println("4")
//    }else if(score>=50 && score<70){
//        println("3")
//    }else if(score>=30 && score<50){
//        println("2")
//    }else if(score>=0 && score<30){
//        println("1")
//    }else{
//        println("invalid score")
//    }
//
//    val a = 2
//    val b = 3
//    val maxValue = if(a>b){
//        a
//    }else{
//        b
//    }
//    println("maxValue: $maxValue")

//    println("Введите четырехзначное число: ")
//    val value = readLine()
//
//    if (value?.length != 4) {
//        print("Please enter 4 digits")
//    } else {
//        val result = value.chunked(1)
//        val sum1 = result[0].toInt() + result[1].toInt()
//        val sum2 = result[2].toInt() + result[3].toInt()
//
//        if (sum1 == sum2) {
//            print(true)
//        } else {
//            print(false)
//        }
//    }

    print("Введите возраст: ")
    val age = readLine()?.toInt()
    if (age != null) {
        if(age<1 || age>200){
            println("Не выполнено условие")
        }else if(age % 100 in 11..14){
            println("$age лет")

        }else if(age % 10 == 1){
            println("$age год")
        }else if(age % 10 in 2..4){
            println("$age года")
        }else{
            println("$age лет")
        }
    }



}

