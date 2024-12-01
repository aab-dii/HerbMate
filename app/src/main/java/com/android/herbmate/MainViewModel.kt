package com.android.herbmate

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.android.herbmate.data.HerbMateRepository
import com.android.herbmate.data.pref.UserModel

class MainViewModel(val repository: HerbMateRepository) : ViewModel() {
    val userSession: LiveData<UserModel> = repository.getSession().asLiveData()
}