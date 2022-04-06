package lc;

public class AddressBook {


     private SortingAlgorithm sortingAlgorithm; //this is logic requirement not spring compuilsion


  //  public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {

    public AddressBook(SortingAlgorithm sortingAlgorithm){
        System.out.println("sorting algorithm wired");
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void arrangeAddresses() {
        sortingAlgorithm.sort();
        System.out.println("arranging addresses done");
    }
}
