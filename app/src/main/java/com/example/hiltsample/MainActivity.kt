package com.example.hiltsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject//Hilt注入的字段是不可以声明成private
    lateinit var truck: Truck

    @Inject
    lateinit var retrofit: Retrofit

    val viewModel: MyViewModel by lazy { ViewModelProvider(this).get(MyViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        truck.deliver()
    }
}