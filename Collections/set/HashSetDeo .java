//Employee Id: 20450630
// Create a class HashSetDemo with the folloing variables and methods:
HashSet set = new HashSet<>(); //instance variable
public static void main(String[] args)
boolean addCountry(String countryName)
String findCountry(String countryName)
void printAllCountries()
From main() method, try to add the county name to HashSet object by calling addCountry(). Provide duplicate country name while adding and observe the return values from the addCountry().
From main() method, try passing the country name to the findCountry() method and check the country name exists or not, if exists return the country name else return "Country Not Found".
Now, call printAllCountries() to print all the country names which are added earlier. (Try using Enumeration, Iterator, ListIterator and observe and also observe the order of elements being printed)


import java.util.HashSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

class HashSetDeo {
    private HashSet<String> set = new HashSet<>();

    public boolean addCountry(String countryName) {
        return set.add(countryName);
    }

    public String findCountry(String countryName) {
        if (set.contains(countryName)) {
            return countryName;
        } else {
            return "Country Not Found";
        }
    }

    public void printAllCountries() {
        Enumeration<String> enumeration = Collections.enumeration(set);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        System.out.println();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        ListIterator<String> listIterator = new ArrayList<>(set).listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    public static void main(String[] args) {
        HashSetDeo hsd = new HashSetDeo();
        System.out.println(hsd.addCountry("India")); // true
        System.out.println(hsd.addCountry("China")); // true
        System.out.println(hsd.addCountry("India")); // false (duplicate)
        System.out.println();
        System.out.println(hsd.findCountry("India")); // India
        System.out.println(hsd.findCountry("USA")); // Country Not Found
        System.out.println();
        hsd.printAllCountries();
    }
}