#Start zookeeper
--------------------------
$ cd /path/zookeeper-3.4.9
$ ./bin/zkServer.sh start

#Start kafka server
-----------------------------------------------
Step 1: Follow the steps link below
https://kafka.apache.org/quickstart

Step 2 : Optional -> zookeeper can be started individually
./bin/zookeeper-server-start.sh ./config/zookeeper.properties

Step 3:Before starting kafka java version should be set to 8
$ cd /path/kafka_2.12-2.1.0
$ ./bin/kafka-server-start.sh ./config/server.properties

Step 4:
#create topic example commands 
——————————--------------------
$ cd /path/kafka_2.12-2.1.0
$ ./bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic topic-name

$ ./bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic es-sync-retry

$ ./bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic es-sync-dlq

$ /path/kafka_2.12-2.1.0/bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic es-sync-test

#topic list show
——————————————---
$ cd /path/kafka_2.12-2.1.0
$ ./bin/kafka-topics.sh --list --zookeeper localhost:2181

#start consumer
—————————-------
$ cd /path/kafka_2.12-2.1.0
$ ./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic es-sync --from-beginning

#Start kafdrop[java version 8 required] 
---------------------------------------------------
Description about kafdrop: Kafdrop is nothing but a monitoring tool. By using it we could see all of the topics have been created, pushed messages, total offset, etc.
  
Kafdrop link: https://github.com/HomeAdvisor/Kafdrop

Step 1: Take checkout from the above repository then build
$ cd /to/the/path/kafdrop 
$ mvn clean package

Step 2: Run the project by using the command below
$ java -jar ./target/kafdrop-2.0.6.jar --zookeeper.connect=127.0.0.1:2181

Step 3: Show the interface from browser the link below
http://localhost:9000

