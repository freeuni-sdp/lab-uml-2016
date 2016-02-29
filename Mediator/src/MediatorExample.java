
public class MediatorExample {
    public static void main(String[] args) {
        Bank bank = new LittleBank();

        bank.showStatus();

        System.out.println("A customer arrives to queue 1");
        bank.customerArrive(1);
        bank.showStatus();

        System.out.println("A customer arrives to queue 1");
        bank.customerArrive(1);
        bank.showStatus();

        System.out.println("A customer arrives to queue 1");
        bank.customerArrive(1);
        bank.showStatus();

        System.out.println("A customer arrives to queue 2");
        bank.customerArrive(2);
        bank.showStatus();

        System.out.println("End of service Teller 1");
        bank.endService(1);
        bank.showStatus();

        System.out.println("End of service Teller 2");
        bank.endService(2);
        bank.showStatus();

        System.out.println("End of service Teller 2");
        bank.endService(2);
        bank.showStatus();

        System.out.println("End of service Teller 1");
        bank.endService(1);
        bank.showStatus();
    }
}
