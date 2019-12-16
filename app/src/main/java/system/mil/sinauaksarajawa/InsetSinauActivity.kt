package system.mil.sinauaksarajawa

import android.content.Context
import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.gesture.Gesture
import android.gesture.GestureLibraries
import android.gesture.GestureLibrary
import android.gesture.Prediction
import android.media.Image
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.gesture.GestureOverlayView
import android.widget.Toast

import com.squareup.picasso.Picasso

import java.io.IOException
import java.io.LineNumberReader
import java.util.ArrayList

import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper


class InsetSinauActivity : AppCompatActivity(), GestureOverlayView.OnGesturePerformedListener {

    internal lateinit var mLibrary: GestureLibrary

    //inisialisasi urutan aksara
    private var urutan = 1

    private var aksara_rekan = ""

    //instansiasi objek view
    private var card_inset_sinau: ImageView? = null
    private var card_inset_sinau_suara: ImageView? = null
    private var aksaraguidance: ImageView? = null
    private var areanulis: LinearLayout? = null
    private var benernulis: LinearLayout? = null
    private var salahnnulis: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val extras = intent.extras

        setContentView(R.layout.activity_inset_sinau)

        //memanggil urutan aksara
        urutan = extras!!.getInt("aksara")

        //Linkage object ke view layout
        card_inset_sinau = findViewById<View>(R.id.card_inset_sinau) as ImageView
        card_inset_sinau_suara = findViewById<View>(R.id.card_inset_sinau_suara) as ImageView
        aksaraguidance = findViewById<View>(R.id.guidance) as ImageView

        areanulis = findViewById<View>(R.id.sinau_nulis) as LinearLayout
        benernulis = findViewById<View>(R.id.bener_nulis) as LinearLayout
        salahnnulis = findViewById<View>(R.id.salah_nulis) as LinearLayout

        //memanggil fungsi load aksara
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

    //Aksara Loader dengan parameter urutan
    private fun aksaraSelector(selector: Int) {
        when (selector) {
            1 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ha.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ha_guidance.png").into(aksaraguidance)
                aksara_rekan = "ha"
            }

            2 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/na.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/na_guidance.png").into(aksaraguidance)
                aksara_rekan = "na"
            }

            3 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ca.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ca_guidance.png").into(aksaraguidance)
                aksara_rekan = "ca"
            }

            4 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ra.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ra_guidance.png").into(aksaraguidance)
                aksara_rekan = "ra"
            }

            5 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ka.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ka_guidance.png").into(aksaraguidance)
                aksara_rekan = "ka"
            }

            6 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/da.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/da_guidance.png").into(aksaraguidance)
                aksara_rekan = "da"
            }

            7 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ta.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ta_guidance.png").into(aksaraguidance)
                aksara_rekan = "ta"
            }

            8 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/sa.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/sa_guidance.png").into(aksaraguidance)
                aksara_rekan = "sa"
            }

            9 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/wa.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/wa_guidance.png").into(aksaraguidance)
                aksara_rekan = "wa"
            }

            10 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/la.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/la_guidance.png").into(aksaraguidance)
                aksara_rekan = "la"
            }

            11 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/pa.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/pa_guidance.png").into(aksaraguidance)
                aksara_rekan = "pa"
            }

            12 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/dha.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/dha_guidance.png").into(aksaraguidance)
                aksara_rekan = "dha"
            }

            13 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ja.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ja_guidance.png").into(aksaraguidance)
                aksara_rekan = "ja"
            }

            14 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ya.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ya_guidance.png").into(aksaraguidance)
                aksara_rekan = "ya"
            }

            15 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/nya.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/nya_guidance.png").into(aksaraguidance)
                aksara_rekan = "nya"
            }

            16 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ma.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ma_guidance.png").into(aksaraguidance)
                aksara_rekan = "ma"
            }

            17 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ga.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ga_guidance.png").into(aksaraguidance)
                aksara_rekan = "ga"
            }

            18 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/ba.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/ba_guidance.png").into(aksaraguidance)
                aksara_rekan = "ba"
            }

            19 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/tha.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/tha_guidance.png").into(aksaraguidance)
                aksara_rekan = "tha"
            }

            20 -> {
                Picasso.with(applicationContext).load("file:///android_asset/img/nga.png").into(card_inset_sinau)
                Picasso.with(applicationContext).load("file:///android_asset/img/nga_guidance.png").into(aksaraguidance)
                aksara_rekan = "nga"
            }
        }
    }

    //handle button play sound
    fun playSound(V: View) {
        card_inset_sinau_suara!!.setImageDrawable(resources.getDrawable(R.drawable.suara_main))
        card_inset_sinau_suara!!.isEnabled = false
        Play(urutan.toString())
    }


    //handle play sound
    fun Play(fileName: String) {
        var descriptor: AssetFileDescriptor? = null
        try {
            descriptor = applicationContext.assets.openFd("snd/$fileName.wav")
        } catch (e: IOException) {
            e.printStackTrace()
        }

        val start = descriptor!!.startOffset
        val end = descriptor.length
        val mediaPlayer = MediaPlayer()
        try {
            mediaPlayer.setDataSource(descriptor.fileDescriptor, start, end)
        } catch (e: IOException) {
            e.printStackTrace()
        }

        try {
            mediaPlayer.prepare()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        mediaPlayer.setOnCompletionListener {
            card_inset_sinau_suara!!.setImageDrawable(resources.getDrawable(R.drawable.suara))
            card_inset_sinau_suara!!.isEnabled = true
        }
        mediaPlayer.start()

    }

    //handle kebenaran
    fun setKotakbener() {
        areanulis!!.isEnabled = false
        benernulis!!.visibility = View.VISIBLE
        salahnnulis!!.visibility = View.GONE
    }

    fun setKotakSalah() {
        areanulis!!.isEnabled = false
        benernulis!!.visibility = View.GONE
        salahnnulis!!.visibility = View.VISIBLE
    }


    //handle lanjut karakter
    fun lanjutSinau(V: View) {
        urutan = urutan + 1
        if (urutan < 21) {
            val i = Intent(this@InsetSinauActivity, InsetSinauActivity::class.java)
            i.putExtra("aksara", urutan)
            startActivity(i)
            finish()
        } else {
            finish()
        }

    }

    //handle lanjut karakter
    fun baleniSinau(V: View) {
        val i = Intent(this@InsetSinauActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", urutan)
        startActivity(i)
        finish()
    }

    //handling gesture
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
