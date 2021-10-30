package com.example.myapplication

import android.content.Context
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlin.math.log

class Fragment_wnew : Fragment() {
    companion object {
        const val TAG : String = "로그"

        fun newInstance() : Fragment_wnew{
            return Fragment_wnew()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Fragment_wnew - onCreate() called")
    }

//    override fun onCreate(saveInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//        Log.d(TAG, "Fragment_win - onCreate() called")
//    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "Fragment_win - onCreate() called")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Fragment_win - onCreate() called")
        val view = inflater.inflate(R.layout.fragment_wnew, container, false)

        return view
    }
}