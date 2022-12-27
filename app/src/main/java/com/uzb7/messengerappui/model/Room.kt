package com.uzb7.messengerappui.model

data class Room(
    val imageUrl: String,
    val fullname: String,
    val isOnline: Boolean = false
)
