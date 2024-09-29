package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface ILoginRepository extends JpaRepository<User, String> {

	@Query("SELECT u FROM User u WHERE u.userName = :username AND u.password = :password")
    User validateLogin(@Param("username") String username, @Param("password") String password);
}
