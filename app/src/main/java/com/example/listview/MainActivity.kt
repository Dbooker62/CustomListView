package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)
        //val name = arrayOf("Android" ,"PHP" , "Java" , "C++" , "ASP .NET" , "Swift" )
        val list = ArrayList<Model>()
        list.add(Model("Daniel Booker" , "Student" , R.drawable.profile1))
        list.add(Model("John Diamond" , "Student" , R.drawable.profile2))
        list.add(Model("Devin" , "Teacher Assistant" , R.drawable.profile3))

        listView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)
        listView.setOnItemClickListener { adapterView, view, i, l ->
            val selectedName = (listView.adapter as MyCustomAdapter).Items[i].Name
            Toast.makeText(this , "Item Selected $selectedName" ,Toast.LENGTH_LONG ).show()
        }
    }
}


