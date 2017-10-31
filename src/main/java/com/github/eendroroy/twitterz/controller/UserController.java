package com.github.eendroroy.twitterz.controller;

import com.github.eendroroy.twitterz.entity.User;
import com.github.eendroroy.twitterz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author indrajit
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {
  @Autowired
  transient private UserService userService;

  @RequestMapping(path = "register", method = RequestMethod.POST)
  @ResponseBody
  public long register(
    HttpServletRequest request, HttpServletResponse response
  ) {
    String userName = request.getParameter("userName");
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    User user = new User();
    user.setEmail(email);
    user.setFullName(userName);
    user.setPassword(password);

    return userService.saveUser(user).getId();
  }
}
