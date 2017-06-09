#!/bin/sh

set -x

SERVICE_NAME=dubbo-demo-provider
PROJECT_DIR=$(cd "$(dirname "$0")"; pwd)
PROJECT_DIR=$PROJECT_DIR/..
CONFIG_DIR=$PROJECT_DIR/config
LIB_DIR=$PROJECT_DIR/lib
LIB_JARS=`ls $LIB_DIR | grep .jar | awk '{print "'$LIB_DIR'/"$0}' | tr "\n" ":"`
MAIN_CLASS="com.example.dubbox.ProviderBootstrap"

JAVA_OPTS="$JAVA_OPTS -Ddubbo.registry.address=${ZK_ADDRESS} -Ddubbo.protocol.host=${HOSTNAME} -Ddubbo.protocol.port=${EXPORT_PORT}"


mkdir -p  /logs/$SERVICE_NAME/

#nohup java  -classpath $CONFIG_DIR:$LIB_JARS $JAVA_OPTS $MAIN_CLASS >> /logs/$SERVICE_NAME/std-out.log 2>&1 &
java  -classpath $CONFIG_DIR:$LIB_JARS $JAVA_OPTS $MAIN_CLASS

