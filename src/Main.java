import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ManageCandidates manageCandidates = new ManageCandidates();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. nhập thông tin thí sinh dự thi");
            System.out.println("2. hiện thị toàn bộ các  thí sinh");
            System.out.println("3. tìm và hiện thị thí sinh theo SBD");
            System.out.println("0. thoát chương trình");
            System.out.println("nhập biến choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng thí sinh");
                    int number =Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        addCandidates();
                    }
                    break;
                case 2:
                    manageCandidates.displayAll();
                    break;
                case 3:
                    System.out.println("nhập số báo danh cần tìm");
                    int identificationNumber=sc.nextInt();
                    manageCandidates.testIdentificationNumber(identificationNumber);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }

        } while (choice != 0);

    }

    public static void addCandidates() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nhập số báo danh");
        int identificationNumber = Integer.parseInt(sc.nextLine());
        System.out.println("nhập họ tên");
        String name = sc1.nextLine();
        System.out.println("nhập địa chỉ");
        String address = sc.nextLine();
        System.out.println("nhập diện ưu tiên");
        String prioritize = sc1.nextLine();
        String contestants = "";
        boolean BlockA;
        boolean BlockB;
        boolean BlockC;
        do {
            System.out.println("nhập khối thi");
            contestants=sc1.nextLine();
            if (contestants.equalsIgnoreCase("blockA")) {
                System.out.println("nhập môn thi 1");
                String math = sc.nextLine();
                System.out.println("nhập môn thi 2");
                String physics = sc1.nextLine();
                System.out.println("nhập môn thi 3");
                String chemistry = sc.nextLine();
                Candidates blockA = new BlockA(identificationNumber, name,address, prioritize, math, physics, chemistry);
                manageCandidates.addNew(identificationNumber, blockA);
            }
            if (contestants.equalsIgnoreCase("blockB")) {
                System.out.println("nhập môn thi 1");
                String math = sc.nextLine();
                System.out.println("nhập môn thi 2");
                String chemistry = sc1.nextLine();
                System.out.println("nhập môn thi 3");
                String disciple = sc.nextLine();
                Candidates blockB = new BlockB(identificationNumber, name, address, prioritize, math, chemistry, disciple);
                manageCandidates.addNew(identificationNumber, blockB);
            }
            if (contestants.equalsIgnoreCase("blockC")) {
                System.out.println("nhập môn thi 1");
                String literature = sc.nextLine();
                System.out.println("nhập môn thi 2");
                String history = sc1.nextLine();
                System.out.println("nhập môn thi 3");
                String geography = sc.nextLine();
                Candidates blockC = new BlockC(identificationNumber, name, address, prioritize, literature, history, geography);
                manageCandidates.addNew(identificationNumber, blockC);
            }
            BlockA = contestants.equalsIgnoreCase("blockA");
            BlockB = contestants.equalsIgnoreCase("blockB");
            BlockC = contestants.equalsIgnoreCase("blockC");

        } while (!BlockA && !BlockB && !BlockC);
        System.out.println("_______________________________");
    }
}
