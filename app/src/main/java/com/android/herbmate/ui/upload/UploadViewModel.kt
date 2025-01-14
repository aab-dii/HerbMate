package com.android.herbmate.ui.upload

import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.herbmate.data.ApiResult
import com.android.herbmate.data.HerbMateRepository
import com.android.herbmate.data.remote.response.HerbPredictResponse
import kotlinx.coroutines.launch
import okhttp3.MultipartBody

class UploadViewModel(val repository: HerbMateRepository) : ViewModel() {

    var currentImageUri : Uri? = null
    private val _uploadResponse = MutableLiveData<ApiResult<HerbPredictResponse>>()
    val uploadResponse: LiveData<ApiResult<HerbPredictResponse>> get() = _uploadResponse

    fun uploadImage(file: MultipartBody.Part) {
        viewModelScope.launch {
            _uploadResponse.postValue(ApiResult.Loading)
            val response = repository.uploadHerbImage(file)
            _uploadResponse.postValue(response)
        }
    }
}