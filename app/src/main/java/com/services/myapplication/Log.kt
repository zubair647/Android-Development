package com.services.myapplication

import android.os.Bundle
import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Log : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log)
        var btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            Log.v(TAG, "verbose log:lowest priority, detailed entry, no use during  production")
            Log.d(TAG,"Debug log: highest priority, this is used in debug the app")
            Log.i(TAG,"info log: moderate level importance, they give information of com")
            Log.w(TAG,"Warning log: This is watning messafe for unexcepted behvaior")
        }
    }
}