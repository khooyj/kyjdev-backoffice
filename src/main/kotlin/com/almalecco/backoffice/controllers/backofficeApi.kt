package com.almalecco.backoffice.controllers

import com.almalecco.backoffice.beans.DataResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BackofficeApi {

    @GetMapping("/")
    fun backoffice(@RequestParam("name") name: String): DataResponse {
        return DataResponse("This is simple Response $name", 200);
    }
}