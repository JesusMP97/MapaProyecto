package com.example.mapaproyecto;

import android.view.View;
import android.widget.ImageView;

public class Mesa {
    private int tipoMesa;
    public static final int CUADRUPLE = 0, DOBLE_HORIZONTAL = 1, DOBLE_VERTICAL = 2, REDONDA = 3, SILLA = 4;
    public static final int LIBRE = 0, OCUPADA = 1, RESERVADA = 2;
    private int estado = LIBRE;
    ImageView ivMesa;
    private int imgResource;

    public Mesa(int tipoMesa, ImageView ivMesa) {
        this.tipoMesa = tipoMesa;
        switch(tipoMesa){

            case CUADRUPLE:                 imgResource = R.drawable.mesacuadruple;
                                            break;

            case DOBLE_HORIZONTAL:          imgResource = R.drawable.mesadoble_horizontal;
                                            break;

            case DOBLE_VERTICAL:            imgResource = R.drawable.mesadoble_vertical;
                                            break;

            case REDONDA:                   imgResource = R.drawable.mesaredonda;
                                            break;

            case SILLA:                     imgResource = R.drawable.silla;
                                            break;
        }

        this.ivMesa = ivMesa;
        this.ivMesa.setOnClickListener(setListener());
    }

    private View.OnClickListener setListener(){
        View.OnClickListener listener = null;

        switch(tipoMesa){

            case CUADRUPLE:                 listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(estado == LIBRE){
                        estado = OCUPADA;
                        ivMesa.setImageResource(R.drawable.mesacuadruple_ocupada);
                    }else if(estado == OCUPADA){
                        estado = RESERVADA;
                        ivMesa.setImageResource(R.drawable.mesacuadruple_bloqueada);
                    }else if(estado == RESERVADA){
                        estado = LIBRE;
                        ivMesa.setImageResource(R.drawable.mesacuadruple);
                    }
                }
            };
                break;

            case DOBLE_HORIZONTAL:          listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(estado == LIBRE){
                        estado = OCUPADA;
                        ivMesa.setImageResource(R.drawable.mesadoble_horizontal_ocupada);
                    }else if(estado == OCUPADA){
                        estado = RESERVADA;
                        ivMesa.setImageResource(R.drawable.mesadoble_horizontal_bloqueada);
                    }else if(estado == RESERVADA){
                        estado = LIBRE;
                        ivMesa.setImageResource(R.drawable.mesadoble_horizontal);
                    }
                }
            };
                break;

            case DOBLE_VERTICAL:            listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(estado == LIBRE){
                        estado = OCUPADA;
                        ivMesa.setImageResource(R.drawable.mesadoble_vertical_ocupada);
                    }else if(estado == OCUPADA){
                        estado = RESERVADA;
                        ivMesa.setImageResource(R.drawable.mesadoble_vertical_bloqueada);
                    }else if(estado == RESERVADA){
                        estado = LIBRE;
                        ivMesa.setImageResource(R.drawable.mesadoble_vertical);
                    }
                }
            };
                break;

            case REDONDA:                   listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(estado == LIBRE){
                        estado = OCUPADA;
                        ivMesa.setImageResource(R.drawable.mesaredonda_ocupada);
                    }else if(estado == OCUPADA){
                        estado = RESERVADA;
                        ivMesa.setImageResource(R.drawable.mesaredonda_bloqueada);
                    }else if(estado == RESERVADA){
                        estado = LIBRE;
                        ivMesa.setImageResource(R.drawable.mesaredonda);
                    }
                }
            };
                break;

            case SILLA:                     listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(estado == LIBRE){
                        estado = OCUPADA;
                        ivMesa.setImageResource(R.drawable.silla_ocupada);
                    }else if(estado == OCUPADA){
                        estado = RESERVADA;
                        ivMesa.setImageResource(R.drawable.silla_bloqueada);
                    }else if(estado == RESERVADA){
                        estado = LIBRE;
                        ivMesa.setImageResource(R.drawable.silla);
                    }
                }
            };
                break;
        }

        return listener;
    }

    public int getTipoMesa() {
        return tipoMesa;
    }

    public void setTipoMesa(int tipoMesa) {
        this.tipoMesa = tipoMesa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
