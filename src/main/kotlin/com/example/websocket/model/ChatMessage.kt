package com.example.websocket.model

import java.util.*

data class ChatMessage(
    var id: String = UUID.randomUUID().toString(),
    var content: String = "",
    var sender: String = "",
    var messageType: MessageType = MessageType.CHAT
)
