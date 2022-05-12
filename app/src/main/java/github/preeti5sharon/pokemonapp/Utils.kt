package github.preeti5sharon.pokemonapp

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.palette.graphics.Palette

internal fun calcDominantColor(drawable: Drawable): Int? {
    val bmp = (drawable as BitmapDrawable).bitmap.copy(Bitmap.Config.ARGB_8888, true)
    return Palette.from(bmp).generate().dominantSwatch?.rgb
}