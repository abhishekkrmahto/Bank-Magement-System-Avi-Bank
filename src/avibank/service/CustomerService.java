package avibank.service;

public interface CustomerService {
    void deposit(long amount) throws Exception;

    void withdraw(long amount) throws Exception;

    void transfer() throws Exception;

    void viewTransactions() throws Exception;
}
