package com.example.ammar.librarytest.presenter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ammar.librarytest.R;
import com.example.ammar.librarytest.model.CategoryRecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    List<CategoryRecyclerView> categoryRecyclerViews;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_recycler_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //advertisement has no title
        //there is advertisement section between every two categories
        if (position % 3 == 0) {
            holder.categoryTitle.setVisibility(View.GONE);

        } else {
            holder.categoryTitle.setText(categoryRecyclerViews.get(position).getCategoryName());
        }

    }

    @Override
    public int getItemCount() {
        return categoryRecyclerViews.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.category_title)
        TextView categoryTitle;
        @BindView(R.id.category_items_recycler_view)
        RecyclerView itemsRecyclerView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);
        }
    }

    CategoryAdapter(List<CategoryRecyclerView> categoryRecyclerViews) {
        this.categoryRecyclerViews = categoryRecyclerViews;
    }


}
