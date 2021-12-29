package com.hieu.levan.videocalldatn.signalingserver.model

class RqCallVideo(
    private var signalKey: String,
    private var data: ArrayList<String>
) {
    fun setSignalKey(signalKey: String){
        this.signalKey = signalKey
    }
    fun setData(data: ArrayList<String>){
        this.data = data
    }
    fun getData() = data

    fun getSignalKey() = signalKey

}