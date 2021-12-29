package com.hieu.levan.videocalldatn.signalingserver.model

class RequestSocketModel(
     private var signalKey: String,
     private var  data: Any
): AbsModel() {
    fun getSignalKey(): String {
        return signalKey
    }

    fun setSignalKey(signalKey: String) {
        this.signalKey = signalKey
    }

    override fun getData(): Any = data

    fun setData(data: Any) {
        this.data = data
    }

}