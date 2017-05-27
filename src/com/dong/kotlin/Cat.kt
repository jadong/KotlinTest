package com.dong.function

/**
 *
 * Created by zengwendong on 2017/5/26.
 */
class Cat : Animal() {

    /**
     * 简单声明方法,默认无返回值,它的类型是Unit,可省略
     */
    fun run() {
        val strings = listOf("first", "second", "third")
        println("-----run----${strings.last()}")
        println("------------------------------------")
    }

    /**
     * 重写方法不允许指定默认值。。但是为什么呢
     */
    override fun eat(foodName: String, foodName1: String) {
        val numbers = setOf(11, 22, 33)
        val num = numbers.max()
        println("吃 $num 份 $foodName 和 $foodName1")
        println("------------------------------------")
    }

    /**
     * 指定默认值。简化Java中多种重载方法的写法
     */
    fun fly(catName: String = "Hello Kitty", changeName: String = "飞天猫", addr: String = "珠穆朗玛峰") {
        println("$catName 变身 $changeName 从 $addr 飞下")
        println("------------------------------------")
    }

    /**
     * 当方法返回单个表达式时,可以简写
     */
    fun add(num:Int) = num + 5

}

