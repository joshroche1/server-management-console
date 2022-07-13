package net.jar.ServerManagementConsole.Controller;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "beanDB", eager = true)
@SessionScoped
public class DBUtil {
  
  private Connection conn = null;
  private ResultSet rs = null;
  
  
  public DBUtil() {}
  
  private Connection connect() {
    try {
      Class.forName("org.postgresql.Driver");
      String url = "jdbc:postgresql://localhost/smc";
      //Properties props = new Properties();
      //props.setProperty("user","adeso");
      //props.setProperty("password","adeso");
      //props.setProperty("ssl","false");
      conn = DriverManager.getConnection(url, "smc", "smc");
    } catch (Exception ex) {
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_WARN, ex.getMessage(), "..."));
    }
    return conn;
  }
  
  public ResultSet getServers() {
    try {
      conn = this.connect();
      PreparedStatement pstmt = conn.prepareStatement("SELECT active, hostname, provider, type, os, distro, cpuCores, memory, diskSize, publicIpAddress, fqdn, notes FROM servers", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      rs = pstmt.executeQuery();
    } catch (Exception ex) {
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_WARN, ex.getMessage(), "..."));
    }
    return rs;
  }
  /*
  public boolean insert(String sql) {
    boolean result = false;
    
    return result;
  }
  public boolean update(String sql) {
    boolean result = false;
    
    return result;
  }
  public boolean delete(String sql) {
    boolean result = false;
    
    return result;
  }
  */
}
