package net.jar.ServerManagementConsole.Model;


import java.util.Date;


public class ServerModel {
  
  private String machineId;
  private String hostname;   // ex. bi-collector
  private String provider;   // ex. Hetzner
  private String dataCenter;   // ex. FSN1-DC14
  private String type;   // ex. bare-metal Desktop
  private String role;   // ex. relay, control, web, other
  private boolean active;
  private String publicIpAddress;
  private String fqdn;
  private String systemConsole;   // ?
  private String systemOS;   // ex. windows, linux, macos, unix
  private String systemDistro;   // ex. Debian GNU/Linux 10 (buster)
  private String systemKernel;   // ex. 4.19.0-18-amd64 x86_64
  private String systemCompiler;   // ex. gcc
  private String systemV;   // ? 8.3.0
  
  private String country;   // ex. DE
  private String city;   // ex. Falkenstein
  private String zone;   // ex. EU
  
  private int cpuCores;   // ex. 8
  private String cpuModel;   // ex. Intel Xeon W-2145
  private String cpuSpeed;   // ex. 1200/4500 MHz
  private double cpuL1cache;   // 512 KiB
  private double cpuL2cache;   // 11.0 MiB
  private double cpuL3cache;   // 11.0 MiB
  private String cpuArch;   // ex. Skylake
  private int cpuInsSize;   // 32 or 64 bit
  private int cpuBogomips;   // ex. 118400
  private String cpuRev;   // ex. 4
  private String cpuType;   // ex. MT MCP
  private String[] cpuFlags;   /* ex.
  3dnowprefetch abm acpi adx aes aperfmperf apic arat arch_perfmon art avx avx2 avx512bw avx512cd avx512dq avx512f avx512vl bmi1 bmi2 bts cat_l3 cdp_l3 clflush clflushopt clwb cmov constant_tsc cpuid cpuid_fault cqm cqm_llc cqm_mbm_local cqm_mbm_total cqm_occup_llc cx16 cx8 dca de ds_cpl dtes64 dtherm dts epb ept ept_ad erms est f16c flexpriority flush_l1d fma fpu fsgsbase fxsr hle ht hwp hwp_act_window hwp_epp hwp_pkg_req ibpb ibrs ida intel_ppin intel_pt invpcid invpcid_single lahf_lm lm mba mca mce md_clear mmx monitor movbe mpx msr mtrr nonstop_tsc nopl nx pae pat pbe pcid pclmulqdq pdcm pdpe1gb pebs pge pln pni popcnt pse pse36 pti pts rdrand rdseed rdt_a rdtscp rep_good rtm sdbg sep smap smep smx ss ssbd sse sse2 sse4_1 sse4_2 ssse3 stibp syscall tm tm2 tpr_shadow tsc tsc_adjust tsc_deadline_timer vme vmx vnmi vpid x2apic xgetbv1 xsave xsavec xsaveopt xsaves xtopology xtpr
  */
  
  private String[] memoryInfo;
  private double memoryTotal;   // ex. 125.6 GiB
  private double memorySize;   // ex. 32 GiB
  private String memoryECC;   // ex. Single-bit ECC
  private String memoryManufacturer;   // ex. Micron
  private String memoryPartNo;   // ex. 36ASF4G72PZ-2G6E1
  private String memorySpeed;   // ex. 2666 MT/s
  private String memoryType;   // DDR4
  
  private String[] disks;
  private String diskId;   // ex. /dev/sda
  private double diskSize;   // ex. 238.47 GiB
  private String diskModel;   // ex. 36ASF4G72PZ-2G6E1
  private String diskSerial;   // ex. PHLA813201T0256CGN
  private double diskSpeed;   // ex. 6.0 Gbps
  private String diskVendor;   // ex. Intel
  private int diskLanes;   // ex. 4 (nvme)
  
  private String[] raidArray;
  private String raidDevice;   // ex. md4
  private String raidOnline;
  private String raidStatus;   // ex. active
  private String raidType;   // ex. mdraid
  private int raidBlocks;   // ex. 3750481920
  private int raidChunkSize;   // ex. 512 Kb
  private String raidRaid;   // ex. raid-0 mirror
  private double raidSuperBlocks;   // ex. 1.2
  
