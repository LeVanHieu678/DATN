package com.hieu.levan.videocalldatn.signalingserver.model

class ResLoginModel(
    private var signalKey: String,
    private var data: String
):AbsModel() {
    override fun getData(): Any = data
}