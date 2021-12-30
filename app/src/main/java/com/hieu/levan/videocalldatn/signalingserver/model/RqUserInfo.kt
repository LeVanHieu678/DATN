package com.hieu.levan.videocalldatn.signalingserver.model

class RqUserInfo(
    private var signalKey: String,
    private var data: UserInfo,
) {
    fun getSignalKey(): String {
        return signalKey
    }

    fun setSignalKey(signalKey: String) {
        this.signalKey = signalKey
    }
}


class UserInfo {
    var userName: String? = null
    var os: String? = null
    var isWifi = false
    var roomId = 0
    var status //0-normal, 1-callincome, 2-incall
            = 0
    var isChecked = false
}