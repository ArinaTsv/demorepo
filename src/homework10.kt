fun main(){

    //Map

//    val password = "12345"
//    val username = "onebird_01"
//    val name = "John"



    // key value

//    val myMap = HashMap<String,String>()
//    myMap.put("password", "Arina")
//    myMap.put("username", "onebird_01")
//    myMap.put("name", "John")
//    myMap.put("name", "Arina")
//
//    println(myMap.entries)
//    println(myMap.get("password"))
//
//    //Set
//    val mySet = HashSet<Int>()

//    mySet.add(1)
//    mySet.add(2)
//    mySet.add(1)
//    mySet.add(3)
//    mySet.add(1)
//    val list = arrayListOf(1,2,2,2,3,3,4,4,1)
//    mySet.addAll(list)
//
//    println(mySet)

    val itemCosts = mapOf("Хлеб" to 50.0, "Молоко" to 20.0, "Шоколад" to 30.0 )
    val shoppingList = listOf("Хлеб", "Молоко", "Шоколад", "Яйца")
    var total: Double = 0.0

    for (item in shoppingList){
        if (itemCosts[item] == null) {
            continue
        }
        total += itemCosts[item]!!

    }

    print("Общая стоимость покупки:  $total")
}




