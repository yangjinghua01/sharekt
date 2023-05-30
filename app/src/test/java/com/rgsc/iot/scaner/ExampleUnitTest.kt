package com.rgsc.iot.scaner

import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testfun(){
        test1()
    }
    fun test1(){
//        println("zx")
//        GlobalScope.launch(Dispatchers.Main) {
////            println("外协程：当前线程:${Thread.currentThread().name}")
////            var res = launch(Dispatchers.IO) {
////                println("内协程1：当前线程:${Thread.currentThread().name}")
////                Thread.sleep(2000)
////                "res"
////            }
//            withContext(Dispatchers.IO){
//                delay()
//            }
//
////            println("res:${res},当前线程:${Thread.currentThread().name}")
////            Thread.sleep(10000)
//        }
        GlobalScope.launch {
//            delay(1000)
            println("11111")
        }
        println("A")
        Thread.sleep(200)
        print("B")
    }
}