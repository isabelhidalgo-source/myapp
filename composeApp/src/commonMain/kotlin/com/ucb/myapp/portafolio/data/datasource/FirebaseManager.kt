package com.ucb.myapp.portafolio.data.datasource

expect suspend fun getToken(): String

expect class FirebaseManager() {
    suspend fun saveData(path: String, value: String)
    // METODO DE RECUPERAR DATOS
}