package com.uzb7.messengerappui.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uzb7.messengerappui.R
import com.uzb7.messengerappui.adapter.ChatAdapter
import com.uzb7.messengerappui.model.Chat
import com.uzb7.messengerappui.model.Message
import com.uzb7.messengerappui.model.Room

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<Chat>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        list=loadList()
        val rvChat=findViewById<RecyclerView>(R.id.rv_chat)
        rvChat.adapter=ChatAdapter(this,list)
        rvChat.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

    private fun loadList(): ArrayList<Chat> {
        var mylist=ArrayList<Chat>()
        mylist.add(Chat(arrayListOf(
            Room("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek"),
            Room("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek"),
            Room("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek"),
            Room("https://www.carlogos.org/logo/Maybach-logo-640x480.jpg","Mansurbek"))))
        mylist.add(Chat(Message(
            "https://www.carlogos.org/logo/Maybach-logo-640x480.jpg",
            "Mansurbek",
            "Assalomu alaykum",
            "now",
            true
        )))
        mylist.add(Chat(Message(
            "https://www.carlogos.org/logo/Maybach-logo-640x480.jpg",
            "Mansurbek",
            "Assalomu alaykum",
            "now",
            false
        )))
        return mylist
    }
}