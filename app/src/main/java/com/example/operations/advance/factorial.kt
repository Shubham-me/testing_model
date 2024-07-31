package com.example.operations.advance
import com.example.operations.elementary.multiply
import com.example.operations.elementary.add
fun factorial(n : Int){
    var answer : Int = 1
    for(i in 2..n){
        answer = add(answer,i)
    }
    return answer
}


