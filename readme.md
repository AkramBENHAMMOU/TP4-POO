# Practical Activity: Java Collections & Streams

## Objectives
The objectives of this practical activity are to familiarize students with the use of common Java collections, such as `ArrayList`, `HashMap`, and `HashSet`, and to practice implementing basic operations on these collections.Furthermore, an integral part of this activity is to introduce us to Java Streams and demonstrate how they can be used in conjunction with these collections.

# Part 1 : Collections

## Exercice 1 : Lists

1. Create a Produit class with the following attributes:
    - `id` (long)
    - `nom` (String)
    - `prix` (double)

2. Create a GestionProduitsApp class with a main method that:
    - Creates an ArrayList to store the products
    - Adds products to the list
    -  Removes a product by its index
    -  Displays the list of products
    -  Modifies a product by its index
    -  Searches for a product by its name

## Exercise 2: Maps

1. The `EXO2` class with the `main` method:
    - Creates a `HashMap` to store student grades
    - Asks the user to enter the grades of 4 students
    - Adds each grade to the map with the student's name as the key
    - Calculates and displays the sum, average, maximum, and minimum grade
    - Checks if there is a grade of 20 in the map and displays the result

The program works as follows:

1. The user is prompted to enter the grades of 4 students.
2. The grades are stored in a `HashMap` where the keys are the student names ("etudiant_1", "etudiant_2", etc.) and the values are the corresponding grades.
3. After entering all the grades, the program displays:
    - The complete list of grades in the map
    - The total number of students
    - The maximum grade
    - The minimum grade
    - The average of the grades
    - A message indicating whether a grade of 20 exists in the map or not.

This program allows you to easily manage a set of student grades using a `HashMap` data structure.


## Exercise 3: Sets

1. The `App` class with the `main` method:
    - Creates two `HashSet` objects named `groupeA` and `groupeB` to store student names
    - Adds student names to each HashSet
    - Displays the intersection of the two HashSets
    - Displays the union of the two HashSets

The program works as follows:

1. Two `HashSet` objects are created: `groupeA` and `groupeB`.
2. Student names are added to each HashSet:
    - In `groupeA`: "omar", "simo", "driss"
    - In `groupeB`: "simo", "hi", "red"
3. To find the intersection of the two groups, the program uses the data stream of the elements in `groupeA` and filters those that are present in `groupeB`. The result is collected in a new `Set` named `intersection`.
4. To find the union of the two groups, the program concatenates the data streams of the elements in `groupeA` and `groupeB`, and collects them in a new `Set` named `union`.
5. Finally, the program displays the results:
    - The intersection of the two groups: "simo"
    - The union of the two groups: "omar", "simo", "driss", "hi", "red"

This program uses `HashSet` collections to represent the student groups, and stream operations to calculate the intersection and union of these sets.

# Part 2 : Streams 

## Exercise 1

In this exercise, we have a list of words and we need to perform the following operations:

1. **Filter words containing the letter "a"**:
    - The program uses the `stream()` method to create a stream of the words in the list.
    - It then applies the `filter()` method to keep only the words that contain the letter "a".
    - The resulting filtered list is collected using `collect(Collectors.toList())` and printed.

2. **Filter words longer than 3 characters and reverse them**:
    - The program again creates a stream of the words.
    - It applies a `filter()` to keep only the words with length greater than 3.
    - Then, it uses `map()` to transform each word into its reverse using `new StringBuffer(l).reverse().toString()`.
    - The resulting list of reversed words is collected and printed.

3. **Filter strings containing the letter "e" and flatten them into character lists**:
    - The program creates a stream of the words.
    - It applies a `filter()` to keep only the words that contain the letter "e".
    - Then, it uses `flatMap()` to transform each word into a stream of its characters, and collects them into a single list of characters.
    - The resulting list of characters is printed.

4. **Transform each string to uppercase**:
    - The program creates a stream of the words.
    - It uses `map()` to transform each word into its uppercase version using `toUpperCase()`.
    - The resulting list of uppercase words is collected and printed.

5. **Convert each string to its length**:
    - The program creates a stream of the words.
    - It uses `map()` to transform each word into its length using `length()`.
    - The resulting list of lengths is collected and printed.

6. **Transform each string into a list of characters, then flatten all the lists**:
    - The program creates a stream of the words.
    - It uses `flatMap()` to transform each word into a stream of its characters, and collects them into a single list of characters.
    - The resulting list of characters is printed.

7. **Transform each word into "Name - Index"**:
    - The program uses `IntStream.range()` to create a stream of indices.
    - It then uses `mapToObj()` to transform each index into a string in the format "Name - Index" using the corresponding word from the original list.
    - The resulting list of formatted strings is collected and printed.

## Exercise 2

In this exercise, we have a list of employees, where each employee has a name (String), a department (String), and a salary (double). We need to perform the following operations:

1. **Calculate the total sum of all employee salaries**:
    - The program uses the `stream()` method to create a stream of the employees.
    - It then applies `mapToDouble(Employe::getSalaire)` to extract the salary of each employee, and `sum()` to calculate the total sum.
    - The resulting total sum is printed.

2. **Sort the list of employees by name in alphabetical order**:
    - The program creates a stream of the employees.
    - It uses `sorted(Comparator.comparing(Employe::getNom))` to sort the employees by their name.
    - The resulting sorted list of employees is collected and printed.

3. **Find the employee with the lowest salary**:
    - The program creates a stream of the employees.
    - It uses `min(Comparator.comparing(Employe::getSalaire))` to find the employee with the lowest salary.
    - The resulting employee is printed.

4. **Get the list of employees with a salary higher than a given value**:
    - The program creates a stream of the employees.
    - It applies a `filter()` to keep only the employees with a salary higher than a given value.
    - The resulting list of filtered employees is collected and printed.

5. **Find the employee with the highest salary**:
    - The program creates a stream of the employees.
    - It uses `reduce((s1,s2)-> s1.salaire>s2.salaire ? s1:s2)` to find the employee with the highest salary.
    - The resulting employee is printed.

6. **Concatenate the names of all employees**:
    - The program creates a stream of the employees.
    - It uses `map(Employe::getNom)` to extract the names of the employees.
    - It then applies `reduce("",String::concat)` to concatenate all the names into a single string.
    - The resulting concatenated string is printed.

The `Employe` class has the following fields:
- `nom` (String): the name of the employee
- `departement` (String): the department of the employee
- `salaire` (double): the salary of the employee


## Conclusion
This practical activity covers the basics of working with Java collections, including `ArrayList`, `HashMap`, and `HashSet`. By completing these exercises, students will gain hands-on experience in performing common operations on these data structures, such as adding, removing, modifying, and searching elements, as well as performing set-based operations.Also we explored various operations  such as filter(), map(), flatMap(), reduce(), and collect() that can be performed on lists using Java Streams. Java Streams provide a powerful and expressive way to process collections of data.