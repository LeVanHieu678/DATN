package com.hieu.levan.videocalldatn.signalingserver.model

import java.util.*
import kotlin.collections.ArrayList

class RoomVideoCall(
    private var owner: UserModel,
) {
    private var roomId: Int
    private var members: ArrayList<UserModel> = arrayListOf()
    init {
        val random = Random()
        this.roomId = 1 + random.nextInt(999999)

    }
}