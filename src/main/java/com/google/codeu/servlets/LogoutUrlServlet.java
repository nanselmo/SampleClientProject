package com.google.codeu.servlets;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Provides access to a URL that allows a user to logout of their Google account. */
@WebServlet(name = "LogoutUrlServlet", value = "/logout-url")
public class LogoutUrlServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {

    UserService userService = UserServiceFactory.getUserService();
    String logoutUrl = userService.createLogoutURL("/index.html");

    response.setContentType("text/html");
    response.getOutputStream().println(logoutUrl);
  }
}
