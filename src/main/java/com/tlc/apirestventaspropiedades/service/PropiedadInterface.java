package com.tlc.apirestventaspropiedades.service;

import com.tlc.apirestventaspropiedades.models.Propiedad;

import java.util.List;

public interface PropiedadInterface{
      void agragar(Propiedad propiedad);
     void modificar(Propiedad propiedad);

     void eliminar(Long id);

     Propiedad get(Long id);


     List<Propiedad> getALL();

}
