package com.example.operations.advance
import com.example.operations.elementary.multiply

fun ncr(n : Int, r : Int){
    return factorial(n)/multiply(factorial(r),factorial(n - r))
}