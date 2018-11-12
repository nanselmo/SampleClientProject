package com.google.codeu.servlets;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Renders a link to login to Google. */
@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {

    UserService userService = UserServiceFactory.getUserService();
    String loginUrl = userService.createLoginURL("/profile.html?user=me");
    String html = "Click <a href=\"" + loginUrl + "\">here</a> to login.";
    
    response.setContentType("text/html");
    response.getOutputStream().println(html);
  }
}
