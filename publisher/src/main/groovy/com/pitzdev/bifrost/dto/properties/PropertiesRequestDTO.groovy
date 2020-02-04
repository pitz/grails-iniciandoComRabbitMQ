package com.pitzdev.bifrost.dto.properties

import com.pitzdev.bifrost.properties.children.AddressDTO
import com.pitzdev.bifrost.properties.children.PricingInfoDTO

class PropertiesRequestDTO {

    Integer parkingSpaces

    Integer bathrooms

    Integer bedrooms

    AddressDTO address

    PricingInfoDTO pricingInfo
}