
public abstract class BankEntity {
    BankServiceOrganizer bOrganizer;

    /**
     * This is abstract class for concrete colleagues.
     *
     * @param bankServiceOrganizer - needs information about bank service organiser
     */
    public BankEntity(BankServiceOrganizer bankServiceOrganizer) {
        this.bOrganizer = bankServiceOrganizer;
    }

    /**
     * This is called when bank service organiser
     * entity is changed.
     */
    public void changed() {
        bOrganizer.entityChanged(this);
    }
}
