package com.example
import com.example.data.Server
import com.example.operations.advance.ncr
local_server = Server()
a = local_server.getData()
b = local_server.getData()

println(ncr(a,b))
