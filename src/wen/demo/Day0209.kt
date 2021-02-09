package wen.demo

/**
 * Created by yuting on 2021/2/9 10:50
 */
class Day0209 {


    var arrOne = arrayOf(10, 20, 30, 40, 50)
    var arrTwo = arrayOf(2, 'a', 3, false, 9)
    var iterator: Iterator<Any> = arrTwo.iterator()
    var arrThree = arrayOf(1, 2, 3, 4, 5)
    var str = "String"
    var array = arrayOfNulls<String>(3)
    var count: Int = 1
    var a = 1
    var b = -2
    var c = true
    var d = true

    init {
/*
        for (i in arrOne) {
            print("i => $i \t")
        }
        println()
        for (i in arrOne.indices) {
            print("arrOne[$i] => " + arrOne[i] + "\t")
        }
        println()
        for ((index, value) in arrOne.withIndex()) {
            println("index => $index \t value => $value")
        }
        println()
        // 迭代器
        while (iterator.hasNext()) {
            print("\t" + iterator.next())
        }

        when (3) {
            1 -> println("1")
            2 -> println("2")
            3 -> println("3")
            4 -> println("4")
            5 -> println("5")
            else -> {
                println("error")
                println("0")
            }
        }

        when (1) {
            // 即x = 1,2,3 时都输出 1
            1, 2, 3 -> println("1")
            5 -> println("5")
            else -> {
                println("error!")
                println("0")
            }
        }

        var num: Int = 5
        // 条件可以使用任意表达式，不仅局限于常量
        when (num > 5) {
            true -> println("num > 5")
            false -> println("num < 5")
            else -> {
                println("error ! ")
                println("num = 5")
            }
        }

        when (9) {
            in arrThree.toIntArray() -> println("1 存在于 arrThree 数组中")
            // 符号（' .. '） 表示递增的循环的另外一种操作
            in 0..10 -> println("1 属于 0 - 10中")
            !in 5..10 -> println("1 不属于 5 - 10中")
            else -> {
                println("error!")
                println("都错了！哈哈")
            }
        }

        when (str) {
            is String -> println("abc是一个字符串")
            else -> {
                println("abc不是一个字符串")
            }
        }

        when {
            true -> {
                for (i in array) {
                    print(" $i \t")
                }
            }
            else -> {
            }
        }

        for (i in 1 until 10) {
            if (i == 5) {
                println("我在第 $i 次退出了循环")
                break
            }
            count++
        }
        println("我循环了多少次：count => $count")

        for (i in 1 until 10) {
            if (i == 5) {
                println("我跳过了第$i 次循环")
                continue
            }
            println("i => $i")
        }

        // 设置步长
        for (i in 10 until 20 step 2) {
            print("i => $i \t")
        }
*/

        // 操作符实现
        println("+a = ${+a}\t -a = ${-a}\t !c = ${!c}")
        println("+b = ${+b}\t -b = ${-b}\t !d = ${!d}")

        // 操作符重载实现
        println("+a = ${a.unaryPlus()}\t -a = ${a.unaryMinus()}\t !c = ${c.not()}")
        println("+b = ${b.unaryPlus()}\t -b = ${b.unaryMinus()}\t !d = ${d.not()}")
    }

    fun returnExample() {
        var str: String = ""
        if (str.isBlank()) {
            println("function existed.")
            return
        }
    }
}

fun main() {
    var day = Day0209()
    day.returnExample()
}