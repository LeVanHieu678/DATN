package com.hieu.levan.videocalldatn.signalingserver.model

class ResCallVideo(
    private var signalKey: String,
    private var data: Boolean
): AbsModel() {
    fun getSignalKey(): String {
        return this.signalKey
    }
    fun setSignalKey(signalKey: String){
        this.signalKey = signalKey
    }
    fun setData(data: Boolean){
          this.data = data
    }
   override fun getData() : Any = data

}