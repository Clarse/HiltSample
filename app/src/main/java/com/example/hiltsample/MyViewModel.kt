package com.example.hiltsample

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class MyViewModel @ViewModelInject constructor(val repository: Repository) : ViewModel() {
}