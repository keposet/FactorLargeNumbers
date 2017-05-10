package factorLargeNumbers;

public class Driver {

    public static void mian(String [] args) {
        ArrayBuilder primeList = new ArrayBuilder();
        primeList.findPrimes();
        primeList.printList();
    }

}
