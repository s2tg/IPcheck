package Challenges

import java.io.File

fun main(args: Array<String>) {
    File("src\\training\\60.ips.txt").forEachLine {
        var linenumber = 1
        println("$linenumber: $it")
        ++ linenumber
    }
}