  private String networkDevice;   // ex. Intel 82599ES 10-Gigabit SFI/SFP+ Network
  private String networkBusId;   // ex. 17:00.0
  private String networkChipId;   // ex. 8086:10fb
  private String networkDriver;   // ex. ixgbe
  private String networkPort;   // ? 7000
  private String networkV;   // ? 5.1.0-k
  private String[] networkInterfaces;
  private String networkInterface;   // ex. ens192
  private String netIntDuplex;   // ex. full duplex
  private String netIntMacAddr;
  private int netIntSpeed;   // ex. 10000 Mbps
  private boolean netIntStateUp;   // ex. true = up
  private String netIntIpAddr;   // ex. 192.168.2.1
  private String netIntIpBroadcast;   // ex. 192.168.2.255
  private String netIntIpv6Addr;   // ex. 2104::01
  private String netIntIpv6Scope;   // ex. global, link
    
  private String graphicsDevice;   // ex. ASPEED Graphics Family
  private String graphicsBusId;   // ex. 03:00.0
  private String graphicsChipId;   // ex. 1a03.2000
  private String graphicsDriver;
  
  private double sensorCpuTemp;   // ex. 50.0 C
  private double sensorMoboTemp;
  private double cpuFanSpeed;
  private String machineMobo;   // ex. ASUSTeK
  private String machineType;   // ex. Desktop
  private String machineUEFI;   // ex. American Megatrends
  private String machineBIOS;
  private Date machineDate; 
  private String machineModel;   // ex. WS C422 DC
  private String machineSerial;   // ex. 181242084000214
  private String machineV;   // ? 0403
  
  
  public ServerModel() {}
  
