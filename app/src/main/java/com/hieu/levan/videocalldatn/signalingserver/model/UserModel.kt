package com.hieu.levan.videocalldatn.signalingserver.model

import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.Socket
import java.nio.ByteBuffer

class UserModel(
    private var socket: Socket,
) {
    private var  room: RoomVideoCall? = null
    private var info: UserInfo? = null

}
