package Documents;

import java.util.Date;

public class GoodsSupplyContract extends Document{
    private String productType;
    private int productAmount;
    @Override
    public String showInformation() {
        return this.toString();
    }

    public GoodsSupplyContract(int documentNumber, Date documentDate, String productType, int productAmount) {
        this.productType = productType;
        this.productAmount = productAmount;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public GoodsSupplyContract() {}

    @Override
    public String toString() {
        return "GoodsSupplyContract{" +
                "documentNumber=" + documentNumber +
                ", documentDate=" + documentDate +
                ", productType='" + productType + '\'' +
                ", productAmount=" + productAmount +
                '}';
    }
}
