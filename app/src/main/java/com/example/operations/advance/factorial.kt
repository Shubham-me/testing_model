package com.example.operations.advance
import com.example.operations.elementary.multiply
fun factorial(n : Int){
    var answer : Int = 1
    for(i in 2..n){
        answer = multiply(answer,i)
    }
    return answer
}


