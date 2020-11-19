package Kotlin

import java.util.*

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    print(factorial(sc.nextInt()))
}

fun factorial(N:Int):Int{
    if(N==1) return N
    else return factorial(N-1)+N
}