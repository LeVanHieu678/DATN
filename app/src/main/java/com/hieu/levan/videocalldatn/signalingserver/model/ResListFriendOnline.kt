package com.hieu.levan.videocalldatn.signalingserver.model

class ResListFriendOnline(
    private var signalKey: String,
    private var data : ArrayList<UserInfo>
): AbsModel() {
    override fun  getData() = data
}