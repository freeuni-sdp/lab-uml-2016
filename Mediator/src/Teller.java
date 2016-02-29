
public class Teller extends BankEntity {
    private boolean isFree;

    /**
     * Initialises new teller, required argument
     * is bank service organizer.
     *
     * @param bo bank service organizer.
     */
    public Teller(BankServiceOrganizer bo) {
        super(bo);
        isFree = true;
    }

    /**
     * Initialises service with teller.
     *
     * @param q queue for future use by teller.
     */
    public void initService(Queue q) {
        if (isFree) {
            q.dequeue();
            isFree = false;
        }
    }

    /**
     * Ends service with teller.
     */
    public void endService() {
        isFree = true;
        changed();
    }

    /**
     * Returns boolean teller is free or not.
     *
     * @return teller is free or not.
     */
    public boolean isFree() {
        return isFree;
    }
}
