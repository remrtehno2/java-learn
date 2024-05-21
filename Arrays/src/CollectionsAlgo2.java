import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsAlgo2 {
    public static void main(String[] args) {
        /*
        shuffle, reverse, sort, indexOfSublist, binarySearch, frequency, min, max, rotate, swap, replaceAll, disjoint, addAll, fill, nCopies, copy, - algorithms
        For, contains, index of, get

         */
        ArrayList<String> myArrayString = new ArrayList<>(
                List.of("Name 1", "Name 2", "Name 2", "Name 3", "Name 4")
        );

        System.out.println(myArrayString);
        Collections.reverse(myArrayString);
        System.out.println(myArrayString);

        int indexOfSub = Collections.indexOfSubList(myArrayString, List.of("Name 2", "Name 1"));
        System.out.println(indexOfSub);

        Collections.sort(myArrayString);
        int index = Collections.binarySearch(myArrayString, "Name 3");
        System.out.println(index);

        // Find the frequency of a specific element
        int frequencyOfName2 = Collections.frequency(myArrayString, "Name 2");
        System.out.println("Frequency of 'Name 2': " + frequencyOfName2);

        // Find the minimum and maximum elements
        String minElement = Collections.min(myArrayString);
        String maxElement = Collections.max(myArrayString);
        System.out.println("Min Element: " + minElement);
        System.out.println("Max Element: " + maxElement);


        // Rotate elements by a specified distance
        System.out.println("NOT Rotated: " + myArrayString);
        Collections.rotate(myArrayString, 2);
        System.out.println("Rotated: " + myArrayString);


        // Swap elements at specified indices
        Collections.sort(myArrayString);
        Collections.swap(myArrayString, 0, 3);
        System.out.println("After Swapping indices 0 and 3: " + myArrayString);


        // Replace all occurrences of a specific element
        Collections.replaceAll(myArrayString, "Name 2", "Updated Name");
        System.out.println("After replacing 'Name 3': " + myArrayString);

        // Check if two collections are disjoint
        boolean isDisjoint = Collections.disjoint(myArrayString, List.of("New Name", "Another Name"));
        System.out.println("Are the collections disjoint? " + isDisjoint);
        boolean isDisjoint2 = Collections.disjoint(myArrayString, List.of("Name 2", "Name 3"));
        System.out.println("Are the collections disjoint? " + isDisjoint2);


        // Add all elements from one collection to another
        ArrayList<String> additionalNames = new ArrayList<>(List.of("Additional 1", "Additional 2"));
        Collections.addAll(myArrayString, "Extra Name", "Another Extra Name", "Extra Name", "Another Extra Name", "Extra Name", "Another Extra Name");
        System.out.println("After adding extra names: " + myArrayString);

        // Fill the ArrayList with a specified element
  //      Collections.fill(myArrayString, "Filled Name");
  //      System.out.println("After filling with 'Filled Name': " + myArrayString);

        // Copy elements from one collection to another
///        ArrayList<String> copiedList2 = new ArrayList<>(myArrayString.size());
       //  Collections.copy(copiedList2, myArrayString);
        // System.out.println("Copied ArrayList: " + copiedList2);


        // Use a for loop to iterate through elements
        for (String name : myArrayString) {
            System.out.println("Name: " + name);
            if(name.equals("Name 1")) {
                
                break;
            }
        }

        // Check if the ArrayList contains a specific element
        boolean containsName = myArrayString.contains("Updated Name");
        System.out.println("Does the ArrayList contain 'Updated Name'? " + containsName);

        // Find the index of a specific element
        int indexOfUpdatedName = myArrayString.indexOf("Updated Name");
        System.out.println("Index of 'Updated Name': " + indexOfUpdatedName);

    }
}
