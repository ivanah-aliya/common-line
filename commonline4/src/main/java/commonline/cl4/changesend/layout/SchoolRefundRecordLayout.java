package commonline.cl4.changesend.layout;

import commonline.core.layout.AbstractCommonLineRecordLayout;


public class SchoolRefundRecordLayout extends AbstractCommonLineRecordLayout {
    protected void defineFields() {
        field("2", "Record Type R", "9(002)");
        field("3", "Borrower SSN R", "9(009)");
        field("4", "School ID R", "9(008)");
        field("5", "Filler", "X(003)");
        field("6", "School Non-ED Branch ID", "X(004)");
        field("7", "Recipient ID R", "X(008)");
        field("8", "Filler", "X(003)");
        field("9", "Recipient Non-ED Branch ID R1", "X(004)");
        field("10", "Unique Loan Identifier", "X(016)");
        field("11", "Guarantee Date (CCYYMMDD)", "9(008)");
        field("12", "Loan Type Code R", "X(002)");
        field("13", "Alternative Loan Program Type Code", "X(003)");
        field("14", "First Disbursement Date(CCYYMMDD)", "9(008)");
        field("15", "Lender ID R", "X(006)");
        field("16", "Servicer Code", "X(006)");
        field("17", "Loan Period Begin Date (CCYYMMDD)", "9(008)");
        field("18", "Loan Period End Date (CCYYMMDD)", "9(008)");
        field("19", "School Designated Branch/Division Code", "X(002)");
        field("20", "PLUS/Alternative Student SSN", "9(009)");
        field("21", "CommonLine Unique Identifier R", "X(017)");
        field("22", "CommonLine Loan Sequence Number R1", "9(002)");
        field("23", "School Refund Date(CCYYMMDD)", "9(008)");
        field("24", "School Refund Amount R", "9(006)V99");
        field("25", "Net Loan Amount", "9(006)V99");
        field("26", "Withdrawal Date (CCYYMMDD)", "9(008)");
        field("27", "Funds Return Method Code R", "X(001)");
        field("28", "Record Status", "X(001)");
        field("29", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", "X(020)");
        field("30", "DUNS School ID O", "X(009)");
        field("31", "DUNS Recipient ID O", "X(009)");
        field("32", "DUNS Lender ID O", "X(009)");
        field("33", "DUNS Servicer Code", "X(009)");
        field("34", "Filler", "X(185)");
        field("35", "School Use Only O", "X(023)");
        field("36", "Lender Use Only O", "X(020)");
        field("37", "Guarantor Use Only O", "X(023)");
        recordTerminator("38");
    }

    public String getCode() {
        return "@111";
    }
}