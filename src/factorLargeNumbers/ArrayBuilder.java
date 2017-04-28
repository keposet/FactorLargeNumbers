package factorLargeNumbers;

import java.util.ArrayList;

public class ArrayBuilder {


    private ArrayList<Integer> primeList = new ArrayList<Integer>();
    private final int LIMIT = 100000;
    private long bigNum = 600851475143L;
    private long bigNumSub = 100000L;

    public void findPrimes() {
        int i = 0, limit = LIMIT, testValue = 2;
        boolean isPrime = true;

        while (testValue < limit) {

            while (isPrime == true && i < primeList.size()) {
                if (testValue % primeList.get(i) == 0) {
                    isPrime = false;
                } else {
                    i++;
                }
            }

            i = 0;
            if (isPrime == true) {

                primeList.add(testValue);
                System.out.println(testValue);
                testValue++;

            } else {
                testValue++;
                isPrime = true;

            }

        }

    }

    public void bigFactor() {
        long foundFactor = 0;
        boolean foundAFactor = false;
        while (foundAFactor == false) {

            if (bigNum % bigNumSub == 0) {
                foundAFactor = true;
                foundFactor = bigNumSub;
            } else {
                bigNumSub--;
            }

        }
        System.out.println(foundFactor);
    }

}


