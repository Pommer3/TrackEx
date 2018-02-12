package io.pommer.rasmusandersen.trackex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import io.realm.Realm

class CreateExerciseActivity : AppCompatActivity(), View.OnClickListener {
    private var realm: Realm? = null
    private var saveExButton: Button? = null
    private var addMuscleButton: Button? = null
    private var nameOfExerciseEditText: EditText? = null
    private var nameOfMuscleEditText: EditText? = null
    private var musclellView: LinearLayout? = null
    private var musclesAdded: ArrayList<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        Realm.init(this)
        super.onCreate(savedInstanceState)
        musclesAdded = ArrayList()
        setContentView(R.layout.activity_create_exercise)
        saveExButton = findViewById(R.id.save_exercise)
        addMuscleButton = findViewById(R.id.add_muscle)
        nameOfExerciseEditText =  findViewById(R.id.name)
        nameOfMuscleEditText =  findViewById(R.id.en_muscle_name)
        musclellView =  findViewById(R.id.muscle_ll_view)

        saveExButton!!.setOnClickListener(this)
        addMuscleButton!!.setOnClickListener(this)


    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.create_ex -> saveExerciseClicked()
            R.id.add_muscle -> addMuscleClicked()

        }
    }

    private fun saveExerciseClicked(){

    }
    private fun addMuscleClicked(){
        val tv = TextView(this)
        tv.text = nameOfMuscleEditText!!.text
        musclellView!!.addView(tv)
        musclesAdded!!.add(nameOfMuscleEditText!!.text.toString())
        nameOfMuscleEditText!!.text.clear()
    }
}
