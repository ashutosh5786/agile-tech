println "Week 2"


def text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

// Ex 1 (*) Print the number of words that start with a in the output console.

println "Exercise 01"
println text.tokenize().findAll { it.startsWith('a') }.size()


def text2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

// Ex 2 (*) Print the number of occurences of in (as a whole word) that appear in the text in the output console.

println "Exercise 02"
println text2.tokenize().findAll { it == 'in' }.size()


def list = [1, 2, 3, 4]

// Ex 3 (*) Group those number that are even and those that are odd. Print the result in the output console for example [false:[1,3], true:[2,4]]

println "Exercise 03"
println list.groupBy { it % 2 == 0 }

list2 = [[city: 'Leicester', country: 'England'], [city: 'Cardiff', country: 'Wales'], [city: 'London', country: 'England'], [city: 'Madrid', country: 'Spain']]

// Ex 4 (*) return those records that represent cities that are in England. Tha output should be [[city: 'Leicester', country: 'England'], [city: 'London', country: 'England']]

println "Exercise 04"
println list2.findAll { it.country == 'England' }


list3 = [[city: 'Leicester', country: 'England'], [city: 'Cardiff', country: 'Wales'], [city: 'London', country: 'England'], [city: 'Madrid', country: 'Spain']]

// Ex 5 (*) Sort the list in reverse order by the name of city. The output should be [[city:Madrid, country:Spain], [city:London, country:England], [city:Leicester, country:England], [city:Cardiff, country:Wales]].

println "Exercise 05"
println list3.sort { it.city }.reverse()

// Ex 6 (*) Sort the list in reverse order by the name of city. The output should be [[city:Madrid, country:Spain], [city:London, country:England], [city:Leicester, country:England], [city:Cardiff, country:Wales]].

println "Exercise 06"
println list3.sort { it.city }.reverse()