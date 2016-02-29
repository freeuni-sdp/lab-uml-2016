
public class Queue extends BankEntity {
    private int size;

    /**
     * Initialises new bank queue.
     *
     * @param bo - bank service organiser
     */
    public Queue(BankServiceOrganizer bo) {
        super(bo);
    }

    /**
     * Dequeue client.
     */
    public void dequeue() {
        if (size > 0)
            size--;
    }

    /**
     * Enqueue client.
     */
    public void enqueue() {
        size++;
        changed();
    }

    /**
     * Returns size of bank queue.
     *
     * @return size of queue
     */
    public int getSize() {
        return size;
    }
}
