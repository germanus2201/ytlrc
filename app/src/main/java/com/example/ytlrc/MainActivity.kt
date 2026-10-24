package com.example.ytlrc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                            setContent {
                                            MaterialTheme {
                                                                HomeScreen()
                                            }
                            }
        }
}

@Composable
fun HomeScreen() {
        Column(
                    modifier = Modifier.fillMaxSize().padding(24.dp),
                            verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
        ) {
                    Text(
                                    text = "YtLrc",
                                                style = MaterialTheme.typography.headlineLarge
                    )
                            Text(
                                            text = "My YouTube Music app",
                                                        style = MaterialTheme.typography.bodyLarge
                            )
        }
}
        )
                                            }
                            }
        }
}