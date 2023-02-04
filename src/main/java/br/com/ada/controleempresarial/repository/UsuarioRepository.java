package br.com.ada.controleempresarial.repository;

import br.com.ada.controleempresarial.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
