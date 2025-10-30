package com.example.secondcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModelProvider
import com.example.secondcomposeproject.ui.theme.InstagramProfileCard
import com.example.secondcomposeproject.ui.theme.SecondComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            Test(viewModel)
        }
    }
}

@Composable
private fun Test(viewModel: MainViewModel) {
    SecondComposeProjectTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            LazyColumn {
                item {
                    Text(text = "Title", color = MaterialTheme.colorScheme.onSecondary)
                }
                items(10) {
                    InstagramProfileCard(viewModel)
                }
                item {
                    Image(
                        painter = painterResource(id = R.drawable.ic_instagram),
                        contentDescription = null
                    )
                }
                items(500) {
                    InstagramProfileCard(viewModel)
                }
            }
        }
    }
}