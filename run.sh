#!/bin/bash
mvn clean compile
mvn exec:java -Dexec.executable="edu.bu.met.cs665.Shop" -Dlog4j.configuration="file:log4j.properties"
