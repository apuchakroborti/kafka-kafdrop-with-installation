package com.javasampleapproach.kafka;

import com.javasampleapproach.kafka.model.SourceSyncTbale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javasampleapproach.kafka.services.KafkaProducer;


@SpringBootApplication
public class SpringKafkaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

    @Autowired
    KafkaProducer producer;



    @Override
	public void run(String... arg0) throws Exception {
		//for Source sync test
        for(int i=0;i<10;i++){
            //send siurce sync table
            SourceSyncTbale sourceSyncTbale=new SourceSyncTbale(i+10,"EV_BLACK_LIST","id");
            producer.send(sourceSyncTbale);

        }
	}
}
