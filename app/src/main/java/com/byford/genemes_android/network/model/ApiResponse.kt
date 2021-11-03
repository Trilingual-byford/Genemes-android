package com.byford.genemes_android.network.model


import retrofit2.Response
import timber.log.Timber
import java.io.IOException
import java.lang.Exception

/**
 * Represents a generic Api Response object
 * */
class ApiResponse<T> {

    val code: Int

    val body: T?

    val errorMessage: String?

    val isSuccessful: Boolean
        get() = code in 200..299

    constructor(){
        code=-1
        body=null
        errorMessage=null
    }

    constructor(error: Throwable) {
        code = 500
        body = null
        errorMessage = error.message
    }

    constructor(error: Exception) {
        code = 500
        body = null
        errorMessage = error.message
    }

    constructor(response: Response<T>) {
        code = response.code()
        if (response.isSuccessful) {
            body = response.body()
            errorMessage = null
        } else {
            var message: String? = null
            if (response.errorBody() != null) {
                try {
                    message = response.errorBody().toString()
                } catch (ignored: IOException) {
                    Timber.e(ignored, "error while parsing response")
                }

            }
            if (message == null || message.trim { it <= ' ' }.isEmpty()) {
                message = response.message()
            }
            errorMessage = message
            body = null
        }

    }
    constructor(body: T){
        code=200
        this.body=body
        errorMessage=null
    }
}