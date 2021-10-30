package com.example.myapplication

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class ListAdapter(_oData: ArrayList<win_list>?) : BaseAdapter() {
    var inflater: LayoutInflater? = null
    private var m_oData: ArrayList<win_list>? = null
    private var nListCnt = 0
    override fun getCount(): Int {
        Log.i("TAG", "GETCOUNT")
        return nListCnt
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {
            val context = parent.context
            if (inflater == null) {
                inflater =
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            }
            convertView = inflater!!.inflate(R.layout.fragment_win, parent, false)
        }
        val oTourName = convertView.findViewById<View>(R.id.title_win) as TextView
        val oTourContent = convertView.findViewById<View>(R.id.now_win) as TextView
        val oTourLocation = convertView.findViewById<View>(R.id.local_win) as TextView
        val oTourScore = convertView.findViewById<View>(R.id.price_win) as TextView
        oTourName.setText(m_oData!![position].title)
        oTourContent.setText(m_oData!![position].content)
        oTourLocation.setText(m_oData!![position].location)
        oTourScore.setText(m_oData!![position].score)
        return convertView
    }

    init {
        m_oData = _oData
        nListCnt = m_oData!!.size
    }
}