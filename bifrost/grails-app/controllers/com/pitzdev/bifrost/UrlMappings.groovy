package com.pitzdev.bifrost

class UrlMappings {

    static mappings = {

        "/properties" {
            controller = "properties"
            action = [POST:"save"]
            format = "json"
        }
    }
}
