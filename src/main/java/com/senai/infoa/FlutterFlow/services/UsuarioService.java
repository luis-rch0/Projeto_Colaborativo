package com.senai.infoa.FlutterFlow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infoa.FlutterFlow.models.Usuario;
import com.senai.infoa.FlutterFlow.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired    
    private UsuarioRepository ur;
    public Usuario salvar(@NonNull Usuario usuario) {
        return ur.save(usuario);
    }

    public Usuario buscarPorId(@NonNull Integer id) {
        return ur.findById(id).get();
    }

    public Usuario atualizar(Usuario usuario, @NonNull Integer id) {
        Usuario u = buscarPorId(id);
        if (u != null) {
            usuario.setId(id);
            return ur.save(usuario);
        }
        return null;
    }
}

//comentario//