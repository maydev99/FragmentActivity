package com.bombadu.fragmentactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private val name = "This is a Test String"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.my_edit_text)
        val button = findViewById<Button>(R.id.my_button)


        val fragment = ScreenOne.newInstance(name)
        replaceFragment(fragment)

        button.setOnClickListener {
            val theName = editText.text.toString()
            println(theName)
            /*val intent = Intent(this, SecondActivity::class.java)
            val bundle = Bundle()
            bundle.putString(theName, "name")
            intent.putExtras(bundle)
            startActivity(intent)*/
        }


    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainFrag, fragment)
        fragmentTransaction.commit()
    }
}

