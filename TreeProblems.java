/*
 * *** Kendall Savino / COMP 272 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    // Initialize new tree set to store elements from A
    Set<Integer> result = new TreeSet<>(setA);

    // Keep only elements in A that are not in B (tree set)
    result.removeAll(setB);

    // Keep only elements in B that are not in A (setB)
    setB.removeAll(setA);

    // Add all remaining elements from set B to tree set
    result.addAll(setB);

    return result;

  } // end different method


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.

    // Initialize iterator from java util to loop through map entries
    Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();

    // So long as the iterator has a next entry, get it from the map
    while (iterator.hasNext()) {
      Map.Entry<Integer, String> entry = iterator.next();

      // Remove current map entry if the key is even
      if (entry.getKey() % 2 == 0) {
        iterator.remove();

      }

    }

  } // end removeEven method


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    // Initialize boolean variable to false, assuming the two trees are not equal
    boolean isEqual = false;

    // Udate boolean variable to be true if equality between trees is found
    if (tree1.equals(tree2) == true) {
      isEqual = true;
    }

    return isEqual;

  } // end treesEqual method

} // end treeProblems class
