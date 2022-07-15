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
  
  private String hostname;
  
  
  public DBUtil() {}
  
  public void setHostname(String tmp) { this.hostname = tmp; }
  public String getHostname() { return this.hostname; }
  
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
  
  public ResultSet getServer() {
    try {
      conn = this.connect();
      PreparedStatement pstmt = conn.prepareStatement("SELECT active, hostname, provider, type, os, distro, cpuCores, memory, diskSize, publicIpAddress, fqdn, notes FROM servers WHERE hostname = ?", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      pstmt.setString(1,hostname);
      rs = pstmt.executeQuery();
    } catch (Exception ex) {
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_WARN, ex.getMessage(), "..."));
    }
    return rs;
  }
  
  public boolean addServer(boolean active, String hostname, String provider, String type, String os, String distro, int cpuCores, double memory, double diskSize, String publicIpAddress, String fqdn, String notes) {
    boolean result = false;
    try {
      conn = this.connect();
      PreparedStatement pstmt = conn.prepareStatement("INSERT INTO servers (active,hostname,provider,type,os,distro,cpucores,memory,disksize,publicipaddress,fqdn,notes) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      pstmt.setBoolean(1,active);
      pstmt.setString(2,hostname);
      pstmt.setString(3,provider);
      pstmt.setString(4,type);
      pstmt.setString(5,os);
      pstmt.setString(6,distro);
      pstmt.setInt(7,cpuCores);
      pstmt.setDouble(8,memory);
      pstmt.setDouble(9,diskSize);
      pstmt.setString(10,publicIpAddress);
      pstmt.setString(11,fqdn);
      pstmt.setString(12,notes);
      if (pstmt.execute()) { result = true; }
    } catch (Exception ex) {
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_WARN, ex.getMessage(), "..."));
    }
    return result;
  }
  /*
  public boolean update(String sql) {
    boolean result = false;
    
    return result;
  }
  */
  public boolean deleteServer(String hostname) {
    boolean result = false;
    try {
      conn = this.connect();
      PreparedStatement pstmt = conn.prepareStatement("DELETE FROM servers WHERE hostname = ?", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      pstmt.setString(1,hostname);
      if (pstmt.execute()) { result = true; }
    } catch (Exception ex) {
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_WARN, ex.getMessage(), "..."));
    }
    return result;
  }
}
