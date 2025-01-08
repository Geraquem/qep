package com.mmfsin.qep.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mmfsin.qep.databinding.ActivityBedrockBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBedrockBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBedrockBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
