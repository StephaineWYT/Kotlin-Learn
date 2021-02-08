package wen.demo

/**
 * Created by yuting on 2021/2/8 9:46
 */
class Day0208 {

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_1234L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    val numValue: Int = 996
    val numValueBox: Int? = numValue

    var result_one: Boolean = false
    var result_two: Boolean = false

    var isNum: Boolean = false

    val str: String = "kotlin"

    var str1: String = "hello\t\tkotlin"

    var str2 = """ fun main(args: Array<String>){
     println("我是三重引号引用的字符串，我可以包含任意字符") """

    val text1: String = "我来了"
    var text2: String = "$text1 Kotlin"
    var text3: String = "$text2 ${text1.length} haha!!!"

    var arr1 = arrayOf(1, 2, 3, 4, 5) // 创建一个数组，参数是一个可变参数的泛型对象
    var arr2 = arrayOf("0", "2", "3", 'a', 2.33f)

    var arr3 = arrayOfNulls<Int>(3)

    var arr4 = Array(5, { index -> (index * 2).toString() })

    //var numA = 2

    var numA: Int = 2

    init {
/*
       println("oneMillion => $oneMillion")
       println("creditCardNumber => $creditCardNumber")
       println("socialSecurityNumber => $socialSecurityNumber")
       println("hexBytes => $hexBytes")
       println("bytes => $bytes")
       println("装箱后：numValueBox => $numValueBox")

       result_one = numValue == numValueBox // 比较内容
       result_two = numValue === numValueBox // 比较地址

       // kotlin 的缓存策略: Int类型'-128 ~ 127'，大于127其内存地址不同，反之则相同。
       println("numValue == numValueBox => $result_one")
       println("numValue === numValueBox => $result_two")

       println("str => $str")
       for (s in str) {
           print(s)
           print('\t')
       }
       println(str[3])
       println(str1)
       str1 = "Hello Kotlin"
       println(str1)
       println(str2)

       println(text1)
       println(text2)
       println(text3)

       for (v in arr1) {
           println(v)
       }

       for (v in arr2) {
           println(v)
       }

       for (v in arr3) {
           println(v)
       }

       arr3[0] = 1
       arr3[1] = 1
       arr3[2] = 1

       for (v in arr3) {
           println(v)
       }

       for (v in arr4) {
           println(v)
       }

        if (numA == 2) {
            println("numA == $numA => true")
        } else {
            println("numA == $numA => false")
        }

        var numB: Int = if (numA > 2) 3 else 5
        println("numB => $numB") // Kotlin 不存在三元运算符, if 表达式会返回一个值, 所以不需要三元运算符

        var numC: Int = if (numA > 2) {
            numA++
            numA = 10
            println("numA > 2 => true")
            numA
        } else if (numA == 2) {
            numA++
            numA = 20
            println("numA == 2 => true")
            numA
        } else {
            numA++
            numA = 30
            println("numA < 2 => true")
            numA
        }

        println("numC => $numC")

        // for循环数组被编译为一个基于索引的循环，它不会创建一个迭代器对象
        for (i in 0 until 5) {
            // until[n, m) 即 n <= x < m
            print("i => $i \t")
        }
        println()
        for (i in 15 downTo 11) {
            // downTo[m, n] 即 m <= x <= n
            print("i => $i \t")
        }
        println()
        for (i in 20 until 25) {
            // until[n, m] 即 n <= x <= m
            println("i => $i \t")
        }*/

    }

}

fun main() {
    Day0208()
}