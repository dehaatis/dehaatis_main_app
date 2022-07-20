package com.dehaatis.data.repository

import com.dehaatis.data.model.login.ReqLogin
import com.dehaatis.network.ApiInterface

class LoginRepository(var apiService:ApiInterface) {

    suspend fun login(req:ReqLogin)=apiService.login(req)
}