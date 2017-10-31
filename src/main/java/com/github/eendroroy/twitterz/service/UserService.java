package com.github.eendroroy.twitterz.service;


import com.github.eendroroy.twitterz.entity.User;

import java.util.List;

/**
 * @author indrajit
 */

public interface UserService {
  List<User> allUsers();

  User findUserByEmail(String email);

  User findUserByUserName(String userName);

  User saveUser(User user);

  User currentUser();

  User findUserByToken(String token);
}