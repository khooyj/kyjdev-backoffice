package com.almalecco.backoffice.controllers

import com.almalecco.backoffice.beans.DataResponse
import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class user{

    @GetMapping("/{id}")
    fun searchUser(@RequestParam("name") name: String, @PathVariable id: Int): DataResponse {
        var responseData = "User you have search is "

        if (id == 0 && name.isNullOrEmpty()) {
            responseData = "username or id either one is required"
        }

        if(id > 0 && name.isNullOrEmpty()){
            responseData  += "$id"
        }else if(id == 0 && !name.isNullOrEmpty()){
            responseData  += "$name"
        }else{
            responseData  += "$id and $name"
        }

        return DataResponse(responseData, 200);
    }

    @DeleteMapping
    fun deleteUser(@RequestParam("name") name: String): DataResponse {
        return DataResponse("User you have delete is $name", 200);
    }

    @PostMapping
    fun createUser(@RequestParam("name") name: String): DataResponse {
        return DataResponse("User you have create is $name", 200);
    }

    @PutMapping
    fun updateUser(@RequestParam("name") name: String): DataResponse {
        return DataResponse("User you have update is $name", 200);
    }

    fun bubbleSortStringArrayList(arrays: ArrayList<String>){
        var n = arrays.size
        var temp: String
        for (i in 0 until n){
            for (j in 0 until n-i-1){
                if (arrays[j] > arrays[j+1]){
                    temp = arrays[j]
                    arrays[j] = arrays[j+1]
                    arrays[j+1] = temp
                    println(arrays)
                }
            }
        }
    }
}