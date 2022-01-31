package herodeply.app.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import herodeply.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    
}
