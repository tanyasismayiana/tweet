package dev.tanya.retweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.tanya.retweet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun displayTwitter(){
        var post1 = tweet("Mitchell","@mit","I love coding","","","","","")
        var post2 = tweet("Mitchell","@mit","I love coding","","","","","")
        var post3 = tweet("Mitchell","@mit","I love coding","","","","","")
        var post4 = tweet("Mitchell","@mit","I love coding","","","","","")
        var post5 = tweet("Mitchell","@mit","I love coding","","","","","")
        var post6 = tweet("Mitchell","@mit","I love coding","","","","","")
        var post7 = tweet("Mitchell","@mit","I love coding","","","","","")
        var post8 = tweet("Mitchell","@mit","I love coding","","","","","")
        var twitterList= listOf(post1,post2,post3,post4,post5,post6,post7,post8)
        var twitterAdapter = RetweetRvAdapter(twitterList)
        binding.rvtweet.layoutManager = LinearLayoutManager(this)
        binding.rvtweet.adapter = twitterAdapter


    }
}