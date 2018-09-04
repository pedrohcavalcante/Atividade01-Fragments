package com.example.androidbti.atividade01;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ButtonsFragment extends Fragment implements View.OnClickListener {

    public interface ChangeColorListener{
        void changeColor(int color);

    }

    private ChangeColorListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof ChangeColorListener)){
            throw new RuntimeException("contexto nao e ChangeColorListener");
        }

        listener = (ChangeColorListener) context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons, container, false);
        view.findViewById(R.id.black).setOnClickListener(this);
        view.findViewById(R.id.red).setOnClickListener(this);
        view.findViewById(R.id.green).setOnClickListener(this);
        view.findViewById(R.id.yellow).setOnClickListener(this);
        view.findViewById(R.id.blue).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int color;
        int id = v.getId();

        if(id == R.id.black){
            color = Color.BLACK;
        } else if (id == R.id.blue){
            color = Color.BLUE;
        } else if (id == R.id.red){
            color = Color.RED;
        } else if (id == R.id.yellow){
            color = Color.YELLOW;
        } else if (id == R.id.green) {
            color = Color.GREEN;
        } else {
            color = Color.WHITE;
        }

        listener.changeColor(color);

    }
}
