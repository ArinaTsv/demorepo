var myMap: HashMap<String, String>? = null

fun main() {
    val names = arrayOf("KG", "RU", "USA", "TR")
    val codes = arrayOf("+996", "+7", "+1", "+90")

    myMap = hashMapOf()

    for (index in names.indices) {
        myMap?.put(names[index],codes[index])
    }

    println(myMap)
    println(myMap?.get("KG"))
}