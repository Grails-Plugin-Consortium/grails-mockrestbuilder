package org.grails.demo

import grails.plugins.rest.client.RestBuilder
import spock.lang.Specification

class BaseRestBuilderSpec extends Specification {

	def setup() {
		RestBuilder.metaClass.constructor = { ->
			return new MockRestBuilder()
		}
	}
}
