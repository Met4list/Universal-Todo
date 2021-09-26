package com.leskov.universal_tasker.data.remote

import com.leskov.universal_tasker.domain.models.TaskEntity
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.POST

/**
 *  Created by Android Studio on 8/6/2021 12:57 PM
 *  Developer: Sergey Leskov
 */

interface RemoteDataSource {

    @GET("/tasks/api/todo/")
    fun getTasks() : Flow<List<TaskEntity>>

    @POST("/tasks/api/todo/")
    suspend fun createTask(vararg : TaskEntity)
}