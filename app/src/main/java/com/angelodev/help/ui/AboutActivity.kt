package com.angelodev.help.ui

import android.os.Bundle
import androidx.activity.addCallback
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.angelodev.help.R
import com.angelodev.help.databinding.ActivityAboutBinding
import com.angelodev.help.utilities.extension.showToast
import com.angelodev.help.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initConfig()
    }

    private fun initConfig() {
        initBinding()
        initBackPressed()
        initEventListeners()

    }

    private fun initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about)
        binding.lifecycleOwner = this
        mainViewModel.insertSample()
        showToast("inserted")
    }

    private fun initEventListeners() {
        binding.materialToolBar.setNavigationOnClickListener {
            finish()
        }
    }

    private fun initBackPressed() {
        onBackPressedDispatcher.addCallback(this) { finish() }
    }
}