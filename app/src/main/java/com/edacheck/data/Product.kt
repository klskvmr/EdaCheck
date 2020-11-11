package com.edacheck.data

class Product(
    val name: String, // название
    val composition: List<Substance>, // состав
    val originCountry: List<Substance>, // страна производства
    val Manufacturer: String, // производитель
    val nutritionalAndEnergyValue: NutritionalAndEnergyValue,
) {
    lateinit var additions: List<Addition> // список добавок?????????
}