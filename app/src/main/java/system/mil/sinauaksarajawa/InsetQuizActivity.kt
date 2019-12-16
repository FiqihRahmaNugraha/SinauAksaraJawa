package system.mil.sinauaksarajawa

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper


class InsetQuizActivity : AppCompatActivity() {

    //instansiasi object view
    lateinit var gambarSoal: ImageView
    lateinit var soal: TextView
    lateinit var jawabanA: TextView
    lateinit var jawabanB: TextView
    lateinit var jawabanC: TextView
    lateinit var jawabanyangbenar: TextView
    lateinit var bijitotal: TextView
    lateinit var jawabanbener: LinearLayout
    lateinit var jawabansalah: LinearLayout
    lateinit var lembarsoal: LinearLayout
    lateinit var kuiserampung: LinearLayout

    //inisialisasi variabel
    var jawabanbenar = ""
    var pilihanjawaban = ""
    var nilai = 0
    var soalTampil = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )

        setContentView(R.layout.activity_inset_quiz)

        //link object ke layout view
        gambarSoal = findViewById<View>(R.id.gambar_soal) as ImageView
        soal = findViewById<View>(R.id.teks_soal) as TextView
        jawabanA = findViewById<View>(R.id.jawaban_a) as TextView
        jawabanB = findViewById<View>(R.id.jawaban_b) as TextView
        jawabanC = findViewById<View>(R.id.jawaban_c) as TextView
        jawabanyangbenar = findViewById<View>(R.id.jawabansingbener) as TextView
        bijitotal = findViewById<View>(R.id.totalbiji) as TextView

        jawabanbener = findViewById<View>(R.id.jawabanbenar) as LinearLayout
        jawabansalah = findViewById<View>(R.id.jawabansalah) as LinearLayout
        lembarsoal = findViewById<View>(R.id.paparescaradas) as LinearLayout
        kuiserampung = findViewById<View>(R.id.kuisentek) as LinearLayout

        //memanggil method buat soal
        getSoal(soalTampil)

    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }


    //DATA SOAL
    fun soal1() {
        gambarSoal.setImageResource(R.drawable.gambarsoal1)
        soal.text = "Kewan ing dhuwur arane..."
        jawabanA.text = "A. Biawak"
        jawabanB.text = "B. Boyo"
        jawabanC.text = "C. Kadal"
        jawabanbenar = "B. Boyo"
    }

    fun soal2() {
        gambarSoal.setImageResource(R.drawable.gambarsoal2)
        soal.text = "Manuk ing dhuwur arane..."
        jawabanA.text = "A. Dara"
        jawabanB.text = "B. Emprit"
        jawabanC.text = "C. Gagak"
        jawabanbenar = "A. Dara"
    }

    fun soal3() {
        gambarSoal.setImageResource(R.drawable.gambarsoal3)
        soal.text = "Alat ing dhuwur arane..."
        jawabanA.text = "A. Kacamata"
        jawabanB.text = "B. Lensa"
        jawabanC.text = "C. Alis"
        jawabanbenar = "A. Kacamata"
    }

    fun soal4() {
        gambarSoal.setImageResource(R.drawable.gambarsoal4)
        soal.text = "Kewan sing mabure wengi kaya ing dhuwur iku arane..."
        jawabanA.text = "A. Manuk"
        jawabanB.text = "B. Lawa"
        jawabanC.text = "C. Coro"
        jawabanbenar = "B. Lawa"
    }

    fun soal5() {
        gambarSoal.setImageResource(R.drawable.gambarsoal5)
        soal.text = "Material bangunan ing dhuwur arane..."
        jawabanA.text = "A. Gendeng"
        jawabanB.text = "B. Bata"
        jawabanC.text = "C. Gabus"
        jawabanbenar = "B. Bata"
    }

    fun soal6() {
        gambarSoal.setImageResource(R.drawable.gambarsoal6)
        soal.text = "Tulisan jawa ing dhuwur wacane..."
        jawabanA.text = "A. rawa"
        jawabanB.text = "B. dawa"
        jawabanC.text = "C. bala"
        jawabanbenar = "A. rawa"
    }

    fun soal7() {
        gambarSoal.setImageResource(R.drawable.gambarsoal7)
        soal.text = "Tulisan jawa ing dhuwur wacane..."
        jawabanA.text = "A. bata tata"
        jawabanB.text = "B. bata nata"
        jawabanC.text = "C. nata bata"
        jawabanbenar = "C. nata bata"
    }

    fun soal8() {
        gambarSoal.setImageResource(R.drawable.gambarsoal8)
        soal.text = "Tulisan jawa ing dhuwur wacane..."
        jawabanA.text = "A. maca"
        jawabanB.text = "B. mata"
        jawabanC.text = "C. mara"
        jawabanbenar = "B. mata"
    }

    fun soal9() {
        gambarSoal.setImageResource(R.drawable.gambarsoal9)
        soal.text = "Tulisan jawa ing dhuwur wacane..."
        jawabanA.text = "A. dana"
        jawabanB.text = "B. dawa"
        jawabanC.text = "C. mawa"
        jawabanbenar = "C. mawa"
    }

    fun soal10() {
        gambarSoal.setImageResource(R.drawable.gambarsoal10)
        soal.text = "Tulisan jawa ing dhuwur wacane..."
        jawabanA.text = "A. ana dara sanga"
        jawabanB.text = "B. ana lawa sanga"
        jawabanC.text = "C. ana bata sanga"
        jawabanbenar = "A. ana dara sanga"
    }
    //DATA SOAL


    //handle soal selanjutnya
    fun nextSoal(v: View) {

        jawabanbener.visibility = View.GONE
        jawabansalah.visibility = View.GONE
        kuiserampung.visibility = View.GONE
        lembarsoal.isEnabled = true

        soalTampil++
        if (soalTampil < 11) {
            getSoal(soalTampil)
        } else {
            tampilBiji()
        }


    }

    //handle menampilkan nilai
    fun tampilBiji() {
        //lembarsoal.setEnabled(false);
        kuiserampung.visibility = View.VISIBLE
        bijitotal.text = nilai.toString()
    }

    //Fungsi membuat soal
    fun getSoal(a: Int) {
        when (a) {
            1 -> soal1()

            2 -> soal2()

            3 -> soal3()

            4 -> soal4()

            5 -> soal5()

            6 -> soal6()

            7 -> soal7()

            8 -> soal8()

            9 -> soal9()

            10 -> soal10()
        }
    }

    //handle jawaban A
    fun takeJawabanA(v: View) {
        pilihanjawaban = jawabanA.text.toString()
        pembandingJawaban()
    }

    //handle jawaban b
    fun takeJawabanB(v: View) {
        pilihanjawaban = jawabanB.text.toString()
        pembandingJawaban()
    }


    //handle jawaban c
    fun takeJawabanC(v: View) {
        pilihanjawaban = jawabanC.text.toString()
        pembandingJawaban()
    }

    //pemeriksa kebenaran jawaban
    fun pembandingJawaban() {
        if (jawabanbenar.equals(pilihanjawaban, ignoreCase = true)) {
            lembarsoal.isEnabled = false
            jawabanbener.visibility = View.VISIBLE
            jawabansalah.visibility = View.GONE
            kuiserampung.visibility = View.GONE
            nilai = nilai + 10
        } else {
            lembarsoal.isEnabled = false
            jawabanbener.visibility = View.GONE
            jawabansalah.visibility = View.VISIBLE
            kuiserampung.visibility = View.GONE
            jawabanyangbenar.text = jawabanbenar
            nilai = nilai - 10
        }
    }

    //handle kuis selesai
    fun kuisrampung(v: View) {
        finish()
    }
}
