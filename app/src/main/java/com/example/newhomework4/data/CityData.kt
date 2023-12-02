package com.example.newhomework4.data


import com.example.newhomework4.constants.BERLIN
import com.example.newhomework4.constants.BERLIN_DESCRIPTION
import com.example.newhomework4.constants.BERLIN_IMAGE_RES
import com.example.newhomework4.constants.LONDON
import com.example.newhomework4.constants.LONDON_DESCRIPTION
import com.example.newhomework4.constants.LONDON_IMAGE_RES
import com.example.newhomework4.constants.MADRID
import com.example.newhomework4.constants.MADRID_DESCRIPTION
import com.example.newhomework4.constants.MADRID_IMAGE_RES
import com.example.newhomework4.constants.WASHINGTON
import com.example.newhomework4.constants.WASHINGTON_DESCRIPTION
import com.example.newhomework4.constants.WASHINGTON_IMAGE_RES
import com.example.newhomework4.constants.YEREVAN
import com.example.newhomework4.constants.YEREVAN_DESCRIPTION
import com.example.newhomework4.constants.YEREVAN_IMAGE_RES


val cityImageMap = mapOf(
    YEREVAN to YEREVAN_IMAGE_RES,
    WASHINGTON to WASHINGTON_IMAGE_RES,
    MADRID to MADRID_IMAGE_RES,
    LONDON to LONDON_IMAGE_RES,
    BERLIN to BERLIN_IMAGE_RES,

    // Add more city-image mappings as needed
)

val cityDescriptionMap = mapOf(
    YEREVAN to YEREVAN_DESCRIPTION,
    WASHINGTON to WASHINGTON_DESCRIPTION,
    MADRID to MADRID_DESCRIPTION,
    LONDON to LONDON_DESCRIPTION,
    BERLIN to BERLIN_DESCRIPTION,
    // Add more city-image mappings as needed

)

val cities = listOf(
    YEREVAN,
    WASHINGTON,
    MADRID,
    LONDON,
    BERLIN,
)
    // Add more cities here
