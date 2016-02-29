import java.util.ArrayList;

public class LittleBankServiceOrganizer implements BankServiceOrganizer {
    private static final int QUEUES = 2, TELLERS = 2;
    private ArrayList<Queue> queues;
    private ArrayList<Teller> tellers;

    /**
     * Constructs an empty LittleBankServiceOrganizer.
     */
    public LittleBankServiceOrganizer() {
        this.queues = new ArrayList<Queue>();
        this.tellers = new ArrayList<Teller>();
    }

    /**
     * Returns the number of queues in this list.
     *
     * @return the number of queues in this list.
     */
    public int getQueueNumber() {
        return this.queues.size();
    }

    /**
     * Returns the number of tellers in this list.
     *
     * @return the number of tellers in this list.
     */
    public int getTellerNumber() {
        return this.tellers.size();
    }

    /**
     * Returns the element at the specified position in list.
     *
     * @param index - index of the element to return
     * @return the element at the specified position in list
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     */
    public Queue getQueue(int index) {
        return this.queues.get(index - 1);
    }

    /**
     * Returns the element at the specified position in list
     *
     * @param index - index of the element to return
     * @return the element at the specified position in list
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 1 || index > size())
     */
    public Teller getTeller(int index) {
        return this.tellers.get(index - 1);
    }

    /**
     * Creates certain amount of queues and tellers
     */
    public void createBankEntities() {
        for (int i = 0; i < QUEUES; i++)
            this.queues.add(new Queue(this));
        for (int i = 0; i < TELLERS; i++)
            this.tellers.add(new Teller(this));
    }

    @Override
    public void entityChanged(BankEntity bankEntity) {
        if (bankEntity == getTeller(1)) {
            if (getQueue(1).getSize() > 0)
                getTeller(1).initService(getQueue(1));
            else if (getQueue(2).getSize() > 0)
                getTeller(1).initService(getQueue(2));
        } else if (bankEntity == getTeller(2)) {
            if (getQueue(2).getSize() > 0)
                getTeller(2).initService(getQueue(2));
            else if (getQueue(1).getSize() > 0)
                getTeller(2).initService(getQueue(1));
        } else if (bankEntity == getQueue(1)) {
            if (getTeller(1).isFree())
                getTeller(1).initService(getQueue(1));
            else if (getTeller(2).isFree())
                getTeller(2).initService(getQueue(1));
        } else if (bankEntity == getQueue(2)) {
            if (getTeller(2).isFree())
                getTeller(2).initService(getQueue(2));
            else if (getTeller(1).isFree())
                getTeller(1).initService(getQueue(2));
        }
    }

}
