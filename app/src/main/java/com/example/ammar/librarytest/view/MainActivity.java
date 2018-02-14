package com.example.ammar.librarytest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ammar.librarytest.R;
import com.example.ammar.librarytest.model.JsonDataModel;
import com.example.ammar.librarytest.model.Slider;
import com.example.ammar.librarytest.presenter.CategoryAdapter;
import com.example.ammar.librarytest.presenter.QueryUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.RemoteBanner;
import ss.com.bannerslider.views.BannerSlider;

public class MainActivity extends AppCompatActivity implements QueryUtils.OnResposeRecivedListner {


    QueryUtils queryUtils;

    @BindView(R.id.activity_main_banner_slider)
    BannerSlider bannerSlider;
    @BindView(R.id.activity_main_rv)
    RecyclerView mainRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        queryUtils = new QueryUtils(this);
        queryUtils.newRequest();


        //Banner Array list
/*        List<Banner> banners = new ArrayList<>();
        for (Slider slider : queryUtils.getSliders()) {
            banners.add(new RemoteBanner(slider.getImagePath()));
        }
        bannerSlider.setBanners(banners);*/


//        CategoryAdapter categoryAdapter = new CategoryAdapter();
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        mainRecyclerView.setLayoutManager(linearLayoutManager);
//        mainRecyclerView.setAdapter(categoryAdapter);


    }

    @Override
    public void OnResponseRecived(String response) {
        JsonDataModel jsonDataModel = queryUtils.modelResponse(response);
        createBanners(jsonDataModel);
    }

    public void createBanners(JsonDataModel jsonDataModel) {
        List<Banner> banners = new ArrayList<>();
        for (Slider slider : queryUtils.getSliders(jsonDataModel)) {
            banners.add(new RemoteBanner(slider.getImagePath()));
        }
        bannerSlider.setBanners(banners);
    }

}
