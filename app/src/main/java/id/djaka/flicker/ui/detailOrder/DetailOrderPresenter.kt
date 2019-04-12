package id.djaka.flicker.ui.detailOrder

import android.content.Context
import android.content.Intent
import id.djaka.flicker.ui.detailOrderContact.DetailOrderContactActivity
import id.djaka.flicker.base.BasePresenter

class DetailOrderPresenter(detailOrderView: DetailOrderView) : BasePresenter<DetailOrderView>(detailOrderView){
    fun launchDetailContact(c: Context){
        val i = Intent(c, DetailOrderContactActivity::class.java)
        c.startActivity(i)
    }

}