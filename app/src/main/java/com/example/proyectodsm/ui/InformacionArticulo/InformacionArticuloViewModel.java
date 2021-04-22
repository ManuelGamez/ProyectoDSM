package com.example.proyectodsm.ui.InformacionArticulo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformacionArticuloViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public InformacionArticuloViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is carrito fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
