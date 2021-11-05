//package com.byford.genemes_android.persistence
//
//import com.google.gson.Gson
//import com.byford.genemes_android.network.model.UserAuthInfo
//import com.tencent.mmkv.MMKV
//
//class MmkvService (
//    private val mmkv:MMKV,
//    private val gson: Gson
//) {
//    companion object{
//        private const val LOGIN_INFO="user login info"
//    }
//    suspend fun saveLoginInfo(userInfo:UserAuthInfo): Boolean{
//        val stringInfo = gson.toJson(userInfo)
//        return mmkv.encode(LOGIN_INFO,stringInfo)
//    }
//    suspend fun retrieveLoginInfo(): UserAuthInfo{
//        val loginInfo = mmkv.getString(LOGIN_INFO, null)
//        return gson.fromJson(loginInfo,UserAuthInfo::class.java)
//    }
//    suspend fun clearLoginInfo():Boolean{
//        mmkv.removeValueForKey(LOGIN_INFO)
//
//        return true
//    }
//
//
//}