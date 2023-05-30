package com.rgsc.iot.scaner

import com.rgsc.iot.scaner.`object`.SonClass
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

fun main() {
    ktrun(true, "asdf") {
        Thread.sleep(50000)
        println("子线程耗时操作")
    }
//    let可以配合可空性 “?” 来使用，如果data=null 则不执行let内部代码，如果有返回值则直接返回null
//   在let中，用it表示引用对象，并可调用其方法，it不可省略。
//   返回值是语句块的最后一行的返回类型，若最后一行语句无返回值，则整个let语句块也无返回值
    SonClass().let() {
        it.age
        
    }
//    泛型T（任意合法类型）作为调用主语，传入参数为T类型的扩展方法（注意，Kotlin中当参数列表的最后一个参数为函数类型时，可以直接写在小括号外面的大括号里），该方法返回值类型为R，同时和上述run方法一样，T.run方法也是直接将传入的扩展方法的返回值作为自己的返回值进行返回
SonClass().run {
    this.age = 12
    this
}
    SonClass().apply {
        age =1
        this
    }

}

var res = with(SonClass()){
    this.age =1
    1
}

//自定义轮询器
fun doCount(counts: Int, mm: (Int) -> Unit) {
    for (index in 0 until counts) {
        mm(index)
    }
}





//自定义线程封装
fun ktrun(start: Boolean, name: String, Runnerable: () -> Unit): Thread {
    var theard = Thread() {
        run {
            Runnerable()
        }
    }
    name ?: "NullTheard"
    if (start)
        theard.state
    return theard
}