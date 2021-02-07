package wen.demo

class Day0207 {

    // 声明可空变量
    var var_a: Int? = 0
    val val_a: Int? = null

    init {
        var_a = 10
        println("var_a => $var_a \t val_a => $val_a")
    }
}

// 延迟初始化即：指当程序在第一次使用到这个变量（属性）的时候在初始化

fun main() {
    Day0207()
}