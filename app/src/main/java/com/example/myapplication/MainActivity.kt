package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.Fragment_win
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_win.*
import com.google.firebase.database.ChildEventListener

import com.google.firebase.database.DatabaseReference

import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {

    private lateinit var fragmentWin: Fragment_win
    private lateinit var fragmentWnew: Fragment_wnew

    companion object{
        const val TAG: String="로그"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate() called")

        top_nav.setOnNavigationItemSelectedListener(onBottomNavItemSelectedListener)
        fragmentWin =Fragment_win.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.frameLayout, fragmentWin).commit()

//        val item = arrayOf("list1", "list2", "list3")
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

//        var mDatabase: FirebaseDatabase
//        var mReference: DatabaseReference
//        var mChild: ChildEventListener
//
//        var listView: listView
//        var adapter: ArrayAdapter<String?>
//        val Array: List<Any> = ArrayList()

    }

    private val onBottomNavItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {

        when(it.itemId){
            R.id.menu_win -> {
                Log.d(TAG, "MainActivity - 여성인력개발센터 클릭!")
                fragmentWin = Fragment_win.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragmentWin).commit()
            }
            R.id.menu_wnew -> {
                Log.d(TAG, "MainActivity - 여성인력개발센터 클릭!")
                fragmentWnew = Fragment_wnew.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragmentWnew).commit()
            }

        }

        true
    }

    /* override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.d(TAG, "MainActivity - onNavigationItemSelected() called")

        when(item.itemId){
            R.id.menu_win -> {
                Log.d(TAG, "MainActivity - 여성인력개발센터 클릭!")
                fragmentWin = Fragment_win.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragments_frame,fragmentWin)
            }
            R.id.menu_wnew -> {
                Log.d(TAG, "MainActivity - 여성새로일하기센터 클릭!")
            }
        }
        return true
    }*/
}
