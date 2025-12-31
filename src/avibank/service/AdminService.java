package avibank.service;

public interface AdminService {
    void viewAllAccount() throws Exception;

    void freezeAccount() throws Exception;

    void deleteAccount() throws Exception;
}
