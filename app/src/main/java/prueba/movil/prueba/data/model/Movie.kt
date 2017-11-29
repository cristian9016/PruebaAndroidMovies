package prueba.movil.prueba.data.model

import android.annotation.SuppressLint
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by Ana Marin on 26/11/2017.
 */
@SuppressLint("ParcelCreator")
@Parcelize
@Entity
class Movie: Item(), Parcelable {

    @PrimaryKey
    var id:Long? = null
    @SerializedName("release_date")
    lateinit var releaseDate:String
    var adult:Boolean = false

    override fun getType(): Int = TYPE_MOVIE
}