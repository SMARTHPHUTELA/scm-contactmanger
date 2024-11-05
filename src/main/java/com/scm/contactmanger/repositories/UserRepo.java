package com.scm.contactmanger.repositories;

// import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.contactmanger.entity.user;

@Repository
public interface UserRepo extends JpaRepository<user,String> { 
    public user findUserByEmail(String email);

}
