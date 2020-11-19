package Kotlin

fun main() {
    val selfNum: BooleanArray = BooleanArray(10001)

    for (i in 1..10000) {
        if (selfNum[i]) continue

        var num: Int = i;
        while (num <= 10000) {
            val arr: CharArray = Integer.toString(num).toCharArray()
            for (n in arr) num += (n - '0')
            if (num > 10000) break;
            selfNum[num] = true
        }
    }

    for (i in 1 until selfNum.size){
        if(!selfNum[i]) println(i)
    }
}