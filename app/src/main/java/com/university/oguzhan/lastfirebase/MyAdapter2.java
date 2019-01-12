package com.university.oguzhan.lastfirebase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder2> {

    Context context;
    ArrayList<Profile> profiles;

    public MyAdapter2(Context c, ArrayList<Profile> p){
        context = c;
        profiles = p;

    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder2(LayoutInflater.from(context).inflate(R.layout.cardview,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 myViewHolder2, int position) {
        myViewHolder2.name.setText(profiles.get(position).getName());
        myViewHolder2.director.setText(profiles.get(position).getDirector());
        myViewHolder2.description.setText(profiles.get(position).getDescription());
        myViewHolder2.year.setText(profiles.get(position).getYear());
        Picasso.get().load(profiles.get(position).getMoviepic()).into(myViewHolder2.moviepic);

    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class MyViewHolder2 extends RecyclerView.ViewHolder{

        TextView name;
        TextView description;
        TextView year;
        ImageView moviepic;
        TextView director;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            description = (TextView) itemView.findViewById(R.id.description);
            year = (TextView) itemView.findViewById(R.id.year);
            moviepic = (ImageView) itemView.findViewById(R.id.moviepic);
            director = (TextView) itemView.findViewById(R.id.director);
        }
    }
}
