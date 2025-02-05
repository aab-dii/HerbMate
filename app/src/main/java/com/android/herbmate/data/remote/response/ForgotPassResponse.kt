package com.android.herbmate.data.remote.response

import com.google.gson.annotations.SerializedName

data class ForgotPassResponse(

	@field:SerializedName("error")
	val error: Boolean,

	@field:SerializedName("message")
	val message: String
)
