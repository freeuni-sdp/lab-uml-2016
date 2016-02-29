
public class LittleBank extends Bank {

    public LittleBank() {
        this.bso = new LittleBankServiceOrganizer();
        ((LittleBankServiceOrganizer) bso).createBankEntities();
        System.out.println("----------------------");
        System.out.println("Queue number: " + ((LittleBankServiceOrganizer) bso).getQueueNumber());
        System.out.println("Teller number: " + ((LittleBankServiceOrganizer) bso).getTellerNumber());
    }

    @Override
    public void customerArrive(int index) {
        ((LittleBankServiceOrganizer) bso).getQueue(index).enqueue();
    }

    @Override
    public void endService(int index) {
        ((LittleBankServiceOrganizer) bso).getTeller(index).endService();
    }

    @Override
    public void showStatus() {
        System.out.println("----------------------");
        for (int i = 1; i <= ((LittleBankServiceOrganizer) bso).getTellerNumber(); i++)
            System.out.println("Teller " + i + " status: " +
                    (((LittleBankServiceOrganizer) bso).getTeller(i).isFree() ? "FREE" : "BUSY"));
        for (int i = 1; i <= ((LittleBankServiceOrganizer) bso).getQueueNumber(); i++)
            System.out.println("Queue " + i + " size: " + ((LittleBankServiceOrganizer) bso).getQueue(i).getSize());

    }
}
