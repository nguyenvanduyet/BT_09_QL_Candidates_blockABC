public class Candidates {
    private int identificationNumber;
    private String name;
    private String address;
    private String prioritize;

    public Candidates(int identificationNumber, String name, String address, String prioritize) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.address = address;
        this.prioritize = prioritize;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "identificationNumber=" + identificationNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", prioritize='" + prioritize + '\'' +
                '}';
    }
}
