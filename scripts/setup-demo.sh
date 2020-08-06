#!/bin/bash

export DEMO_HOME=$( cd "$(dirname "$0")/.." ; pwd -P )

info "Creating the project"
kogito new-project appdev-aiml-demo


info "Using the project for Kogito and subscribing to Kogito"
kogito use-project appdev-aiml-demo

info "Install Strimzi Kafka Cluster"
kogito install kafka


oc get routes kogito-kafka-kafka-bootstrap -o=jsonpath='{.status.ingress[0].host}{"\n"}'

oc extract secret/kogito-kafka-cluster-ca-cert --keys=ca.crt --to=- > ca.crt

keytool -import -trustcacerts -alias root -file ca.crt -keystore truststore.jks -storepass password -noprompt