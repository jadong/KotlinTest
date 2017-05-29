package com.dong.kotlin

import com.dong.function.Animal
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

    /**
     * 中缀标记法
     */
    infix fun move(num: Int){
        println("移动了 $num 步")
        println("---------------------------------")
    }

    /**
     * 局部函数
     */
    fun exec(name: String) {
        println("exec $name")
        println("---------------------------------")

        fun look(anim:String) {
            println("look $anim")
            move(5)
            println("---------------------------------")
        }
        look("猫头鹰")
    }

    /**
     * 扩展函数
     */
    fun execJump(anim:Animal){
        anim.jump()
    }

    /**
     * 尾递归函数
     */
    tailrec fun plus(start: Int, end: Int, result: Int): Int = if (start >= end) result else plus(start+1, end, start + result)

    /**
     * 尾递归函数优化后
     */
    fun plus2(start: Int, end: Int, result: Int): Int {
        var res = result
        var sta = start

        while (sta < end) {
            res += sta
            sta++
        }

        return res
    }

}