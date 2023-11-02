def name = "ashutosh"
println "Hello $name"
def date = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new Date())
println "Today's date is $date"
def fruitBag = ['apple', 'banana', 'orange']
println fruitBag


// ex 01 (*). Print "my name: 06-18-2016" on the output console using Groovy script.

println "Exercise 01"
println "${name}: ${date}"

// ex 02 (*) Use a loop for printing the members of the collection fruitBag on the output console.

println "Exercise 02"
fruitBag.each { println it }

// ex 03 (*) Define a function that given a range of integers determines the average.

println "Exercise 03"
def average = { a, b ->
    def sum = 0
    (a..b).each { sum += it }
    sum / (b - a + 1)
}
println average(1, 10)


// ex 04 (**). using a closure to check wheather frutbag contains the 'banana' or not.

println "Exercise 04"
def containsBanana = { fruitBag.contains('grapes') }
println containsBanana()

// ex 05 (**) using a closure check whether all the words in fruitbag contains the letter 'n' or not.

println "Exercise 05"
def allContainsN = { fruitBag.every { it.contains('n') } }
println allContainsN()

