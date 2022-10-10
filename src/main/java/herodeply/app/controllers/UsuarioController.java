package herodeply.app.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import herodeply.app.exceptions.usuarioException;
import herodeply.app.models.Usuario;
import herodeply.app.services.UsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping
    public List<Usuario> buscarTodos() throws usuarioException {
        return usuarioService.buscarTodos();
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) throws Exception {
        return usuarioService.inserir(usuario);
    }
    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) {
        return usuarioService.atualizar(usuario);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        usuarioService.delete(id);
    }
}
