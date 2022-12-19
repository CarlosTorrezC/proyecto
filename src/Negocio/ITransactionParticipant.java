
package Negocio;

public interface ITransactionParticipant {
    public void join(int idTransaction);
    public void commit(int idTransaction);
    public void cancel(int idTransaction);
}
