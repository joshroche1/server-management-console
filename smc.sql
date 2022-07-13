CREATE DATABASE smc;

CREATE USER smc WITH LOGIN PASSWORD 'smc';

GRANT ALL ON DATABASE smc TO smc;

CREATE TABLE servers (
  active boolean,
  hostname text,
  provider text,
  type text,
  os text,
  distro text,
  cpuCores integer,  
  memory real,
  diskSize real,
  publicIpAddress inet,
  fqdn text,
  notes text
);


INSERT INTO servers (active,hostname,provider,type,os,distro,cpuCores,memory,diskSize,publicIpAddress,fqdn,notes) values (  true,'hostname','Cloud or Local','VM,Desktop,Laptop,RPi','Linux or Windows','Debian,Ubuntu,CentOS,RHEL',1,8,127.5,'10.11.12.13','http://www.example.com','TEST Test test')