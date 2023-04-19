package com.almalecco.backoffice.exceptions

import com.almalecco.backoffice.beans.DataResponse
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class SystemExceptionHandler{

    @ExceptionHandler
    fun handleException(e: MissingServletRequestParameterException): DataResponse {
        return DataResponse("System Error Please Try again", 500);
    }
}