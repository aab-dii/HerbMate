package com.android.herbmate.data.remote.response

data class LoginResponse(
    val data: com.android.herbmate.data.remote.response.LoginResult,
    val error: Boolean,
    val message: String,
    val token: String
)

data class LoginResult(
	val idUser: Int,
	val name: String,
	val email: String
)
