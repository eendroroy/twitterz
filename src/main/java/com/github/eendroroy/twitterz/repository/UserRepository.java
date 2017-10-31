package com.github.eendroroy.twitterz.repository;

import com.github.eendroroy.twitterz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author indrajit
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
  List<User> findAll();

  User findByEmail(String email);

  User findByUserName(String userName);

  User findByAccessToken(String accessToken);
}