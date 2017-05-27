package com.dong.function

/**
 *
 * Created by zengwendong on 2017/5/22.
 */
fun main(args: Array<String>) {


    val cat = Cat()

    //cat.run()

    //cat.eat("老鼠","老鼠毛")

    //可以指定参数名赋值,
    //调用Java函数时不能使用命名参数语法，因为Java字节码中不保留函数参数的名称
    //cat.eat(foodName1 = "老鼠", foodName = "老鼠毛")

    //方法重载
    //cat.fly()
    //cat.fly("波斯猫")
    //cat.fly("波斯猫","猫头鹰")
    //cat.fly(addr = "喜马拉雅山")

    //简化方法。。
    println("生了${cat.add(5)}只猫")



}