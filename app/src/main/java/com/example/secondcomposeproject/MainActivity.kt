package com.example.secondcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.secondcomposeproject.ui.theme.InstagramProfileCard
import com.example.secondcomposeproject.ui.theme.SecondComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SecondComposeProjectTheme {
                Scaffold(contentWindowInsets = WindowInsets.safeDrawing) { innerPadding ->
                    Box(Modifier.padding(innerPadding)) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.background)
                        ) {
                            InstagramProfileCard()
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun TestText() {
    Image(
        modifier = Modifier.clip(CircleShape),
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "",
        contentScale = ContentScale.FillHeight
    )
}