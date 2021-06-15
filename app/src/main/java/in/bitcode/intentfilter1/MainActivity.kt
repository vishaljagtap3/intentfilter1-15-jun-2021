package `in`.bitcode.intentfilter1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edtPath : EditText
    lateinit var btnShowImage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StrictMode.setVmPolicy( StrictMode.VmPolicy.Builder().build() )

        init()

        btnShowImage.setOnClickListener(BtnShowImageClickListener())

    }

    private inner class BtnShowImageClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            var intent = Intent("in.bitcode.image.SHOW")
            //intent.action = "in.bitcode.image.SHOW"
            intent.putExtra("path", edtPath.text.toString())
            startActivity(intent)
        }
    }

    private fun init() {
        edtPath = findViewById(R.id.edtPath)
        btnShowImage = findViewById(R.id.btnShowImage)
    }
}




