package com.example.a21173066_15st_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class MovieAdapter extends  RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<Movie>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {
        Movie item = items.get(position);
        viewholder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void addItem(Movie item){ items.add(item); }
    public void setItems(ArrayList<Movie> items){ this.items = items; }
    public Movie getItem(int position){ return items.get(position); }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView movieName;
        TextView peopleCount;
        TextView movierank;
        TextView openDate;
        TextView moviernum;
        TextView movieshowCut;

        public ViewHolder(View itemView){
            super(itemView);
            movieName = itemView.findViewById(R.id.movieName);
            peopleCount = itemView.findViewById(R.id.peopleCount);
            movierank = itemView.findViewById(R.id.movierank);
            openDate = itemView.findViewById(R.id.openDate);
            moviernum = itemView.findViewById(R.id.moviernum);
            movieshowCut = itemView.findViewById(R.id. movieshowCut);

        }

        public void setItem(Movie item)
        {
            movieName.setText(item.movieNm);
            peopleCount.setText(item.audiCnt+"명");
            movierank.setText(item.rank+"위");
            openDate.setText(item.openDt+"일");
            moviernum.setText(item.rnum+"번");
            movieshowCut.setText("상영횟수:"+item.showCnt);
        }

    }
}

