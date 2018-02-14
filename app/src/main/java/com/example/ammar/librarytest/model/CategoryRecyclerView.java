package com.example.ammar.librarytest.model;


import android.support.v7.widget.RecyclerView;

public class CategoryRecyclerView {

    private String categoryName;
    private RecyclerView catergoryItemRecyclerView;
    //initialize list of items here


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public RecyclerView getCatergoryItemRecyclerView() {
        return catergoryItemRecyclerView;
    }

    public void setCatergoryItemRecyclerView(RecyclerView catergoryItemRecyclerView) {
        this.catergoryItemRecyclerView = catergoryItemRecyclerView;
    }

}
