package net.jar.ServerManagementConsole.Controller.auth;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.anydesk.ops.Controller.auth.DAOlogin;
import com.anydesk.ops.Controller.SessionUtils;

@ManagedBean(name = "beanUser", eager = true)
@SessionScoped
public class LoginUtil {
  
  private String username = "";
  private String password = "";
  
  public String getUsername() { return this.username; }
  public String getPassword() { return this.password; }
  
  public void setUsername(String user) { this.username = user; }
  public void setPassword(String pass) { this.password = pass; }
  
  public LoginUtil() {}
  
  public String validateUserCredentials() {
    boolean valid = DAOlogin.validateUser(username, password);
    if (valid) {
      HttpSession sess = SessionUtils.getSession();
      sess.setAttribute("username", username);
      return "servers";
    } else {
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_WARN, "Incorrect username and/or password", "..."));
      return "login";
    }
  }
  
  public String logout() {
    HttpSession session = SessionUtils.getSession();
    session.invalidate();
    return "login";
  }
}
