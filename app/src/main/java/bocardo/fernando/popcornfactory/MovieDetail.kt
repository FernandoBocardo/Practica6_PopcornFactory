package bocardo.fernando.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        var titulo: String? = intent.getStringExtra("titulo")
        var sinopsis: String? = intent.getStringExtra("sinopsis")
        var header: Int = intent.getIntExtra("header", 0)
        var image: Int = intent.getIntExtra("image", 0)

        var headerPeli: ImageView = findViewById(R.id.headerPelicula)
        var tituloPeli: TextView = findViewById(R.id.tituloPelicula)
        var sinopsisPeli: TextView = findViewById(R.id.sinopsisPelicula)

        headerPeli.setImageResource(header)
        tituloPeli.setText(titulo)
        sinopsisPeli.setText(sinopsis)
    }
}