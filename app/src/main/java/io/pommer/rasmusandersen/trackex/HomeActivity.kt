package io.pommer.rasmusandersen.trackex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.SearchViewCompat
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<Button>(R.id.create_ex)!!.setOnClickListener(this)
        findViewById<Button>(R.id.create_rout)!!.setOnClickListener(this)
        findViewById<Button>(R.id.see_sessions)!!.setOnClickListener(this)
        findViewById<Button>(R.id.start_session)!!.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.create_ex -> createExInit()
            R.id.create_rout -> createRoutineInit()
            R.id.see_sessions -> seeSessionsInit()
            R.id.start_session -> startSessionInit()
        }
    }
    private fun createExInit(){
        val intent = Intent(this, CreateExerciseActivity::class.java)
        startActivity(intent)
    }
    private fun createRoutineInit(){
        val intent = Intent(this, CreateRoutineActivity::class.java)
        startActivity(intent)
    }
    private fun seeSessionsInit(){
        val intent = Intent(this, SeeSessionsActivity::class.java)
        startActivity(intent)
    }
    private fun startSessionInit(){
        val intent = Intent(this, StartSessionActivity::class.java)
        startActivity(intent)
    }
}
