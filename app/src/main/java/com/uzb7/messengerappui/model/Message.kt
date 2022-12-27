package com.uzb7.messengerappui.model

data class Message(
    val imageUrl: String,
    val fullname: String,
    val message: String,
    val time: String,
    val isOnline: Boolean=false
)
