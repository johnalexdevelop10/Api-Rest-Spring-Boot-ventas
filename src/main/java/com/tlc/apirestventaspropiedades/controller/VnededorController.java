package com.tlc.apirestventaspropiedades.controller;


import com.tlc.apirestventaspropiedades.models.Vendedor;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RestController
public class VnededorController {
    //add vendedor: api/vendedor Post
    @PostMapping("/api/vendedor")
    public void agregar(@RequestBody  Vendedor vendedor){

    }
    //modificar vendedor: api/vendedor/B Put
    @PutMapping("/api/vendedor/{id}")
    public void modificar(@RequestBody Vendedor vendedor, @PathVariable("id") String id){

    }

    //eliminar vendedor: api/vendedor/B delete
    @DeleteMapping("/api/vendedor/{id}")
    public void eliminar( @PathVariable("id") Long id){

    }
    //traer la informacion de 1 solo vendedor: api/vendedor/3 Get
    @GetMapping("/api/vendedor/{id}")
    public Vendedor get(@PathVariable("id")Long id){
        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setNombre("lucas");
        vendedor.setApellido("moy");
        vendedor.setEmail("lu@moy@gmail");
        vendedor.setFechaCreacion(LocalDate.now());
        return  vendedor;
    }

    @GetMapping("/api/vendedor")
    public List <Vendedor> getAll(){
        List<Vendedor> lista = new ArrayList<>();
        Vendedor vendedor = new Vendedor();
        vendedor.setId(1L);
        vendedor.setNombre("lucas");
        vendedor.setApellido("moy");
        vendedor.setEmail("lu@moy@gmail");
        vendedor.setFechaCreacion(LocalDate.now());


        Vendedor vendedor2 = new Vendedor();
        vendedor2.setId(1L);
        vendedor2.setNombre("zabrina");
        vendedor2.setApellido("riza");
        vendedor2.setEmail("riza@moy@gmail");
        vendedor2.setFechaCreacion(LocalDate.now());
        lista.add(vendedor);
        lista.add(vendedor2);

        return  lista;
    }
    //listar todos los vendedores: api/vendedor get
    //@GetMapping(name = "/api/vendedor")
    //public Vendedor getAll(){
        //return null;
    //}

}
//1.27min