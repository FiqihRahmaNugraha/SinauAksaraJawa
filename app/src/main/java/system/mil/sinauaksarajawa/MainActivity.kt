package system.mil.sinauaksarajawa

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

import com.squareup.picasso.Picasso

import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

class MainActivity : AppCompatActivity() {

    //Instansiasi object ImageView
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

        //Inisialisasi font aplikasi
        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

        setContentView(R.layout.activity_main)

        //Linkage object dengan view layout
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

        //Load gambar ke layout menggunakan library picasso
        Picasso.with(applicationContext).load("file:///android_asset/img/ha.png").into(ha)
        Picasso.with(applicationContext).load("file:///android_asset/img/na.png").into(na)
        Picasso.with(applicationContext).load("file:///android_asset/img/ca.png").into(ca)
        Picasso.with(applicationContext).load("file:///android_asset/img/ra.png").into(ra)
        Picasso.with(applicationContext).load("file:///android_asset/img/ka.png").into(ka)

        Picasso.with(applicationContext).load("file:///android_asset/img/da.png").into(da)
        Picasso.with(applicationContext).load("file:///android_asset/img/ta.png").into(ta)
        Picasso.with(applicationContext).load("file:///android_asset/img/sa.png").into(sa)
        Picasso.with(applicationContext).load("file:///android_asset/img/wa.png").into(wa)
        Picasso.with(applicationContext).load("file:///android_asset/img/la.png").into(la)

        Picasso.with(applicationContext).load("file:///android_asset/img/pa.png").into(pa)
        Picasso.with(applicationContext).load("file:///android_asset/img/dha.png").into(dha)
        Picasso.with(applicationContext).load("file:///android_asset/img/ja.png").into(ja)
        Picasso.with(applicationContext).load("file:///android_asset/img/ya.png").into(ya)
        Picasso.with(applicationContext).load("file:///android_asset/img/nya.png").into(nya)

        Picasso.with(applicationContext).load("file:///android_asset/img/ma.png").into(ma)
        Picasso.with(applicationContext).load("file:///android_asset/img/ga.png").into(ga)
        Picasso.with(applicationContext).load("file:///android_asset/img/ba.png").into(ba)
        Picasso.with(applicationContext).load("file:///android_asset/img/tha.png").into(tha)
        Picasso.with(applicationContext).load("file:///android_asset/img/nga.png").into(nga)

    }

    //Implementasi font aplikasi
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }


    //Handle Inset Sinau --> per aksara
    fun sinauHa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 1)
        startActivity(i)
    }

    fun sinauNa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 2)
        startActivity(i)
    }

    fun sinauCa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 3)
        startActivity(i)
    }

    fun sinauRa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 4)
        startActivity(i)
    }

    fun sinauKa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 5)
        startActivity(i)
    }

    fun sinauDa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 6)
        startActivity(i)
    }

    fun sinauTa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 7)
        startActivity(i)
    }

    fun sinauSa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 8)
        startActivity(i)
    }

    fun sinauWa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 9)
        startActivity(i)
    }

    fun sinauLa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 10)
        startActivity(i)
    }

    fun sinauPa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 11)
        startActivity(i)
    }

    fun sinauDha(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 12)
        startActivity(i)
    }

    fun sinauJa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 13)
        startActivity(i)
    }

    fun sinauYa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 14)
        startActivity(i)
    }

    fun sinauNya(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 15)
        startActivity(i)
    }

    fun sinauMa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 16)
        startActivity(i)
    }

    fun sinauGa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 17)
        startActivity(i)
    }

    fun sinauBa(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 18)
        startActivity(i)
    }

    fun sinauTha(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 19)
        startActivity(i)
    }

    fun sinauNga(V: View) {
        val i = Intent(this@MainActivity, InsetSinauActivity::class.java)
        i.putExtra("aksara", 20)
        startActivity(i)
    }
    //Handle Inset Sinau --> per aksara
}