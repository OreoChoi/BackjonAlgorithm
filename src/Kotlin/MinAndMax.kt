package Kotlin

import java.util.*

/**
 * 10818번
 * */
fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var max:Int = 0
    var index:Int = -1

    for (i in 1..9){
        val num:Int = sc.nextInt()

        if(max <num){
            max = num
            index = i
        }
    }
    println(max)
    print(index)
}
/*
* */