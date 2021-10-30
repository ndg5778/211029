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
    }

//    override fun onCreate(saveInstanceState: Bundle?){
//        super.onCreate(savedInstanceState)
//        Log.d(TAG, "Fragment_win - onCreate() called")
//    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "Fragment_win - onAttach() called")
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