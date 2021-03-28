package com.zipcodewilmington.arrayutility;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E extends Object> {
    E[] inputArray;

    public ArrayUtility(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate) {
        Integer counter = 0;
        for (int i = 0; i < arrayToMerge.length; i++) {
            if (arrayToMerge[i] == valueToEvaluate) {
                counter++;
            }
        }
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public E getMostCommonFromMerge(E[] arrayToMerge) {
        return null;
    }

    public Integer getNumberOfOccurrences(E valueToEvaluate) {
        Integer counter = 0;
        for (E num : inputArray) {
            if (num == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public E[] removeValue(E valueToRemove) {
        return null;
    }
}
