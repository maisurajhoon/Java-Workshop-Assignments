//PhoneBook Console Based Apllication 
public class PhoneBook {
    // data Members
    private static final int MAX_CAPACITY = 2000;
    private String[] names;
    private String[] numbers;
    private int size;

    // Constructors
    public PhoneBook() {
        names = new String[MAX_CAPACITY];
        numbers = new String[MAX_CAPACITY];
        size = 0;
    }

    public void addEntry(String name, String number) {
        if (size >= MAX_CAPACITY) {
            System.out.println("Phonebook is Full , can not add more entries");
            return;
        }
        names[size] = name;
        numbers[size] = number;
        size++;
    }

    public String searchNumbers(String name) {
        for (int i = 0; i < size; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return numbers[i];
            }
        }
        return "Number not found";
    }

    public void printEntries() {
        if (size == 0) {
            System.out.println("Phonebook is empty");
            return;
        }
        System.out.println("Phonebook is : ");
        for (int i = 0; i < size; i++) {
            System.out.println(names[i] + " : " + numbers[i]);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();// object craetion

        phoneBook.addEntry("Amit", "9593192206");
        phoneBook.addEntry("Niraj", "8593192346");
        phoneBook.addEntry("Nooriya", "7593192349");
        phoneBook.addEntry("Chavi", "7793192348");
        phoneBook.addEntry("Suraj", "9993192345");
        phoneBook.addEntry("Shimpa", "7593192999");

        System.out.println("Phone Number for Amit : " + phoneBook.searchNumbers("Amit"));
        System.out.println("Phone Number for amit : " + phoneBook.searchNumbers("amit"));
        System.out.println("Phone Number for Shimpa : " + phoneBook.searchNumbers("Shimpa"));
        System.out.println("Phone Number for Suraj : " + phoneBook.searchNumbers("Suraj"));
        System.out.println("Phone Number for Santosh : " + phoneBook.searchNumbers("Santosh"));

        phoneBook.printEntries();

    }
}