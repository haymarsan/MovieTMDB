package com.hms.movie_tmdb.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.hms.movie_tmdb.R
import com.hms.movie_tmdb.adapter.TopRatedMovieAdapter
import com.hms.movie_tmdb.data.vos.TopRatedMoviesVO
import com.hms.movie_tmdb.delegates.GetTopRatedDelegate
import com.hms.movie_tmdb.mvp.presenter.HomePresenter
import com.hms.movie_tmdb.mvp.view.HomeView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), HomeView {


    private lateinit var mHomePresenter: HomePresenter
    var topRatedMovieAdapter : TopRatedMovieAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        mHomePresenter = HomePresenter()
        mHomePresenter.initPresenter(this)

        rvTopRatedMovies.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        topRatedMovieAdapter = TopRatedMovieAdapter()
        rvTopRatedMovies.adapter
        (topRatedMovieAdapter)



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun displayTopRatedMovies(topRatedMoviesList: List<TopRatedMoviesVO>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showPrompt(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
