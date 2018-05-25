package luanoliveiradasilva.com.br.marvelapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private val splash_display_lenth = 3000L


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    fun carregar(){
        val anim = AnimationUtils.loadAnimation(this, R.anim.animation_splashscreen)
        anim.reset()

        backgroundimage.clearAnimation()
        backgroundimage.startAnimation(anim)

        Handler().postDelayed({
            // apos o tempo determinado ira executar a proxima tela
            val  intent = Intent(this@SplashActivity,
                    ListaActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
            startActivity(intent)
            this@SplashActivity.finish()
        }, splash_display_lenth)
    }
}
