package Documents;

import java.util.Date;

/**
 * Контракт с сотрудником
 */
public class EmployeeContract extends Document{
    private Date dateOfEnd;
    private String employeeName;

    public EmployeeContract(int documentNumber, Date documentDate, Date dateOfEnd, String employeeName) {
        this.dateOfEnd = dateOfEnd;
        this.employeeName = employeeName;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public EmployeeContract() {}

    @Override
    public String showInformation() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "EmployeeContract{" +
                "documentNumber=" + documentNumber +
                ", documentDate=" + documentDate +
                ", dateOfEnd=" + dateOfEnd +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
