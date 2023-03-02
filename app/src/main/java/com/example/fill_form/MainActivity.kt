package com.example.fill_form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frist_name :EditText =findViewById(R.id.f_name)
        val last_name :EditText =findViewById(R.id.l_name)
        val phn :   EditText= findViewById(R.id.pn_no)
        val Al_phn : EditText = findViewById(R.id.Al_phn)
        val E_mail:EditText= findViewById(R.id.e_mail)
        val dob:EditText= findViewById(R.id.dob)
        val btn : Button= findViewById(R.id.btn_id)

        val p_name : TextView = findViewById(R.id.full_name)
        val p_phn : TextView = findViewById(R.id.ur_phn)
        val p_alphn : TextView = findViewById(R.id.ur_alphn)
        val p_email : TextView = findViewById(R.id.ur_email)
        val p_dob : TextView = findViewById(R.id.ur_dob)

        btn.setOnClickListener {

            var f_name = frist_name.text.toString()
            var l_name = last_name.text.toString()
            var ph_no = phn.text.toString()
            var Alph_no = Al_phn.text.toString()
            var Email = E_mail.text.toString()
            var DOB = dob.text.toString()

            p_name.setText("Your name :$f_name$l_name")
            p_phn.setText("phone number :$ph_no")
            p_alphn.setText("Alternative ph.no. :$Alph_no")
            p_email.setText("E-mail Address:$Email")
            p_dob.setText("D.O.B :$DOB")
        }
    }
}