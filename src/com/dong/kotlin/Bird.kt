package com.dong.kotlin

import com.dong.function.Cat

/**
 * Created by dong on 2017/5/29.
 */
class Bird{

    fun sing(){
        println("唱了一首离歌")
    }

    fun swim(){
        println("游过了长江")
    }

    fun Cat.catAndBird(){
        sing()
        swim()
    }

    fun start(cat:Cat){
        cat.catAndBird()
    }


}