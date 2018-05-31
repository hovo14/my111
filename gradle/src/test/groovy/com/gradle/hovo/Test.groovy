package com.gradle.hovo

import spock.lang.Specification

class Test extends Specification {
    def "initial printing"(){
        when: 'printing'
        println "Hovo's gradle project for scheduled polling"

        then: 'nothing special happens'
        true
    }
}
