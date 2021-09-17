import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> collection = new ArrayList<>();

    public void addBuddy(BuddyInfo obj) {
        collection.add(obj);
    }

    public void removeBuddy (BuddyInfo obj) {
        collection.remove(obj);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
