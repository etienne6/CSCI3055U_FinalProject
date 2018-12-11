package etiennedev.guessnumber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import etiennedev.guessnumber.R.string.sum
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var sum_button: Button
    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var numSum: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.editText3)
        num2 = findViewById(R.id.editText4)
        sum_button = findViewById(R.id.button1)
        numSum = findViewById(R.id.textView2)

        sum_button.setOnClickListener ( this )
    }
    fun getsum(){
        var enter1st: EditText = findViewById<EditText>(R.id.editText3)
        var enter2nd: EditText = findViewById<EditText>(R.id.editText4)
        val showsum: TextView = findViewById<TextView>(R.id.textView2)

        // Get the values
        val sumString = showsum.text.toString()
        val num1st = enter1st.text.toString()
        val num2nd = enter2nd.text.toString()

        // Convert values to number and compute sum
        var sum: Int = Integer.parseInt(num1st) + Integer.parseInt(num2nd)

        // Display the new value in the text view.
        showsum.text = sum.toString()
    }
    override fun onClick(view: View?) {
        getsum()
    }

}
