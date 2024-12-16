package com.kandy.iso3166
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class CountryISO(
    @SerialName("fips")
    val fips: String,
    @SerialName("iso")
    val iso: String,
    @SerialName("iso3")
    val iso3: String,
    @SerialName("names")
    val names: Names,
    @SerialName("numeric")
    val numeric: Int,
    @SerialName("reference")
    val reference: Reference,
    @SerialName("regions")
    val regions: List<Region>
) {
    @Serializable
    data class Names(
        @SerialName("ar")
        val ar: String,
        @SerialName("de")
        val de: String,
        @SerialName("en")
        val en: String,
        @SerialName("es")
        val es: String,
        @SerialName("fr")
        val fr: String,
        @SerialName("geonames")
        val geonames: String,
        @SerialName("he")
        val he: String,
        @SerialName("hi")
        val hi: String,
        @SerialName("it")
        val `it`: String,
        @SerialName("ja")
        val ja: String,
        @SerialName("pt")
        val pt: String,
        @SerialName("ru")
        val ru: String,
        @SerialName("zh")
        val zh: String
    )

    @Serializable
    data class Reference(
        @SerialName("geonames")
        val geonames: Int,
        @SerialName("openstreetmap")
        val openstreetmap: Int,
        @SerialName("wikipedia")
        val wikipedia: String
    )

    @Serializable
    data class Region(
        @SerialName("admin")
        val admin: String,
        @SerialName("fips")
        val fips: String,
        @SerialName("iso")
        val iso: String,
        @SerialName("name")
        val name: String,
        @SerialName("names")
        val names: Names,
        @SerialName("reference")
        val reference: Reference
    ) {
        @Serializable
        data class Names(
            @SerialName("ar")
            val ar: String?,
            @SerialName("de")
            val de: String,
            @SerialName("en")
            val en: String,
            @SerialName("es")
            val es: String,
            @SerialName("fr")
            val fr: String,
            @SerialName("geonames")
            val geonames: String,
            @SerialName("it")
            val `it`: String,
            @SerialName("ru")
            val ru: String,
            @SerialName("zh")
            val zh: String
        )

        @Serializable
        data class Reference(
            @SerialName("geonames")
            val geonames: Int,
            @SerialName("openstreetmap")
            val openstreetmap: Int,
            @SerialName("openstreetmap_level")
            val openstreetmapLevel: Int,
            @SerialName("wikipedia")
            val wikipedia: String,
            @SerialName("wof")
            val wof: String?
        )
    }
}