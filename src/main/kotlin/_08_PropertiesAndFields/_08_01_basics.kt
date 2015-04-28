package _08_PropertiesAndFields

import javax.inject.Inject

public class Address {
    public var name: String = "Madafak";
    public var street: String = "5th"
    public var city: String = "Los Angeles"

    public val state: String = "California"
    public val zip: String = "44-555"
    var initialized = 1
//    public val ready = 1

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value)
        }

    fun setDataFromString(value: String) {

    }

    var setterVisibility: String = "abc"
        private set

    var setterWithAnnotation: Any? = null
        [Inject] set

    var counter = 0
        set(value) {
            if (value >= 0)
                $counter = value
        }
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    // ...
    return result
}
