package com.pitzdev.bifrost.properties

import com.pitzdev.bifrost.dto.properties.PropertiesRequestDTO
import grails.converters.JSON

class PropertiesController {

    PropertiesService propertiesService

    def save() {
        PropertiesRequestDTO propertiesRequest = new PropertiesRequestDTO(request.JSON)
        propertiesService.save(propertiesRequest)
        
        render "ok"
    }
}