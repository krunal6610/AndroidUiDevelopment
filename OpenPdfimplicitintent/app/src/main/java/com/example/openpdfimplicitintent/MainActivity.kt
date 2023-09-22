package com.example.openpdfimplicitintent

import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    lateinit var open_pdf_btn:Button

    var REQUEST_PERMISSION = 1

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_pdf_btn = findViewById(R.id.open_pdf_btn)



        open_pdf_btn.setOnClickListener {

            // Check for permission to access external storage
            if (checkPermission()) {
                openPDF()
            } else {
                requestPermission()
            }

        }
        
    }

    private fun checkPermission(): Boolean {
        val permission = android.Manifest.permission.READ_EXTERNAL_STORAGE
        val granted = PackageManager.PERMISSION_GRANTED
        return ContextCompat.checkSelfPermission(this, permission) == granted
    }

    private fun requestPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
            REQUEST_PERMISSION
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_PERMISSION) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openPDF()
            }
        }
    }

    private fun openPDF() {
        val pdfUri = Uri.parse("file:///sdcard/biodata.pdf") // Replace with the actual path to your PDF file
       // val pdfUri = Uri.parse("Environment.getExternalStorageDirectory().getAbsolutePath()+\"/biodata.pdf") // Replace with the actual path to your PDF file
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setDataAndType(pdfUri, "application/pdf")
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // Handle the case where a PDF viewer app is not installed
            // You can prompt the user to install a PDF viewer from the Play Store here.
        }
    }

}