  public void setMachineId(String tmp) { this.machineId = tmp; }
  public void setHostname(String tmp) { this.hostname = tmp; }
  public void setProvider(String tmp) { this.provider = tmp; }
  public void setDataCenter(String tmp) { this.dataCenter = tmp; }
  public void setType(String tmp) { this.type = tmp; }
  public void setRole(String tmp) { this.role = tmp; }
  public void setActive(boolean tmp) { this.active = tmp; }
  public void setPublicIpAddress(String tmp) { this.publicIpAddress = tmp; }
  public void setSystemConsole(String tmp) { this.systemConsole = tmp; }
  public void setSystemOS(String tmp) { this.systemOS = tmp; }
  public void setSystemDistro(String tmp) { this.systemDistro = tmp; }
  public void setSystemKernel(String tmp) { this.systemKernel = tmp; }
  public void setSystemCompiler(String tmp) { this.systemCompiler = tmp; }
  public void setSystemV(String tmp) { this.systemV = tmp; }
  public void setCountry(String tmp) { this.country = tmp; }
  public void setCity(String tmp) { this.city = tmp; }
  public void setZone(String tmp) { this.zone = tmp; }
  public void setCpuCores(int tmp) { this.cpuCores = tmp; }
  public void setCpuModel(String tmp) { this.cpuModel = tmp; }
  public void setCpuSpeed(String tmp) { this.cpuSpeed = tmp; }
  public void setCpuL1cache(double tmp) { this.cpuL1cache = tmp; }
  public void setCpuL2cache(double tmp) { this.cpuL2cache = tmp; }
  public void setCpuL3cache(double tmp) { this.cpuL3cache = tmp; }
  public void setCpuArch(String tmp) { this.cpuArch = tmp; }
  public void setCpuInsSize(int tmp) { this.cpuInsSize = tmp; }
  public void setCpuBogomips(int tmp) { this.cpuBogomips = tmp; }
  public void setCpuRev(String tmp) { this.cpuRev = tmp; }
  public void setCpuType(String tmp) { this.cpuType = tmp; }
  public void setCpuFlags(String[] tmp) { this.cpuFlags = tmp; }
  public void setMemoryInfo(String[] tmp) { this.memoryInfo = tmp; }
  public void setMemoryTotal(double tmp) { this.memoryTotal = tmp; }
  public void setMemorySize(double tmp) { this.memorySize = tmp; }
  public void setMemoryECC(String tmp) { this.memoryECC = tmp; }
  public void setMemoryManufacturer(String tmp) { this.memoryManufacturer = tmp; }
  public void setMemoryPartNo(String tmp) { this.memoryPartNo = tmp; }
  public void setMemorySpeed(String tmp) { this.memorySpeed = tmp; }
  public void setMemoryType(String tmp) { this.memoryType = tmp; }
  public void setDisks(String[] tmp) { this.disks = tmp; }
  public void setDiskId(String tmp) { this.diskId = tmp; }
  public void setDiskSize(double tmp) { this.diskSize = tmp; }
  public void setDiskModel(String tmp) { this.diskModel = tmp; }
  public void setDiskSerial(String tmp) { this.diskSerial = tmp; }
  public void setDiskSpeed(double tmp) { this.diskSpeed = tmp; }
  public void setDiskVendor(String tmp) { this.diskVendor = tmp; }
  public void setDiskLanes(int tmp) { this.diskLanes = tmp; }
  public void setRaidArray(String[] tmp) { this.raidArray = tmp; }
  public void setRaidDevice(String tmp) { this.raidDevice = tmp; }
  public void setRaidOnline(String tmp) { this.raidOnline = tmp; }
  public void setRaidStatus(String tmp) { this.raidStatus = tmp; }
  public void setRaidType(String tmp) { this.raidType = tmp; }
  public void setRaidBlocks(int tmp) { this.raidBlocks = tmp; }
  public void setRaidChunkSize(int tmp) { this.raidChunkSize = tmp; }
  public void setRaidRaid(String tmp) { this.raidRaid = tmp; }
  public void setRaidSuperBlocks(double tmp) { this.raidSuperBlocks = tmp; }
  public void setNetworkDevice(String tmp) { this.networkDevice = tmp; }
  public void setNetworkBusId(String tmp) { this.networkBusId = tmp; }
  public void setNetworkChipId(String tmp) { this.networkChipId = tmp; }
  public void setNetworkDriver(String tmp) { this.networkDriver = tmp; }
  public void setNetworkPort(String tmp) { this.networkPort = tmp; }
  public void setNetworkV(String tmp) { this.networkV = tmp; }
  public void setNetworkInterfaces(String[] tmp) { this.networkInterfaces = tmp; }
  public void setNetworkInterface(String tmp) { this.networkInterface = tmp; }
  public void setNetIntDuplex(String tmp) { this.netIntDuplex = tmp; }
  public void setNetIntMacAddr(String tmp) { this.netIntMacAddr = tmp; }
  public void setNetIntSpeed(int tmp) { this.netIntSpeed = tmp; }
  public void setNetIntStateUp(boolean tmp) { this.netIntStateUp = tmp; }
  public void setNetIntIpAddr(String tmp) { this.netIntIpAddr = tmp; }
  public void setNetIntIpBroadcast(String tmp) { this.netIntIpBroadcast = tmp; }
  public void setNetIntIpv6Addr(String tmp) { this.netIntIpv6Addr = tmp; }
  public void setNetIntIpv6Scope(String tmp) { this.netIntIpv6Scope = tmp; }
  public void setGraphicsDevice(String tmp) { this.graphicsDevice = tmp; }
  public void setGraphicsBusId(String tmp) { this.graphicsBusId = tmp; }
  public void setGraphicsChipId(String tmp) { this.graphicsChipId = tmp; }
  public void setGraphicsDriver(String tmp) { this.graphicsDriver = tmp; }
  public void setSensorCpuTemp(double tmp) { this.sensorCpuTemp = tmp; }
  public void setSensorMoboTemp(double tmp) { this.sensorMoboTemp = tmp; }
  public void setCpuFanSpeed(double tmp) { this.cpuFanSpeed = tmp; }
  public void setMachineMobo(String tmp) { this.machineMobo = tmp; }
  public void setMachineType(String tmp) { this.machineType = tmp; }
  public void setMachineUEFI(String tmp) { this.machineUEFI = tmp; }
  public void setMachineBIOS(String tmp) { this.machineBIOS = tmp; }
  public void setMachineDate(Date tmp) { this.machineDate = tmp; }
  public void setMachineModel(String tmp) { this.machineModel = tmp; }
  public void setMachineSerial(String tmp) { this.machineSerial = tmp; }
  public void setMachineV(String tmp) { this.machineV = tmp; }
  
