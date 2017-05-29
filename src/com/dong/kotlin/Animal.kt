package com.dong.function

/**
 *
 * Created by zengwendong on 2017/5/27.
 */
open class Animal {

    open fun eat(foodName: String, foodName1: String = "动物粮") {
        val numbers = setOf(11, 22, 33)
        val num = numbers.min()
        println("Animal  吃 $num 份 $foodName 和 $foodName1")
        println("------------------------------------")
    }

}