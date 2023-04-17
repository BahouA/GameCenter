package com.example.gamecenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
     val inflater = menuInflater
     inflater.inflate(R.menu.game_menu, menu)
     return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment, EmptyFragment())
                    commit()
                }
            }
            R.id.item2 -> {
                var dialogVar = DifficultyDialogClass()
                dialogVar.show(supportFragmentManager, "Difficulty Dialog")
            }
            R.id.subitem1 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment, PCFragment())
                    commit()
                }
            }
            R.id.subitem2 -> {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragment, ConsoleFragment())
                    commit()
                }
            }
        }
        return true;
    }

}