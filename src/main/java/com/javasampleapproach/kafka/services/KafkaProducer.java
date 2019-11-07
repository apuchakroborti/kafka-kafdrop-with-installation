package com.javasampleapproach.kafka.services;

import com.javasampleapproach.kafka.model.SourceSyncTbale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
	private KafkaTemplate<String, SourceSyncTbale> kafkaTemplate;

	@Value("${jsa.kafka.topic.dlq}")
    String kafkaTopicDlq;

	public void send(SourceSyncTbale sourceSyncTbale) {
		System.out.println("sending data to topic:"+kafkaTopicDlq+":"+ sourceSyncTbale);
		kafkaTemplate.send(kafkaTopicDlq, sourceSyncTbale);
	}
}
