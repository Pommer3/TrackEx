package io.pommer.rasmusandersen.trackex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.style.UpdateLayout
import android.util.Log
import android.widget.Button
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build()
        val GoogleSignInClient = GoogleSignIn.getClient(this, gso)
        var button = findViewById<Button>(R.id.sign_in_button)

        button.setOnClickListener { v -> toast("Hello") }

        }

    }

    override fun onStart() {
        super.onStart()
        val googleAccount = GoogleSignIn.getLastSignedInAccount(this)
        updateUI(googleAccount)

    }

    fun updateUI(account: GoogleSignInAccount?){

    }
}
