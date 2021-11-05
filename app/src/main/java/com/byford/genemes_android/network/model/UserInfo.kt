package com.byford.genemes_android.network.model

data class UserAuthInfo (
    val email:String,
    val avatarURL:String,
    val userName:String,
    val authToken:String,
    val tokenExpiredDate:String
)