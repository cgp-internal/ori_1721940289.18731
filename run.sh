#!/bin/bash

# Install Maven
apt-get update -y
apt-get install maven -y

# Build project
mvn clean package

# Run on port 5000
java -jar target/*jar -Dserver.port=5000