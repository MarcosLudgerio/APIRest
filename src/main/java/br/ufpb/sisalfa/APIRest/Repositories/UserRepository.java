package br.ufpb.sisalfa.APIRest.Repositories;

import br.ufpb.sisalfa.APIRest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
