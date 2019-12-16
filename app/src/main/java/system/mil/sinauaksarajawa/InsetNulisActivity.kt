package system.mil.sinauaksarajawa

import android.content.Context
import android.content.Intent
import android.gesture.Gesture
import android.gesture.GestureLibraries
import android.gesture.GestureLibrary
import android.gesture.Prediction
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.widget.ImageView
import android.widget.LinearLayout
import android.gesture.GestureOverlayView

import com.squareup.picasso.Picasso

import java.util.ArrayList

import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper


class InsetNulisActivity : AppCompatActivity(), GestureOverlayView.OnGesturePerformedListener {

    internal lateinit var mLibrary: GestureLibrary

    private var urutan = 1
    private var aksara_rekan = ""
    private var card_inset_nulis: ImageView? = null
    private var areanulis: LinearLayout? = null
    private var benernulis: LinearLayout? = null
    private var salahnulis: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val extras = intent.extras

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

        setContentView(R.layout.activity_inset_nulis)
        urutan = extras!!.getInt("aksara")

        card_inset_nulis = findViewById<View>(R.id.card_inset_nulis) as ImageView

        areanulis = findViewById<View>(R.id.areanulisaksara) as LinearLayout
        benernulis = findViewById<View>(R.id.pesenbener) as LinearLayout
        salahnulis = findViewById<View>(R.id.pesensalah) as LinearLayout

        aksaraSelector(urutan)

        mLibrary = GestureLibraries.fromRawResource(this, R.raw.gestures)
        if (!mLibrary.load()) {
            finish()
        }

        val gestures = findViewById<View>(R.id.gestures) as GestureOverlayView
        gestures.addOnGesturePerformedListener(this)

    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    fun maju(V: View) {
        urutan++
        if (urutan == 20 || urutan > 20) {
            urutan = 20
        }
        aksaraSelector(urutan)
    }

    fun mundur(V: View) {
        urutan--
        if (urutan == 1 || urutan < 1) {
            urutan = 1
        }
        aksaraSelector(urutan)
    }

    private fun aksaraSelector(selector: Int) {
        when (selector) {
            1 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ha_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ha"
            }

            2 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/na_huruf.png").into(card_inset_nulis)
                aksara_rekan = "na"
            }

            3 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ca_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ca"
            }

            4 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ra_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ra"
            }

            5 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ka_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ka"
            }

            6 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/da_huruf.png").into(card_inset_nulis)
                aksara_rekan = "da"
            }

            7 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ta_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ta"
            }

            8 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/sa_huruf.png").into(card_inset_nulis)
                aksara_rekan = "sa"
            }

            9 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/wa_huruf.png").into(card_inset_nulis)
                aksara_rekan = "wa"
            }

            10 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/la_huruf.png").into(card_inset_nulis)
                aksara_rekan = "la"
            }

            11 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/pa_huruf.png").into(card_inset_nulis)
                aksara_rekan = "pa"
            }

            12 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/dha_huruf.png").into(card_inset_nulis)
                aksara_rekan = "dha"
            }

            13 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ja_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ja"
            }

            14 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ya_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ya"
            }

            15 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/nya_huruf.png").into(card_inset_nulis)
                aksara_rekan = "nya"
            }

            16 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ma_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ma"
            }

            17 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ga_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ga"
            }

            18 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ba_huruf.png").into(card_inset_nulis)
                aksara_rekan = "ba"
            }

            19 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/tha_huruf.png").into(card_inset_nulis)
                aksara_rekan = "tha"
            }

            20 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/nga_huruf.png").into(card_inset_nulis)
                aksara_rekan = "nga"
            }
        }
    }

    fun setKotakbener() {
        areanulis!!.isEnabled = false
        benernulis!!.visibility = View.VISIBLE
        salahnulis!!.visibility = View.GONE
    }

    fun setKotakSalah() {
        areanulis!!.isEnabled = false
        benernulis!!.visibility = View.GONE
        salahnulis!!.visibility = View.VISIBLE
    }

    fun lanjutSinau(V: View) {
        urutan = urutan + 1
        if (urutan < 21) {
            val i = Intent(this@InsetNulisActivity, InsetNulisActivity::class.java)
            i.putExtra("aksara", urutan)
            startActivity(i)
            finish()
        } else {
            finish()
        }

    }

    fun baleniSinau(V: View) {
        val i = Intent(this@InsetNulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", urutan)
        startActivity(i)
        finish()
    }

    override fun onGesturePerformed(overlay: GestureOverlayView, gesture: Gesture) {
        val predictions = mLibrary.recognize(gesture)

        if (predictions.size > 0 && predictions[0].score > 1.0) {
            val result = predictions[0].name

            if (aksara_rekan.equals(result, ignoreCase = true)) {
                setKotakbener()
            } else {
                setKotakSalah()
            }
        }
    }
}
