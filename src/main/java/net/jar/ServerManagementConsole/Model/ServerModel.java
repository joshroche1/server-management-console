package net.jar.ServerManagementConsole.Model;


import java.util.Date;


public class ServerModel {
  
  private String hostname;   // ex. bi-collector
  private String provider;   // ex. Hetzner
  private String type;   // ex. bare-metal Desktop
  private String os;
  private String distro;
  private boolean active;
  private String publicIpAddress;
  private String fqdn;
  private int cpuCores;   // ex. 8
  private double memory;   // ex. 125.6 GiB
  private double diskSize;
  private String notes;

  
  public ServerModel() {}
  
  public void setHostname(String tmp) { this.hostname = tmp; }
  public void setProvider(String tmp) { this.provider = tmp; }
  public void setType(String tmp) { this.type = tmp; }
  public void setActive(boolean tmp) { this.active = tmp; }
  public void setPublicIpAddress(String tmp) { this.publicIpAddress = tmp; }
  public void setOs(String tmp) { this.os = tmp; }
  public void setDistro(String tmp) { this.distro = tmp; }
  public void setCpuCores(int tmp) { this.cpuCores = tmp; }
  public void setMemory(double tmp) { this.memory = tmp; }
  public void setDiskSize(double tmp) { this.diskSize = tmp; }
  public void setNotes(String tmp) { this.notes = tmp; }
  public void setFqdn(String tmp) { this.fqdn = tmp; }
  
  public String getHostname() { return this.hostname; }
  public String getProvider() { return this.provider; }
  public String getType() { return this.type; }
  public boolean getActive() { return this.active; }
  public String getPublicIpAddress() { return this.publicIpAddress; }
  public String getOs() { return this.os; }
  public String getDistro() { return this.distro; }
  public int getCpuCores() { return this.cpuCores; }
  public double getMemory() { return this.memory; }
  public double getDiskSize() { return this.diskSize; }
  public String getNotes() { return this.notes; }
  public String getFqdn() { return this.fqdn; }
}
