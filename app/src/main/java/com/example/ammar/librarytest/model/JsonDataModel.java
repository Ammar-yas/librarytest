package com.example.ammar.librarytest.model;

import java.util.List;

public class JsonDataModel {

    List<Slider> Slider;
    List<AdvertModel> Advertising;
    List<CategoriesModel> Categories;

    public List<com.example.ammar.librarytest.model.Slider> getSlider() {
        return Slider;
    }

    public List<AdvertModel> getAdvertising() {
        return Advertising;
    }

    public List<CategoriesModel> getCategories() {
        return Categories;
    }

}
