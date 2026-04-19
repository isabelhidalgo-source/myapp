package com.ucb.myapp.portafolio.data.datasource

import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import kotlinx.coroutines.tasks.await

actual suspend fun getToken(): String {
    return try {
        val token = FirebaseMessaging.getInstance().token.await()
        Log.d("FIREBASE", "FCM Token: $token")
        token ?: ""
    } catch (e: Exception) {
        Log.w("FIREBASE", "Error al obtener el token", e)
        ""
    }
}
