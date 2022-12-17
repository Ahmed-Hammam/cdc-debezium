package com.debezium.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CusotmConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(CusotmConsumer.class);

	@KafkaListener(topics = "debezium-connector-topic.public.alarms",groupId = "1")
	public void receive(String payload) {
		LOGGER.info("received payload='{}'", payload);
	}
}
