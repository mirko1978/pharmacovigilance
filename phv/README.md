# Pharmacovigilance Development documentation

This stes of documents are tutorial related how to configure the development environment and servers.

## Table of contents

*	[Weblogic installation and configuration](src/site/markdown/weblogic.md)
*	[Eclipse](src/site/markdown/eclipse.md)
*	[HA Testing](src/site/markdown/ha_testing.md)
*	[Database and JPA](src/site/markdown/database.md)


# Pharmacovigilance Introduction

Pharmacovigilance "Poller & Parser" technology refresh in Java 7.


The technology stack used is:

*    J2EE 6 application server (Weblogic 12c)
*    JMS queue
*    Camel
*    Spring framework
*    Drools
*    Persistence layer done with JTA (XA), JPA fully managed by Weblogic 12c 

## Package naming convention

The packaging start with `eu.europa.ema.phv` followed by the components name or by `common`.  
The `common` package contains the common library used between the different components (e.g. data persistence)

## Build instructions

This project uses Maven then in order to produce the war:

    mvn package
    
In order to create the documentation

    mvn site
