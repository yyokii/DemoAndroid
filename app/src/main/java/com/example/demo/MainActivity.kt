package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btBottomSheetDialog.setOnClickListener(View.OnClickListener {
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        })
    }
}
