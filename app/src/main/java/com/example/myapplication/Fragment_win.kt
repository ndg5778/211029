package com.example.myapplication

import android.content.Context
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlin.math.log

data class ListViewItem(val title: String, val local: String, val date: String, val cost: Int)

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