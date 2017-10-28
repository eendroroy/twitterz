package com.github.eendroroy.twitterz.service.impl;

import com.github.eendroroy.twitterz.entity.User;
import com.github.eendroroy.twitterz.repository.UserRepository;
import com.github.eendroroy.twitterz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author indrajit
 */

@SuppressWarnings({
    "PMD.TooManyMethods",
    "PMD.AvoidDuplicateLiterals",
    "PMD.ShortVariable",
    "PMD.LongVariable",
    "PMD.ShortClassName",
})
@Service("userService")
public class UserServiceImpl implements UserService {

  @Qualifier("userRepository")
  @Autowired
  private transient UserRepository userRepository;

  @Autowired
  private transient BCryptPasswordEncoder bCryptPasswordEncoder;

  @Override
  public List<User> allUsers() {
    return userRepository.findAll();
  }

  @Override
  public User findUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  @Override
  public User findUserByUserName(String userName) {
    return userRepository.findByUserName(userName);
  }

  @Override
  public void saveUser(User user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    user.setEnabled(1);
    userRepository.save(user);
  }

  @Override
  public User currentUser() {
    // TODO: implement
    return null;
  }
}