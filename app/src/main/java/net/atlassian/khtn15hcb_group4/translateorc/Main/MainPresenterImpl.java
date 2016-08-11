package net.atlassian.khtn15hcb_group4.translateorc.Main;

import android.widget.Button;

import java.util.List;

/**
 * Created by Hidro Le on 8/5/2016.
 */
public class MainPresenterImpl implements MainPresenter, MainInteractor.OnFinishedListener{
    protected MainView mainView;
    protected  MainInteractor mainInteractor;
    public MainPresenterImpl(MainView mainView, MainInteractor mainInteractor) {
        this.mainView = mainView;
        this.mainInteractor =mainInteractor;
    }

    @Override
    public void onFinished(List<String> items) {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onButtonClicked(Button btn) {

    }

    @Override
    public void onDestroy() {

    }
}
