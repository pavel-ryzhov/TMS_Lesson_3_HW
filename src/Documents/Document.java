package Documents;

import java.util.Date;

public abstract class Document{
    protected int documentNumber;
    protected Date documentDate;
    public abstract String showInformation();
}
