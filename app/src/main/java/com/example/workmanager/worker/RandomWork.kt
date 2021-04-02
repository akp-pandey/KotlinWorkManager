package com.example.workmanager.worker

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

//Worker is a abstract class which  takes two parameter context and workerparameters

class RandomWork(context: Context, workerParams: WorkerParameters) :Worker(context, workerParams) {

    val TAG="WORK MANAGER"

    //Method of Worker abstract class to be implemented

    override fun doWork(): Result {

        //Specifies the work to be performed
        Log.d(TAG,"Work done")
        return Result.success() // return result to worker if work gets completed
    }

    //Method of Worker abstract class to be implemented
    override fun onStopped() {
        Log.d(TAG,"Worker Stopped")
    }
}