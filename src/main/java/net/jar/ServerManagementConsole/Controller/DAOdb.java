package net.jar.ServerManagementConsole.Controller;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import net.jar.ServerManagementConsole.Controller.DBUtil;

@ManagedBean(name = "beanDAOdb", eager = true)
@SessionScoped
public class DAOdb {
  private DBUtil dbInstance = null;
  private ResultSet rs = null;
  
  private String machineId;
  private String hostname;
  private String provider;
  private String dataCenter; 
  private String type;
  private String role;
  private boolean active;
  private String publicIpAddress;
  private String fqdn;
  
  
  public DAOdb() {}
  
  public ResultSet getServersOverview() {
    try {
      dbInstance = new DBUtil();
      rs = dbInstance.getServers();
    } catch (Exception ex) {
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_WARN, ex.getMessage(), "..."));
    }
    return rs;
  }
  
  public void setMachineId(String tmp) { this.machineId = tmp; }
  public void setHostname(String tmp) { this.hostname = tmp; }
  public void setProvider(String tmp) { this.provider = tmp; }
  public void setDataCenter(String tmp) { this.dataCenter = tmp; }
  public void setType(String tmp) { this.type = tmp; }
  public void setRole(String tmp) { this.role = tmp; }
  public void setActive(boolean tmp) { this.active = tmp; }
  public void setPublicIpAddress(String tmp) { this.publicIpAddress = tmp; }
  
  public String getMachineId() { return this.machineId; }
  public String getHostname() { return this.hostname; }
  public String getProvider() { return this.provider; }
  public String getDataCenter() { return this.dataCenter; }
  public String getType() { return this.type; }
  public String getRole() { return this.role; }
  public boolean getActive() { return this.active; }
  public String getPublicIpAddress() { return this.publicIpAddress; }
}
