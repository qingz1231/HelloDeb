package my.edu.tarc.hellodeb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instance name :type
//intCount: Integer
class MainActivity : AppCompatActivity() {
    //onCreate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //load ui to memory
        //R = resources class
        setContentView(R.layout.activity_main)

        //declare variable   val = value, var  variable
        //value  = wont change in whole program, allocate less resource
        val textViewName: TextView = findViewById(R.id.textViewMyName)

        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val buttonShow: Button  = findViewById(R.id.buttonShow)
        val buttonHide: Button = findViewById(R.id.buttonHide)

        buttonShow.setOnClickListener{
            textViewName.visibility = View.VISIBLE
            imageViewQR.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener{
            textViewName.visibility = View.INVISIBLE
            imageViewQR.visibility = View.INVISIBLE
        }
    }
}