package com.dehaatis.data.model.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ReqLogin(
    @SerializedName("UserName")
    @Expose
    var userName: String?,
    @SerializedName("UserPassword")
    @Expose
    var userPassword: String?
)
