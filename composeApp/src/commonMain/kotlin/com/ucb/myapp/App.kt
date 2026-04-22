package com.ucb.myapp

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.example.disignsystem.theme.DsTheme
import com.example.disignsystem.theme.ThemeMode
import com.ucb.myapp.navigation.AppNavHost


@Composable
@Preview
fun App() {
    val currentMode = ThemeMode.LIGHT
    val snackbarHostState = remember { SnackbarHostState() }
    DsTheme(
        mode = currentMode
    ) {
        Scaffold(
            contentWindowInsets = WindowInsets.safeDrawing,
            snackbarHost = { SnackbarHost(snackbarHostState) }
        ) { paddingVaues ->
            AppNavHost()
        }


    }
}

