package com.example.operations.elementary
fun multiply(a : Int,b : Int){
    // add b, a times to 0
    var ans : Int = 0
    if(a < 0){
        a = -a
        b = -b
    }
    for (i in 1..a){
        ans = add(ans,b)
    }
    return ans
}
