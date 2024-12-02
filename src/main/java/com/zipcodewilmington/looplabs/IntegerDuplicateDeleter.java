package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {





        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count =0;
        String stringForArray = "";

        for(int i=0; i<super.array.length; i++){
            int val = super.array[i];
            count=0;
            System.out.println("Value of val in array: " + val);
            for(int j=0; j<super.array.length; j++){
                if(super.array[j] == val){
                    count++;
                }

            }
            if(count != exactNumberOfDuplications){
                stringForArray  = stringForArray + val + " ";

            }
        }
        String[] resultArray1 = stringForArray.split(" ");
        Integer[] resultArray = new Integer[resultArray1.length];
        for(int i=0 ; i<resultArray1.length; i++){
            resultArray[i] = Integer.valueOf(resultArray1[i]);
        }

        System.out.println("Result Array: " + Arrays.toString(resultArray));

        return resultArray;
    }
}
