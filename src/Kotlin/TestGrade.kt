package Kotlin

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`);
    val year: Int = sc.nextInt();

    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        print(1)
    }else{
        print(0)
    }
}