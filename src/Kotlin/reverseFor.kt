package Kotlin

import java.lang.StringBuilder
import java.util.*

fun main(){
    val sc:Scanner = Scanner(System.`in`)
    val N:Int = sc.nextInt()
    val X:Int = sc.nextInt()
    val sb:StringBuilder = StringBuilder();

    for (i in 1..N){
        val iNum:Int = sc.nextInt();
        if(iNum < X) {
            sb.append(iNum).append(" ")
        }
    }
    println(sb.toString())
}