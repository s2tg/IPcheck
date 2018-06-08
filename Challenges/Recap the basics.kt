package Challenges

fun main(args: Array<String>) {

    val bücher = arrayListOf("Höhen", "Grey", "Boot")

    for (value in bücher){
        if (value.contains('e') ){
            for (c in value){
                println(c)
            }
        }
    }

}