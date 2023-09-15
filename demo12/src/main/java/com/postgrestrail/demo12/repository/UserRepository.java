package com.postgrestrail.demo12.repository;


import com.postgrestrail.demo12.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {


}
