package com.example.lisiyan.cloudlook.bean.moviechild;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.http.ParamNames;
import com.example.lisiyan.cloudlook.BR;

import java.io.Serializable;

/**
 * Created by lisiyan on 2017/11/28.
 */

public class ImagesBean extends BaseObservable implements Serializable {
    /**
     * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2378133884.jpg
     * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2378133884.jpg
     * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2378133884.jpg
     */
    @ParamNames("small")
    private String small;
    @ParamNames("large")
    private String large;
    @ParamNames("medium")
    private String medium;
    @Bindable
    public String getSmall() {
        return small;
    }
    @Bindable
    public String getLarge() {
        return large;
    }
    @Bindable
    public String getMedium() {
        return medium;
    }

    public void setSmall(String small) {
        this.small = small;
        notifyPropertyChanged(BR.small);
    }

    public void setLarge(String large) {
        this.large = large;
        notifyPropertyChanged(BR.large);
    }

    public void setMedium(String medium) {
        this.medium = medium;
        notifyPropertyChanged(BR.medium);
    }
}
