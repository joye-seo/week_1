package com.example.week_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.week_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 바텀네비게이션 아이콘 기본색 적용
        binding.bottomNav.itemIconTintList = null
        // 바텀네이게이션 인셋으로 인해 적용 안될 때
        binding.bottomNav.setOnApplyWindowInsetsListener(null)

        binding.bottomNav.itemRippleColor = null
    }
}