package com.android.herbmate.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.android.herbmate.data.HerbMateRepository
import com.android.herbmate.data.local.pref.UserModel

class MainViewModel(val repository: HerbMateRepository) : ViewModel() {
    val userSession: LiveData<UserModel> = repository.getSession().asLiveData()

    fun getThemeSettings(): LiveData<Boolean> {
        return repository.getThemeSetting().asLiveData()
    }
}