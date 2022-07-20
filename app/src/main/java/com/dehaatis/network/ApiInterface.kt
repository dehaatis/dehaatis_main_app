package com.dehaatis.network

import com.dehaatis.data.model.login.ReqLogin
import com.dehaatis.data.model.login.ResLogin
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("api/login")
    suspend fun login(@Body req:ReqLogin) :Response<ResLogin>
}