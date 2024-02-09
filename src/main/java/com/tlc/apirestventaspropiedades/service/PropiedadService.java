package com.tlc.apirestventaspropiedades.service;


import com.tlc.apirestventaspropiedades.models.Propiedad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropiedadService {

    public void agregar(Propiedad propiedad){
        if (propiedad.getTitulo().equals("")){
            return;
        }

    }

    public void modificar(Propiedad propiedad){


    }

    public void eliminar(Long id){


    }

    public Propiedad get(Long id){
    return  null;

    }


    public List<Propiedad>getAll(){
return  null;

    }




}
