package system.mil.sinauaksarajawa

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView

import com.squareup.picasso.Picasso

import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

class NulisActivity : AppCompatActivity() {

    internal lateinit var ha: ImageView
    internal lateinit var na: ImageView
    internal lateinit var ca: ImageView
    internal lateinit var ra: ImageView
    internal lateinit var ka: ImageView
    internal lateinit var da: ImageView
    internal lateinit var ta: ImageView
    internal lateinit var sa: ImageView
    internal lateinit var wa: ImageView
    internal lateinit var la: ImageView
    internal lateinit var pa: ImageView
    internal lateinit var dha: ImageView
    internal lateinit var ja: ImageView
    internal lateinit var ya: ImageView
    internal lateinit var nya: ImageView
    internal lateinit var ma: ImageView
    internal lateinit var ga: ImageView
    internal lateinit var ba: ImageView
    internal lateinit var tha: ImageView
    internal lateinit var nga: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

        setContentView(R.layout.activity_nulis)

        ha = findViewById<View>(R.id.ha) as ImageView
        na = findViewById<View>(R.id.na) as ImageView
        ca = findViewById<View>(R.id.ca) as ImageView
        ra = findViewById<View>(R.id.ra) as ImageView
        ka = findViewById<View>(R.id.ka) as ImageView
        da = findViewById<View>(R.id.da) as ImageView
        ta = findViewById<View>(R.id.ta) as ImageView
        sa = findViewById<View>(R.id.sa) as ImageView
        wa = findViewById<View>(R.id.wa) as ImageView
        la = findViewById<View>(R.id.la) as ImageView
        pa = findViewById<View>(R.id.pa) as ImageView
        dha = findViewById<View>(R.id.dha) as ImageView
        ja = findViewById<View>(R.id.ja) as ImageView
        ya = findViewById<View>(R.id.ya) as ImageView
        nya = findViewById<View>(R.id.nya) as ImageView
        ma = findViewById<View>(R.id.ma) as ImageView
        ga = findViewById<View>(R.id.ga) as ImageView
        ba = findViewById<View>(R.id.ba) as ImageView
        tha = findViewById<View>(R.id.tha) as ImageView
        nga = findViewById<View>(R.id.nga) as ImageView

        Picasso.with(applicationContext).load("file:///android_asset/img/ha_huruf.png").into(ha)
        Picasso.with(applicationContext).load("file:///android_asset/img/na_huruf.png").into(na)
        Picasso.with(applicationContext).load("file:///android_asset/img/ca_huruf.png").into(ca)
        Picasso.with(applicationContext).load("file:///android_asset/img/ra_huruf.png").into(ra)
        Picasso.with(applicationContext).load("file:///android_asset/img/ka_huruf.png").into(ka)

        Picasso.with(applicationContext).load("file:///android_asset/img/da_huruf.png").into(da)
        Picasso.with(applicationContext).load("file:///android_asset/img/ta_huruf.png").into(ta)
        Picasso.with(applicationContext).load("file:///android_asset/img/sa_huruf.png").into(sa)
        Picasso.with(applicationContext).load("file:///android_asset/img/wa_huruf.png").into(wa)
        Picasso.with(applicationContext).load("file:///android_asset/img/la_huruf.png").into(la)

        Picasso.with(applicationContext).load("file:///android_asset/img/pa_huruf.png").into(pa)
        Picasso.with(applicationContext).load("file:///android_asset/img/dha_huruf.png").into(dha)
        Picasso.with(applicationContext).load("file:///android_asset/img/ja_huruf.png").into(ja)
        Picasso.with(applicationContext).load("file:///android_asset/img/ya_huruf.png").into(ya)
        Picasso.with(applicationContext).load("file:///android_asset/img/nya_huruf.png").into(nya)

        Picasso.with(applicationContext).load("file:///android_asset/img/ma_huruf.png").into(ma)
        Picasso.with(applicationContext).load("file:///android_asset/img/ga_huruf.png").into(ga)
        Picasso.with(applicationContext).load("file:///android_asset/img/ba_huruf.png").into(ba)
        Picasso.with(applicationContext).load("file:///android_asset/img/tha_huruf.png").into(tha)
        Picasso.with(applicationContext).load("file:///android_asset/img/nga_huruf.png").into(nga)

    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }

    fun goToNulisAksara(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        startActivity(i)
    }

    fun nulisHa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 1)
        startActivity(i)
    }

    fun nulisNa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 2)
        startActivity(i)
    }

    fun nulisCa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 3)
        startActivity(i)
    }

    fun nulisRa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 4)
        startActivity(i)
    }

    fun nulisKa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 5)
        startActivity(i)
    }

    fun nulisDa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 6)
        startActivity(i)
    }

    fun nulisTa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 7)
        startActivity(i)
    }

    fun nulisSa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 8)
        startActivity(i)
    }

    fun nulisWa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 9)
        startActivity(i)
    }

    fun nulisLa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 10)
        startActivity(i)
    }

    fun nulisPa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 11)
        startActivity(i)
    }

    fun nulisDha(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 12)
        startActivity(i)
    }

    fun nulisJa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 13)
        startActivity(i)
    }

    fun nulisYa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 14)
        startActivity(i)
    }

    fun nulisNya(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 15)
        startActivity(i)
    }

    fun nulisMa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 16)
        startActivity(i)
    }

    fun nulisGa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 17)
        startActivity(i)
    }

    fun nulisBa(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 18)
        startActivity(i)
    }

    fun nulisTha(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 19)
        startActivity(i)
    }

    fun nulisNga(V: View) {
        val i = Intent(this@NulisActivity, InsetNulisActivity::class.java)
        i.putExtra("aksara", 20)
        startActivity(i)
    }

}
