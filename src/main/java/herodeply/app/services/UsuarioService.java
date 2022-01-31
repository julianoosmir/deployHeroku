package herodeply.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import herodeply.app.models.Usuario;
import herodeply.app.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario inserir(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }
    public Usuario atualizar(Usuario usuario) {
        Optional<Usuario> UsuarioDB = usuarioRepository.findById(usuario.getId());
        UsuarioDB.ifPresent(u -> usuario.setId(u.getId()));
        return usuarioRepository.save(usuario);
    }
    public void delete(Integer usuario){
        usuarioRepository.deleteById(usuario);
    }



}
