val fruits = listOf("bananas", "apple", "orange")
val map = mapOf("bananas" to 1, "apple" to 2,"orange" to 3)
println(map.mapValues { it.value.toUpperCase() })
{"bananas"=1,"apple"=2,"orange"=3}