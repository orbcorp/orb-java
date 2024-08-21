package com.withorb.api.errors

class OrbIoException @JvmOverloads constructor(message: String? = null, cause: Throwable? = null) :
    OrbException(message, cause)
