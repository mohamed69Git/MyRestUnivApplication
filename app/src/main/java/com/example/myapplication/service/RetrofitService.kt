package com.example.myapplication.service

import com.example.myapplication.data.*
import retrofit2.Response
import retrofit2.http.*
import retrofit2.Call

import retrofit2.http.GET
import kotlin.collections.ArrayList


interface RetrofitService {
    @GET("hello")
    suspend fun sayHello(@Header("Authorization") authorization: String): Response<String>

    //    @POST("login")
    //suspend fun login(@Body body: LoginBody): Response<LoginResponse>
    @POST("login")
    fun login(@Body body: LoginBody): Call<LoginResponse>

    @GET("users")
    suspend fun getUsers(
        @Header("Authorization") authorization: String,
        @Body body: LoginBody
    ): Response<ArrayList<User>>

//    @POST("acheter")
//    suspend fun achat(@Header("Authorization") authorization: String,@Body achat: AchatTicket): Response<StringResponse>

    @POST("acheter")
    fun achat(
        @Header("Authorization") authorization: String,
        @Body achat: AchatTicket
    ): Call<StringResponse>

    //    @GET("compte/{id}")
//    suspend fun getAccount(@Path("id") id: Int, @Header("Authorization") authorization: String): Response<Compte>
    @GET("compte/{id}")
    fun getAccount(
        @Path("id") id: Int,
        @Header("Authorization") authorization: String
    ): Call<Compte>

    @POST("envoyer")
    suspend fun envoyer(
        @Header("Authorization") authorization: String,
        @Body body: DataSendTicket
    ): Response<String>

    @POST("logout")
    suspend fun logout(@Header("Authorization") authorization: String): Response<String>

//    @GET("studentRestoVisitCount/{id}")
//    suspend fun history(@Path("id") id: Int, @Header("Authorization") authorization: String):Response<MutableList<History>>

    @GET("studentRestoVisitCount/{id}")
    fun history(
        @Path("id") id: Int,
        @Header("Authorization") authorization: String
    ): Call<MutableList<History>>
}