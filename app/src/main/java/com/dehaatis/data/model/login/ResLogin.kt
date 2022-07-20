package com.dehaatis.data.model.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ResLogin(  @SerializedName("Flag")
                      @Expose
                      var flag: Boolean?,
                      @SerializedName("FlagMessage")
                      @Expose
                      var flagMessage: String?)
