package factorLargeNumbers;

import java.util.ArrayList;

public class ArrayBuilder {

    private ArrayList<Integer> primeList = new ArrayList<Integer>();
    private final int LIMIT = 10000;


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

    public void printList(){

        for (Integer prime : primeList) {
            System.out.println(prime);
        }

    }

}
