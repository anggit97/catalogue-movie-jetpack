package com.anggit97.cataloguemovie.utils

import com.anggit97.cataloguemovie.R
import com.anggit97.cataloguemovie.model.ResultMovie

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */
object FakeData {

    fun generateMovies() : ArrayList<ResultMovie>{
        val resultMovies : ArrayList<ResultMovie> = arrayListOf()

        resultMovies.add(
            ResultMovie(
                R.drawable.poster_alita,
                1,
                "Set several centuries in the future, the abandoned Alita is found in the scrapyard of Iron City by Ido, a compassionate cyber-doctor who takes the unconscious cyborg Alita to his clinic. When Alita awakens, she has no memory of who she is, nor does she have any recognition of the world she finds herself in. As Alita learns to navigate her new life and the treacherous streets of Iron City, Ido tries to shield her from her mysterious past.",
                3.5,
                "February 5, 2019",
                "Alita: Battle Angel",
                7.4,
                200
            )
        )

        resultMovies.add(
            ResultMovie(
                R.drawable.poster_aquaman,
                2,
                "Once home to the most advanced civilization on Earth, the city of Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people -- and then the surface world. Standing in his way is Aquaman, Orm's half-human, half-Atlantean brother and true heir to the throne. With help from royal counselor Vulko, Aquaman must retrieve the legendary Trident of Atlan and embrace his destiny as protector of the deep.",
                4.1,
                "December 21, 2018",
                "Aquaman",
                8.8,
                300
            )
        )

        resultMovies.add(
            ResultMovie(
                R.drawable.poster_a_start_is_born,
                3,
                "Seasoned musician Jackson Maine discovers -- and falls in love with -- struggling artist Ally. She has just about given up on her dream to make it big as a singer until Jackson coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jackson fights an ongoing battle with his own internal demons.",
                4.9,
                "October 19, 2018",
                "A Star Is Born",
                7.7,
                300
            )
        )

        return resultMovies
    }
}