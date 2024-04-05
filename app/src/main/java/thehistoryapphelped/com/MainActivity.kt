package thehistoryapphelped.com

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberEditText: EditText = findViewById(R.id.numberEditText)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val textView1: TextView = findViewById(R.id.textView1)


        button1.setOnClickListener {
            val inputNumber = numberEditText.text.toString()
            if (inputNumber.isNotEmpty()) {
                val number = inputNumber.toInt()
                val message = if (number <= 20 || number > 100) {
                    "Please enter a age between 20 and 100."

                } else {
                    "Unknown"
                }

                textView1.text = message
            } else {
                // Handle empty input case (e.g., show a message)
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            }
        }


        button2.setOnClickListener {
            numberEditText.text.clear()
        }
    }

    // Define a function to process the input number
    // fun processNumber(number: Int): String {
    //     // Add your processing logic here
    // }
}
