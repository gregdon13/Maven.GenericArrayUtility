package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E> {
    E[] inputArray;

    public ArrayUtility(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public ArrayUtility() {}

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate) {
        Integer counter = 0;
        for (int i = 0; i < arrayToMerge.length; i++) {
            if (arrayToMerge[i] == valueToEvaluate) {
                counter++;
            }
        }
        counter += getNumberOfOccurrences(valueToEvaluate);
        return counter;
    }

    public E getMostCommonFromMerge(E[] arrayToMerge) {
        E[] mergedArr = mergeArrays(arrayToMerge);
        E objOne;
        Integer countOne = 1;
        E objTwo = null;
        Integer countTwo = 1;
        for (int i = 0; i < mergedArr.length-1; i++) {
            objOne = mergedArr[i];
            for (int j = i+1; j < mergedArr.length; j++) {
                if (objOne.equals(mergedArr[j])) {
                    countOne++;
                }
            }
            if (countOne > countTwo) {
                objTwo = objOne;
                countTwo = countOne;
            }
            countOne = 1;
        }
        return objTwo;
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
        int counter = getNumberOfOccurrences(valueToRemove);
        E[] output = Arrays.copyOf(inputArray, inputArray.length - counter);
        int newIndex = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (!inputArray[i].equals(valueToRemove)) {
                output[newIndex] = inputArray[i];
                newIndex++;
            }
        }
        return output;
    }

    public E[] mergeArrays(E[] arrayToMerge) {
        int fal = inputArray.length;
        int sal = arrayToMerge.length;
        E[] newArr = Arrays.copyOf(inputArray, (fal + sal));
        for (int i = 0; i < fal; i++) {
            newArr[i] = inputArray[i];
        }
        int newIndex = inputArray.length;
        for (int j = 0; j < arrayToMerge.length; j++) {
            newArr[newIndex] = arrayToMerge[j];
            newIndex++;
        }
        return newArr;
    }

}
