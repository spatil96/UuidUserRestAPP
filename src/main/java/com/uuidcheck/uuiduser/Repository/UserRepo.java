package com.uuidcheck.uuiduser.Repository;

import com.uuidcheck.uuiduser.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepo extends JpaRepository<User, UUID> {

}
