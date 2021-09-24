public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return this.name;
    }

    public String getAddress() {return this.address; }

    public String getPhoneNumber() { return this.phoneNumber; }


    // Default Constructor
    public BuddyInfo() {
        this("", "", "");
    }

    // Constructor
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void NewMethod() {
        System.out.println("Working fine!");
    }

    public static void main(String[] args) {
        BuddyInfo BuddyInfo1 = new BuddyInfo("Homer", "", "");
        System.out.println("Hello" + BuddyInfo1.getName());
    }

}
