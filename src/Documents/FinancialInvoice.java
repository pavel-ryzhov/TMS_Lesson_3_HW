package Documents;

import java.util.Date;

/**
 * Финансовая накладная
 */
public class FinancialInvoice extends Document {
    private int totalAmount;
    private int departmentCode;

    public FinancialInvoice(int documentNumber, Date documentDate, int totalAmount, int departmentCode) {
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public FinancialInvoice() {}

    @Override
    public String showInformation() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "documentNumber=" + documentNumber +
                ", documentDate=" + documentDate +
                ", totalAmount=" + totalAmount +
                ", departmentCode=" + departmentCode +
                '}';
    }
}
