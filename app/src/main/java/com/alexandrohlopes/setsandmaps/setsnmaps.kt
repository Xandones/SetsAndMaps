package com.alexandrohlopes.setsandmaps

fun main() {
    println("Sets") // You can't add items to a set after it's created
    val fruits = setOf("Orange", "Apple", "Grape", "Apple") // Sets store groups of different items, if you add repeated items Kotlin will ignore them
    println(fruits.toSortedSet()) // Sorts the items inside a Set in alphabetical order
    val newFruits = fruits.toMutableSet() // Copies the Immutable Set 'fruits' to a Mutable Set named 'newFruits'
    val fruitz = arrayOf("Strawberry", "Watermelon", "Pear", "Banana")
    newFruits.addAll(fruitz) // Adds all the elements of the Array 'fruitz' to the Immutable Set 'newFruits'
    println(newFruits.toSortedSet())
    println(newFruits.elementAt(3)) // Access an element of a Set at a specific position

    println("\nMaps")
    val daysOfTheWeek = mapOf(1 to "Sunday", 2 to "Monday", 3 to "Tuesday" ) // You aren't limited to use integer numbers to mark maps
    println(daysOfTheWeek)
    println(daysOfTheWeek[2]) // Prints the element at position 2
    println("Size of the map daysOfTheWeek: ${daysOfTheWeek.size}")
    for (key in daysOfTheWeek.keys) {
        print("$key is to ${daysOfTheWeek[key]} | ")
    }
    println()
    val fruitsMap = mapOf("Favorite" to Fruits("Passion fruit", 7.0), "Ok" to Fruits("Banana", 3.0), "Good" to Fruits("Apple",5.0))
    println(fruitsMap)
    val newFruitz = mapOf("Second" to Fruits("Green apple", 10.0), "Hated" to Fruits("Jaca", 7.0))
    val mutableFruitsMap = fruitsMap.toMutableMap() // Copies the immutable map 'fruitsMap' to a mutable map
    mutableFruitsMap.putAll(newFruitz.toSortedMap()) // Adds the content of the map 'newFruitz' to the map 'mutableFruitsMap'
    println(mutableFruitsMap)
}

data class Fruits(val name : String, val price : Double)