package com.optus.sample.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.optus.sample.model.User
import com.optus.sample.model.UserAlbum
import com.optus.sample.repository.UserRepository
import io.reactivex.Observable

class UserViewModel : ViewModel() {

    private var userRepository: UserRepository? = null
    var albumId = ObservableField<Int>()
    var photoId = ObservableField<Int>()
    var userAlbumTitle = ObservableField<String>()
    var userAlbumUrl = ObservableField<String>()
    var isNetworkAvailable = ObservableField<Boolean>()

    fun init() {
        userRepository = UserRepository.getInstance()
    }

    fun getUserList(): Observable<List<User>>? {
        return userRepository?.getUserInfo()!!
    }

    fun getUserAlbumListByUserId(userId : Int) : Observable<List<UserAlbum>>? {
        albumId.set(userId)
        return userRepository?.getUserAlbumListByUserId(userId)!!
    }

    fun getUserAlbumDetail(albumId : Int, photoId : Int) : Observable<List<UserAlbum>>? {
        return userRepository?.getUserAlbumDetail(albumId, photoId)!!
    }
}


