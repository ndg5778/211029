package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

data class ListViewItem(val title: String, val local: String, val date: String, val cost: Int)

class win_list internal constructor(
    var title: String,
    var content: String,
    var location: String,
    var score: String
)

//class ListAdapter(_oData: java.util.ArrayList<win_list>?) : BaseAdapter() {
//    var inflater: LayoutInflater? = null
//    private var m_oData: java.util.ArrayList<win_list>? = null
//    private var nListCnt = 0
//    override fun getCount(): Int {
//        Log.i("TAG", "GETCOUNT")
//        return nListCnt
//    }
//
//    override fun getItem(position: Int): Any? {
//        return null
//    }
//
//    override fun getItemId(position: Int): Long {
//        return 0
//    }
//
//    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
//        var convertView = convertView
//        if (convertView == null) {
//            val context = parent.context
//            if (inflater == null) {
//                inflater =
//                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            }
//            convertView = inflater.inflate(R.layout.item2, parent, false)
//        }
//        val oTourName = convertView.findViewById<View>(R.id.titlewin) as TextView
//        val oTourContent = convertView.findViewById<View>(R.id.tour_content) as TextView
//        val oTourLocation = convertView.findViewById<View>(R.id.tour_loation) as TextView
//        val oTourScore = convertView.findViewById<View>(R.id.tour_score) as TextView
//        oTourName.setText(m_oData!![position].title)
//        oTourContent.setText(m_oData!![position].content)
//        oTourLocation.setText(m_oData!![position].location)
//        oTourScore.setText(m_oData!![position].score)
//        return convertView
//    }
//
//    init {
//        m_oData = _oData
//        nListCnt = m_oData!!.size
//    }
//}

class Fragment_win : Fragment() {
    companion object {
        const val TAG : String = "로그"

        fun newInstance() : Fragment_win{
            return Fragment_win()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Fragment_win - onCreate() called")

        val database = Firebase.database
        val myRef = database.getReference("0")

        myRef.addValueEventListener(object: ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {

                val titlewin: Array<String> = arrayOf("[국비]한식조리기능사양성과정(온라인)", "[교육서비스] 아이돌보미 온라인 보수교육 4회기(청양)")
                val datewin: Array<String> = arrayOf("now", "now")
                val localwin: Array<String> = arrayOf("online", "충청남도")
                val costwin: Array<String> = arrayOf("0", "18000")

                var oData : ArrayList<win_list> = ArrayList()

                for(i : Int in 0..1){
                    val win = win_list(titlewin[i], datewin[i],localwin[i],costwin[i])
                    oData.add(win)
                }

//                val value = snapshot.value
//                val date = snapshot.child("0").child("date").value
//                Log.d(TAG, "Value is: $value")
//                Log.d(TAG, "Value2 is: $date")
                
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w(MainActivity.TAG, "Failed to read value.", error.toException())
            }
        })
    }

//    override fun onCreate(saveInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//        Log.d(TAG, "Fragment_win - onCreate() called")
//    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "Fragment_win - onAttach() called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Fragment_win - onCreateView() called")
        val view = inflater.inflate(R.layout.fragment_win, container, false)

        return view
    }
}