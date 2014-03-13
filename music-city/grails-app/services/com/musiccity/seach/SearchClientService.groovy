package com.musiccity.seach

import static org.elasticsearch.groovy.node.GNodeBuilder.nodeBuilder
import grails.transaction.Transactional
import io.searchbox.client.JestClient
import io.searchbox.client.JestClientFactory
import io.searchbox.client.config.ClientConfig
import io.searchbox.client.config.HttpClientConfig

@Transactional
class SearchClientService {

	
	JestClient client = null;
    def init() {
		// Configuration
		ClientConfig clientConfig = new HttpClientConfig.Builder("http://localhost:9200").multiThreaded(true).build();

		// Construct a new Jest client according to configuration via factory
		JestClientFactory factory = new JestClientFactory();
		factory.setHttpClientConfig(clientConfig);
		client = factory.getObject();
    }
	def destroy() {
		client.close();
	}
	JestClient getClient() {
		return client;
	}
	
}
