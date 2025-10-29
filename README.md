> **Note: Language Context**
>
> Please note that this project was written in **German** as part of my `Ausbildung` (German vocational training). Therefore, all variable names, comments, and package/class names are in German.

---

# Java Data Structures Toolkit

## About This Project

This repository is a collection of classic "Data Structures and Algorithms" (DSA) exercises, all grouped under the `datenstrukturen` package.

It includes several distinct components, each demonstrating a core Computer Science concept. The `DatenStrukturen.java` file acts as a `main` class to test and demonstrate all the other utilities.

## Components Included

### 1. `Worterbuch` (Bidirectional Dictionary)
A dictionary class that provides two-way (EN <-> DE) translations.
* **Core Concept:** Uses **two `HashMap`s** (`englishToGerman` and `germanToEnglish`) to provide fast, O(1) lookups in *both directions*.
* `addWord()` and `removeWord()` methods correctly update *both* maps to keep them synchronized.

### 2. `MengenOperationen` (Set Theory Operations)
A static utility class that performs mathematical set operations.
* **Core Concept:** Demonstrates a clear understanding of `java.util.Set` and its built-in methods.
* `getUnion(A, B)`: Implements `A ∪ B` (Birleşim) using `addAll()`.
* `getIntersection(A, B)`: Implements `A ∩ B` (Kesişim) using `retainAll()`.
* `getDifference(A, B)`: Implements `A \ B` (Fark) using `removeAll()`.

### 3. `ListeSortieren` (List Sorter)
A class that implements a classic sorting algorithm.
* **Core Concept:** Demonstrates the **Bubble Sort** algorithm (`buubleSortLis`) by implementing it from scratch using nested `for` loops to sort a `List<Integer>`.
