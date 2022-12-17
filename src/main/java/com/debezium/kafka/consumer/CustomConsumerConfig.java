package com.debezium.kafka.consumer;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

@EnableKafka
@Configuration
public class CustomConsumerConfig {

	@Bean
    public ConsumerFactory<String, String> consumerFactory()
    {
  
        // Creating a Map of string-object pairs
        Map<String, Object> config = new HashMap<>();
  
        // Adding the Configuration
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                   "localhost:9092");
        config.put(
            ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
            StringDeserializer.class);
        config.put(
            ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
            StringDeserializer.class);
        config.put(
                ConsumerConfig.ALLOW_AUTO_CREATE_TOPICS_CONFIG,
                false);
  
        return new DefaultKafkaConsumerFactory<>(config);
    }
  
}
