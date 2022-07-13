package net.jar.ServerManagementConsole.Controller.auth;

//import cmsc495.DButil;

public class DAOlogin {

  public static boolean validateUser(String user, String pass) {
    String username = user.trim();
    String password = pass.trim();
    if (username.equals("admin")) {
      if (password.equals("admin")) { return true; }
    } else if (username.equals("jroche")) {
      if (password.equals("jroche")) { return true; }
    } /*else {
      DButil dbu = new DButil();
      if (dbu.validateUser(username,password)) { return true; }
    }*/
    return false;
  }
}
