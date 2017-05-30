package com.dong.kotlin

/**
 * Created by dong on 2017/5/29.
 */
class Other{

    /**
     * 高阶函数
     */
    fun test(a: Int, b: Int, sumSom: (Int, Int, Int) -> Int): Int {
        if (a > b) {
            return sumSom(0, a, 0)
        } else {
            return sumSom(0, b, 0)
        }
    }

    fun sumSom(start: Int, end: Int, result: Int): Int {
        var res = result
        var sta = start

        while (sta <= end) {
            res += sta
            sta++
        }

        return res
    }

}

fun main(args: Array<String>) {
    val other = Other()
    println(other.test(10, 9) { start, end, result -> other.sumSom(start, end, result) })
}