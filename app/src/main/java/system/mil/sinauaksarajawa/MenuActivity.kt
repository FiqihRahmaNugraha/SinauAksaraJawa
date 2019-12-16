package system.mil.sinauaksarajawa

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View

import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Inisialisasi library font aplikasi
        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )


        setContentView(R.layout.activity_menu)

    }

    //Implementasi library font aplikasi
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    //Memanggil activity Sinau
    fun goToMainActivity(V: View) {
        val i = Intent(this@MenuActivity, MainActivity::class.java)
        startActivity(i)
    }

    //Memanggil activity Nulis
    fun goToNulisActivity(V: View) {
        val i = Intent(this@MenuActivity, NulisActivity::class.java)
        startActivity(i)
    }

    //Memanggil activity Kuis
    fun goToQuizActivity(V: View) {
        val i = Intent(this@MenuActivity, QuizActivity::class.java)
        startActivity(i)
    }

    //Memanggil activity Tentang
    fun goToTentangActivity(V: View) {
        val i = Intent(this@MenuActivity, TentangActivity::class.java)
        startActivity(i)
    }

    //Memanggil konfirmasi keluar
    override fun onBackPressed() {
        AlertDialog.Builder(this)
                .setMessage("Arep metu saka aplikasi iki?")
                .setPositiveButton("Iya") { dialog, which -> System.exit(1) }
                .setNegativeButton("Ora", null)
                .show()
    }

}
