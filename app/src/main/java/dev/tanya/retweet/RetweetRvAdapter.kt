package dev.tanya.retweet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RetweetRvAdapter(var TweetList:List<tweet>):
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=TweetList.get(position)
        holder.tvName.text=currentContact.Name
        holder.tvEmail.text=currentContact.Email
        holder.tvTweet1.text=currentContact.Tweet1
//        holder.tvMessage.text=currentContact.number
//        holder.tvFav.text=currentContact.number
//        holder.tvretweet.text=currentContact.number


    }

    override fun getItemCount(): Int {
        return TweetList.size
    }

}
class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvTweet1 = itemView.findViewById<TextView>(R.id.tvtweet1)
    var tvMessage = itemView.findViewById<TextView>(R.id.tvmessage)
    var imgProfile = itemView.findViewById<ImageView>(R.id.imgProfile)
    var imgMessage = itemView.findViewById<ImageView>(R.id.imagMessage)
    var imgFav = itemView.findViewById<ImageView>(R.id.imgFav)
    var tvFav = itemView.findViewById<ImageView>(R.id.tvFav)
    var tvretweet = itemView.findViewById<ImageView>(R.id.tvretweet)
    var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)

}
