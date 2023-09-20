package com.example.alertdialogdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.alert.setOnClickListener{
            var dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete Files")
            dialog.setMessage("Do you want to delete files")
            dialog.setIcon(R.drawable.delete)

            dialog.setPositiveButton("Yess"){dialogInterdace, which->
                Toast.makeText(this,"Click Yess", Toast.LENGTH_SHORT).show()

            }
            dialog.setNegativeButton("No"){dialogInterdace, which->
                Toast.makeText(this,"Click No", Toast.LENGTH_SHORT).show()

            }
            dialog.setNeutralButton("CENCEL"){dialogInterdace, which->
                Toast.makeText(this,"Click CENCEL", Toast.LENGTH_SHORT).show()

            }

            val alertDialog:AlertDialog= dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}