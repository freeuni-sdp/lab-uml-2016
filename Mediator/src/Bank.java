/**
 * Created by Giorgi on 3/17/2015.
 */
public abstract class Bank {
    protected BankServiceOrganizer bso;

    /**
     * Customer arrived to the bank queue.
     *
     * @param index - of queue
     */
    public abstract void customerArrive(int index);

    /**
     * Customer ends service.
     *
     * @param index - of teller
     */
    public abstract void endService(int index);

    /**
     * Prints out all statuses.
     */
    public abstract void showStatus();
}
