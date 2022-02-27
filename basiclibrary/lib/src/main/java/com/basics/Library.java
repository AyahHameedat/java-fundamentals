/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;




public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        roll(4);
//            int[] array = {5, 9, 2, 1, 9};
//            System.out.println("Is The Array Duplicate ? " + containsDuplicates(array));
//            System.out.println("The Average of Array : "+ calculatingAverages(array));

        Integer[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

//        arrayOfArray(weeklyMonthTemperatures);

//        List<String> votes = Arrays.asList();
//        System.out.println("The winner is : " + tally(votes));

        analyzingWeatherData(weeklyMonthTemperatures);
    }

    public static void roll(int n) {
        ArrayList<Integer> result = new ArrayList<>(n);
        int rollNumber = 0;
        for (int index = 0; index < n; index++) {
            rollNumber = (int) (Math.random() * 6 + 1);
            result.add(rollNumber);
        }

        System.out.println("The result of Roll function is  =>  " + result);
    }

    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    return true;
            }
        }
        return false;
    }

    public static double calculatingAverages(int[] array) {
        double sumVaules = 0.0;
        double avgResult = 0.0;
        for (int index = 0; index < array.length; index++) {
            sumVaules += array[index];
        }
        System.out.println(sumVaules);
        avgResult = sumVaules / array.length;
        return avgResult;
    }


    public static double[] arrayOfArray(int[][] array) {
        double[] resultArray = new double[array.length];
        for (int index = 0; index < array.length; index++) {
            resultArray[index] = calculatingAverages(array[index]);
//            System.out.println("AYA " + resultArray[index]);
        }
        return resultArray;
    }

    public static String analyzingWeatherData(Integer[][] arrV)
    {
        Set<Integer> array = new HashSet<>();
        Integer[][] arr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int counter =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                else
                {
                    if (arr[i][j] < min)
                    min = arr[i][j];
                }
            }

        }
        String high = "High: " + max;
        String low = "Low: " + min;
        System.out.println(high);
        System.out.println(low);



        Set<Integer> arr2dSet = new HashSet<Integer>();
        int numbers2dSize = 0;

        for (Integer[] uniNum : arr) {
            List<Integer> numberList = Arrays.asList(uniNum);
            arr2dSet.addAll(numberList);
            numbers2dSize += numberList.size();
        }
//        System.out.println(arr2dSet);
        String strResult = "";
        for (int i = min; i <= max ; i++)
        {
            if (!arr2dSet.contains(i))
            {
                strResult = "Never saw temperature: " + i;
                System.out.println(strResult);
            }
        }
        return strResult;

    }

     public static String tally(List<String> votes) {

         votes = new ArrayList<>();
         votes.add("Bush");
         votes.add("Bush");
         votes.add("Bush");
         votes.add("Shrub");
         votes.add("Hedge");
         votes.add("Shrub");
         votes.add("Bush");
         votes.add("Hedge");
         votes.add("Bush");

         int max = 0;
         String winner = "";

         Map<String, Integer> duplicates = new HashMap<String, Integer>();

         for (String winnerName : votes) {
            if (duplicates.containsKey(winnerName)){ duplicates.put(winnerName, duplicates.get(winnerName)+1 ); }
            else { duplicates.put(winnerName, 1); } }

         for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
             System.out.println(entry.getKey() + " = " + entry.getValue());
             if (entry.getValue() > max) { max = entry.getValue(); } }


         for (Map.Entry<String, Integer> entry : duplicates.entrySet()) { if (max == entry.getValue()) { winner = entry.getKey(); } }

         return winner;
     }
}

