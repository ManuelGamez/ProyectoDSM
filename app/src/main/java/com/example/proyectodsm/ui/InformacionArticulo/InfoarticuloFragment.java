package com.example.proyectodsm.ui.InformacionArticulo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.proyectodsm.R;
import com.example.proyectodsm.ui.CarritoCompra.CarritoComprasViewModel;

public class InfoarticuloFragment extends Fragment {
    private InformacionArticuloViewModel InforArtiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InforArtiViewModel =
                new ViewModelProvider(this).get(InformacionArticuloViewModel.class);
        View root = inflater.inflate(R.layout.activity_detalle_producto, container, false);
        final TextView textView = root.findViewById(R.id.tvNombreProducto);

        return root;
    }
}
