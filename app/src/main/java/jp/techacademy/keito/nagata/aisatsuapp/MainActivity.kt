package jp.techacademy.keito.nagata.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.text = "クリック"
        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        Log.d("UI_PARTS", "ボタンをタップしました")

        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    if (hour >= 2 && hour < 10){
                        textView.text = "おはよう"
                    }else if (hour >= 10 && hour < 18){
                        textView.text = "こんにちは"
                    }else{
                        textView.text = "こんばんは"
                    }
                    Log.d("UI_PARTS", "$hour:$minute")
                },

                12, 0, true)

        timePickerDialog.show()

    }

}