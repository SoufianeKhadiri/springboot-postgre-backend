package dev.skha.springbootpostgresql.models;

import java.util.List;

import dev.skha.springbootpostgresql.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findBySize(int size);
    List<User> findByNameAndPassword(String name, String password);
}
