package com.example
import com.example.data.Server
import com.example.operations.advance.ncr
var local_server = Server()
var a = local_server.getData()
var b = local_server.getData()

var c = println(ncr(a,b))
