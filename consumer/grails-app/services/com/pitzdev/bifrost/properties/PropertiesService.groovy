package com.pitzdev.bifrost.properties

import com.pitzdev.bifrost.dto.properties.PropertiesRequestDTO
import com.pitzdev.bifrost.messagemanager.MessageManager

import grails.core.GrailsApplication
import grails.gorm.transactions.Transactional

@Transactional
class PropertiesService {

    public void save(PropertiesRequestDTO propertiesRequest) {
        // save & blá-blá-blá

        MessageManager.consume("properties")
    }
}