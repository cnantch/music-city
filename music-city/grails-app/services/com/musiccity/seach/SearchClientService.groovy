package com.musiccity.seach

import static org.elasticsearch.groovy.node.GNodeBuilder.nodeBuilder
import grails.transaction.Transactional

import org.elasticsearch.groovy.client.GClient
import org.elasticsearch.groovy.node.GNode
import static org.elasticsearch.groovy.node.GNodeBuilder.nodeBuilder

@Transactional
class SearchClientService {

	
	GNode node = nodeBuilder().node();
	GClient client = node.client();

	def init() {
	}
	
	def destroy() {
		node.stop().close()
	}
	
	GClient getClient() {
		return client
	}
	
}
