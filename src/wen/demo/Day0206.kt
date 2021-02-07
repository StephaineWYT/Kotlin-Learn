package wen.demo


class Day0206 {
    var var_a: Int = 10 // 立即初始化
    var var_b = 5 // 推导出类型
    val val_a: Int = 100 // 立即初始化
    val val_b = 50 // 推导出类型

    init {
        println("var_a => $var_a \t var_b => $var_b")
        println("val_a => $val_a \t val_b => $val_b") // $符号表示引用的意思。这里理解为字符串模板
    }
}

class TestOne {
    var var_a: Int = 0
    val val_a: Int = 0

    init {
        var_a = 10
        println("var_a => $var_a \t val_a => $val_a")
    }
}

fun main(args: Array<String>) {
    TestOne()
}
