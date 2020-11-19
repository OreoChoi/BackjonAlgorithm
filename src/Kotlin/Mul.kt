package Kotlin


fun main() {
    val input = readLine()?.split(" ");
    if(input != null) {
        val A: Int = Integer.parseInt(input[0]);
        val B: Int = Integer.parseInt(input[1]);

        if (A > B) {
            println(">")
        } else if (A < B) {
            println("<")
        } else {
            println("==")
        }
    }
}