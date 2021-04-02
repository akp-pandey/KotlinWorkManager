package com.example.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.example.workmanager.worker.RandomWork

class MainActivity : AppCompatActivity() {
    lateinit var workManager: WorkManager  //Manages the work request
    lateinit var workRequest: WorkRequest //OneTimeRequest/Periodic Request
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        workManager= WorkManager.getInstance(this) // Creating instance of workmanager

        workRequest=OneTimeWorkRequest.Builder(RandomWork::class.java).build() // Created request and passed to workRequest (One Time Request)
            workManager.enqueue(workRequest) // workmanager will start the work



    }
}