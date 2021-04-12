package com.example.proyectodsm.ui.CarritoCompra;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import androidx.lifecycle.ViewModel;

public class CarritoComprasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CarritoComprasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is carrito fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
