package net.oolarr.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.oolarr.springboot.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
