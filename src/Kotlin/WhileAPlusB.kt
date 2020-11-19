package Kotlin

import java.lang.StringBuilder
import java.util.*

fun main(){
    val sc:Scanner = Scanner(System.`in`)
    val sb:StringBuilder = StringBuilder()
    while(true){
        val sum:Int = sc.nextInt() + sc.nextInt()
        if(sum > 0) {
            sb.append(sum).append("\n")
        }else{
            break;
        }
    }
    println(sb.toString())
}