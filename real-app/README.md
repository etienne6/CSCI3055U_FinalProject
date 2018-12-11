## Android App Development with Kotlin (Specialized Library)
> In this section I developed an app that calculates the sum of two numbers
and displays it. Written in Kotlin Syntax

![alt text](https://github.com/etienne6/CSCI3055U_FinalProject/blob/master/photos/Screenshot%20from%202018-12-11%2015-24-10.png "app screeshot")
## Android App Development with Kotlin (Specialized Library)
> In this section I developed an app that calculates the sum of two numbers
and displays it. Written in Kotlin Syntax

![alt text](https://github.com/etienne6/CSCI3055U_FinalProject/blob/master/photos/Screenshot%20from%202018-12-11%2015-24-10.png "app screeshot")

I did not put the entire project package as I deemed that it was not important.
The files that were included:
1. _MainActivity.kt_ which details how the app runs.
2. _activity_main.xml_ which details the layout of the app.

Here is the code of _MainActivity.kt_:
```kotlin
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
```
