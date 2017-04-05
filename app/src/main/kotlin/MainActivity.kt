package `in`.creativelizard.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onActionPerform()

    }

    private fun onActionPerform() {
        btnDemo.setOnClickListener {
            Toast.makeText(this@MainActivity,"You Clicked Me!",Toast.LENGTH_SHORT).show()
        }
    }
}
