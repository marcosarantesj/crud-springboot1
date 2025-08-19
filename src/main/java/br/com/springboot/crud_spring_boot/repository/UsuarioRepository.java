package br.com.springboot.crud_spring_boot.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.springboot.crud_spring_boot.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	@Query(value = "SELECT u FROM Usuario u WHERE UPPER(TRIM(u.nome)) LIKE %?1%")
	List<Usuario>buscarPorNome(String name);

}
