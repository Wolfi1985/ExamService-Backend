package io.swagger.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import io.swagger.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query("SELECT u FROM User u where u.userName = :userName")
    User findByUserName(@Param("userName") String userName);
	
	@Query("SELECT u FROM User u where u.mkNumber = :mkNumber")
	User findByMkNumber(@Param("mkNumber") String mkNumber);

}