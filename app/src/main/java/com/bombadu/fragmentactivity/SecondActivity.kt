package com.bombadu.fragmentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val bundle = intent.extras
        if (bundle != null) {
            val name = bundle.getString("name")
            println("xx$name")
            val fragment = ScreenTwo.newInstance(name.toString())
            replaceFragment(fragment)

        }


    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.secondFrag, fragment)
        fragmentTransaction.commit()
    }
}