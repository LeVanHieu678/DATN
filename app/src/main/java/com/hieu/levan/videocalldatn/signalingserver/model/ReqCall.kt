package com.hieu.levan.videocalldatn.signalingserver.model

class ReqCall(
    private var signalKey: String,
    private var data: Array<String>
): AbsModel() {
    override fun getData(): Any {
        return data
    }

}
