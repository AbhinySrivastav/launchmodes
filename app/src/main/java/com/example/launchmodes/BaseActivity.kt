package com.example.launchmodes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("onCreate", this::class.java.simpleName + " -- TASK ID: " + taskId + " onCreate");
        title = this::class.java.simpleName
        setClickListeners()
    }

    private fun setClickListeners() {
        btnActivityA.setOnClickListener { launchActivity(ActivityA::class.java) }
        btnActivityB.setOnClickListener { launchActivity(ActivityB::class.java) }
        btnActivityC.setOnClickListener { launchActivity(ActivityC::class.java) }
        btnActivityD.setOnClickListener { launchActivity(ActivityD::class.java) }
    }

    private fun launchActivity(activity: Class<out AppCompatActivity>) {
        val intent = Intent(this, activity)
        startActivity(intent)
    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("onNewIntent", this::class.java.simpleName + " -- TASK ID: " + taskId);
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart", this::class.java.simpleName + " -- TASK ID: " + taskId);
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume", this::class.java.simpleName + " -- TASK ID: " + taskId);
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause", this::class.java.simpleName + " -- TASK ID: " + taskId);
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", this::class.java.simpleName + " -- TASK ID: " + taskId);
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop", this::class.java.simpleName + " -- TASK ID: " + taskId);
    }
}
