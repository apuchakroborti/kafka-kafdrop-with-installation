package com.javasampleapproach.kafka.services;

import com.javasampleapproach.kafka.model.SourceSyncTbale;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
    @KafkaListener(topics = "es-sync-dlq")
    public void processMessage(SourceSyncTbale sourceSyncTbale) {
        System.out.println("received content for SS= " + sourceSyncTbale);
    }
}
