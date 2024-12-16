package com.kandy.iso3166


object ISO3166 {

    private val jsonString by lazy { object {}.javaClass.getResource("/res/raw/iso3166_2.json")?.readText() }

    fun getAllCountries() {

    }
}