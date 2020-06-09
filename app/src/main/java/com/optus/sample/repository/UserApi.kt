package com.optus.sample.repository

import com.optus.sample.model.User
import com.optus.sample.model.UserAlbum
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {

    @GET("/users")
    fun getUsersList(): Observable<List<User>>

    @GET("/photos")
    fun getUserAlbumListByUserId(@Query("albumId") albumId: Int?) : Observable<List<UserAlbum>>

    @GET("/photos")
    fun getUserAlbumByAlbumIdAndUserId(@Query("albumId") albumId : Int?, @Query("id") id : Int?) : Observable<List<UserAlbum>>

}