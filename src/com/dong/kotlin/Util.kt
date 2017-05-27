package com.dong.kotlin

import com.dong.function.Cat

/**
 * Created by zengwendong on 2017/5/27.
 */
class Util {

    /**
     * 当方法返回单个表达式时,可以简写
     */
    fun add(num: Int) = num + 5

    /**
     * 添加数组形式参数
     */
    fun addCats(vararg cats: Cat, name: String): List<Cat> {
        val list = cats.toList()
        print("$name 家的猫:")
        for (cat in list) {
            print("${cat.getName()} ")
        }
        println()
        println("---------------------------------")
        return list
    }

}