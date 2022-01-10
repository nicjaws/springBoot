package com.curso.java.curso.controllers;

import com.curso.java.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNombre("Nicolas");
        usuario.setApellido("Corbalan");
        usuario.setEmail("nicolas@example.com");
        usuario.setPassword("cualquiera");
        usuario.setTelefono("666666666");
        return usuario;
    }

    @RequestMapping(value = "usuario453")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Nicolas");
        usuario.setApellido("Corbalan");
        usuario.setEmail("nicolas@example.com");
        usuario.setPassword("cualquiera");
        usuario.setTelefono("666666666");
        return usuario;
    }

    @RequestMapping(value = "usuario78987")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Nicolas");
        usuario.setApellido("Corbalan");
        usuario.setEmail("nicolas@example.com");
        usuario.setPassword("cualquiera");
        usuario.setTelefono("666666666");
        return usuario;
    }

    @RequestMapping(value = "usuario89656")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Nicolas");
        usuario.setApellido("Corbalan");
        usuario.setEmail("nicolas@example.com");
        usuario.setPassword("cualquiera");
        usuario.setTelefono("666666666");
        return usuario;
    }
}
