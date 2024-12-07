package com.example.project1912.ViewModel

import androidx.lifecycle.ViewModel
import com.example.project1912.Repository.MainRepository

class MainViewModel(val repository: MainRepository) : ViewModel() {
    constructor() : this(MainRepository())

    fun loadData() = repository.items
    fun loadBudget()=repository.budget
}