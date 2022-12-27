package com.uzb7.messengerappui.model

class Chat {
    var message:Message?=null
    var rooms:ArrayList<Room> = ArrayList()
    constructor(xabar: Message){
        this.message=xabar
    }
    constructor(rooms:ArrayList<Room>){
        this.rooms=rooms
    }
}