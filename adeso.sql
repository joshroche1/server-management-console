--
-- PostgreSQL database dump
--

-- Dumped from database version 14.4 (Ubuntu 14.4-0ubuntu0.22.04.1)
-- Dumped by pg_dump version 14.4 (Ubuntu 14.4-0ubuntu0.22.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: test; Type: TABLE; Schema: public; Owner: adeso
--

CREATE TABLE public.test (
    machineid text,
    hostname text,
    provider text,
    datacenter text,
    type text,
    role text,
    zone text,
    country text,
    cpucores integer,
    memory real,
    active boolean,
    publicipaddress inet,
    fqdn text
);


ALTER TABLE public.test OWNER TO adeso;

--
-- Data for Name: test; Type: TABLE DATA; Schema: public; Owner: adeso
--

COPY public.test (machineid, hostname, provider, datacenter, type, role, zone, country, cpucores, memory, active, publicipaddress, fqdn) FROM stdin;
relay-eu-01 	relay-f7caffd2	Hetzner	FSN1-DC8	bare-metal	relay	eu	DE	6	62.77	t	138.201.7.158	relay-f7caffd2.net.anydesk.com
relay-eu-20	relay-bbd5e383	OVH	SBG3	bare-metal	relay	eu	FR	8	31.16	t	51.91.80.124	relay-bbd5e383.net.anydesk.com
www-download-backup	www-download-backup	Hetzner	NBG1-DC3	virtual	web	undefined	DE	4	7.58	t	159.69.19.197	159.69.19.197
bi-collector	bi-collector	Hetzner	FSN1-DC14	bare-metal	other	undefined	DE	8	125.61	t	195.201.240.26	195.201.240.26
control-aux-02	control-aux-02	Hetzner	NBG1-DC5	bare-metal	control	undefined	DE	32	251.38	t	49.12.166.30	49.12.166.30
control-xeon	control	Hetzner	NBG1-DC3	bare-metal	control	undefined	DE	32	754.55	t	116.202.62.18	116.202.62.18
control-db-xeon	control-db	Hetzner	NBG1-DC3	bare-metal	db	undefined	DE	32	503.29	t	116.202.62.20	116.202.62.20
dist-tm-db-01	dist-tm-db-01	Hetzner	NBG1-DC3	bare-metal	db	undefined	DE	32	251.53	t	116.202.60.144	116.202.60.144
\.


--
-- PostgreSQL database dump complete
--