  public String getMachineId() { return this.machineId; }
  public String getHostname() { return this.hostname; }
  public String getProvider() { return this.provider; }
  public String getDataCenter() { return this.dataCenter; }
  public String getType() { return this.type; }
  public String getRole() { return this.role; }
  public boolean getActive() { return this.active; }
  public String getPublicIpAddress() { return this.publicIpAddress; }
  public String getSystemConsole() { return this.systemConsole; }
  public String getSystemOS() { return this.systemOS; }
  public String getSystemDistro() { return this.systemDistro; }
  public String getSystemKernel() { return this.systemKernel; }
  public String getSystemCompiler() { return this.systemCompiler; }
  public String getSystemV() { return this.systemV; }
  public String getCountry() { return this.country; }
  public String getCity() { return this.city; }
  public String getZone() { return this.zone; }
  public int getCpuCores() { return this.cpuCores; }
  public String getCpuModel() { return this.cpuModel; }
  public String getCpuSpeed() { return this.cpuSpeed; }
  public double getCpuL1cache() { return this.cpuL1cache; }
  public double getCpuL2cache() { return this.cpuL2cache; }
  public double getCpuL3cache() { return this.cpuL3cache; }
  public String getCpuArch() { return this.cpuArch; }
  public int getCpuInsSize() { return this.cpuInsSize; }
  public int getCpuBogomips() { return this.cpuBogomips; }
  public String getCpuRev() { return this.cpuRev; }
  public String getCpuType() { return this.cpuType; }
  public String[] getCpuFlags() { return this.cpuFlags; }
  public String[] getMemoryInfo() { return this.memoryInfo; }
  public double getMemoryTotal() { return this.memoryTotal; }
  public double getMemorySize() { return this.memorySize; }
  public String getMemoryECC() { return this.memoryECC; }
  public String getMemoryManufacturer() { return this.memoryManufacturer; }
  public String getMemoryPartNo() { return this.memoryPartNo; }
  public String getMemorySpeed() { return this.memorySpeed; }
  public String getMemoryType() { return this.memoryType; }
  public String[] getDisks() { return this.disks; }
  public String getDiskId() { return this.diskId; }
  public double getDiskSize() { return this.diskSize; }
  public String getDiskModel() { return this.diskModel; }
  public String getDiskSerial() { return this.diskSerial; }
  public double getDiskSpeed() { return this.diskSpeed; }
  public String getDiskVendor() { return this.diskVendor; }
  public int getDiskLanes() { return this.diskLanes; }
  public String[] getRaidArray() { return this.raidArray; }
  public String getRaidDevice() { return this.raidDevice; }
  public String getRaidOnline() { return this.raidOnline; }
  public String getRaidStatus() { return this.raidStatus; }
  public String getRaidType() { return this.raidType; }
  public int getRaidBlocks() { return this.raidBlocks; }
  public int getRaidChunkSize() { return this.raidChunkSize; }
  public String getRaidRaid() { return this.raidRaid; }
  public double getRaidSuperBlocks() { return this.raidSuperBlocks; }
  public String getNetworkDevice() { return this.networkDevice; }
  public String getNetworkBusId() { return this.networkBusId; }
  public String getNetworkChipId() { return this.networkChipId; }
  public String getNetworkDriver() { return this.networkDriver; }
  public String getNetworkPort() { return this.networkPort; }
  public String getNetworkV() { return this.networkV; }
  public String[] getNetworkInterfaces()  { return this.networkInterfaces; }
  public String getNetworkInterface() { return this.networkInterface; }
  public String getNetIntDuplex() { return this.netIntDuplex; }
  public String getNetIntMacAddr() { return this.netIntMacAddr; }
  public int getNetIntSpeed() { return this.netIntSpeed; }
  public boolean getNetIntStateUp() { return this.netIntStateUp; }
  public String getNetIntIpAddr() { return this.netIntIpAddr; }
  public String getNetIntIpBroadcast() { return this.netIntIpBroadcast; }
  public String getNetIntIpv6Addr() { return this.netIntIpv6Addr; }
  public String getNetIntIpv6Scope() { return this.netIntIpv6Scope; }
  public String getGraphicsDevice() { return this.graphicsDevice; }
  public String getGraphicsBusId() { return this.graphicsBusId; }
  public String getGraphicsChipId() { return this.graphicsChipId; }
  public String getGraphicsDriver() { return this.graphicsDriver; }
  public double getSensorCpuTemp() { return this.sensorCpuTemp; }
  public double getSensorMoboTemp() { return this.sensorMoboTemp; }
  public double getCpuFanSpeed() { return this.cpuFanSpeed; }
  public String getMachineMobo() { return this.machineMobo; }
  public String getMachineType() { return this.machineType; }
  public String getMachineUEFI() { return this.machineUEFI; }
  public String getMachineBIOS() { return this.machineBIOS; }
  public Date getMachineDate() { return this.machineDate; }
  public String getMachineModel() { return this.machineModel; }
  public String getMachineSerial() { return this.machineSerial; }
  public String getMachineV() { return this.machineV; }
}
