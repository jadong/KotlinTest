package com.dong.kotlin

import com.dong.function.Cat

/**
 * 解构
 * Created by dong on 2017/5/30.
 */
fun main(args: Array<String>) {

    val cat = Cat("小花","黑色")

    val (name,color) = cat

    println("这是一只名叫$name 的$color 猫")

    val map = HashMap<String, Cat>()
    map.put("1", Cat("小花","黑色"))
    map.put("2", Cat("小黑","白色"))
    map.put("3", Cat("小灰","红色"))
    for ((key, value) in map) {
        println("key: $key, value: $value")
    }

}