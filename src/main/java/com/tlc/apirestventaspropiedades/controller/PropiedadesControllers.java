package com.tlc.apirestventaspropiedades.controller;

import com.tlc.apirestventaspropiedades.models.Propiedad;
import com.tlc.apirestventaspropiedades.models.Vendedor;
import com.tlc.apirestventaspropiedades.service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
public class PropiedadesControllers {

    @Autowired
    private PropiedadService propiedadService;


    @PostMapping("/api/propiedad")
    public void agregar(@RequestBody Propiedad propiedad){
        propiedadService.agregar(propiedad);

    }
    //modificar vendedor: api/vendedor/B Put
    @PutMapping("/api/propiedad/{id}")
    public void modificar(@RequestBody Propiedad propiedad, @PathVariable("id") String id){
    propiedadService.modificar(propiedad);

    }

    //eliminar vendedor: api/vendedor/B delete
    @DeleteMapping("/api/propiedad/{id}")
    public void eliminar( @PathVariable("id") Long id){
     propiedadService.eliminar(id);
    }

    @GetMapping("/api/propiedad/{id}")
    public Propiedad get(@PathVariable("id")Long id){
       Propiedad propiedad = new Propiedad();
       propiedad.setId(1L);
       propiedad.setAno("1235");
       propiedad.setBanos("3");
       propiedad.setTitulo("bueno");
       propiedad.setDescripcion("playa");
       return propiedad;
    }

    @GetMapping("/api/propiedad")
    public List<Propiedad> getAll() {
        List<Propiedad> lista = new ArrayList<>();
        Propiedad propiedad = new Propiedad();
        propiedad.setId(1L);
        propiedad.setAno("1235");
        propiedad.setBanos("3");
        propiedad.setTitulo("bueno");
        propiedad.setDescripcion("playa");

        Propiedad propiedad1 = new Propiedad();
        propiedad1.setId(2L);
        propiedad1.setAno("1235");
        propiedad1.setBanos("3");
        propiedad1.setTitulo("bueno");
        propiedad1.setDescripcion("playa");
        lista.add(propiedad);
        lista.add(propiedad1);
        return lista;



    }
}
