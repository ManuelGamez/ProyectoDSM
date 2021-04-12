package com.example.proyectodsm.ui.CarritoCompra;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.proyectodsm.R;

public class carritocompra extends Fragment {

    private CarritoComprasViewModel carritoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        carritoViewModel =
                new ViewModelProvider(this).get(CarritoComprasViewModel.class);
        View root = inflater.inflate(R.layout.activity_carritode_compra, container, false);
        final TextView textView = root.findViewById(R.id.text_home);

        return root;
    }
}