/**
 * Copyright 2008-2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package commonline.cl4.changesend.layout;

import commonline.test.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class SchoolRefundRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new SchoolRefundRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 38;
    }

    protected String recordCode() {
        return "@111";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "Record Type", 3, 2);
        assertInteger("3", "Borrower SSN", 5, 9);
        assertInteger("4", "School ID", 14, 8);
        assertText("5", "Filler", 22, 3);
        assertText("6", "School Non-ED Branch ID", 25, 4);
        assertText("7", "Recipient ID", 29, 8);
        assertText("8", "Filler", 37, 3);
        assertText("9", "Recipient Non-ED Branch ID", 40, 4);
        assertText("10", "Unique Loan Identifier", 44, 16);
        assertInteger("11", "Guarantee Date (CCYYMMDD)", 60, 8);
        assertText("12", "Loan Type Code", 68, 2);
        assertText("13", "Alternative Loan Program Type Code", 70, 3);
        assertInteger("14", "First Disbursement Date(CCYYMMDD)", 73, 8);
        assertText("15", "Lender ID", 81, 6);
        assertText("16", "Servicer Code", 87, 6);
        assertInteger("17", "Loan Period Begin Date (CCYYMMDD)", 93, 8);
        assertInteger("18", "Loan Period End Date (CCYYMMDD)", 101, 8);
        assertText("19", "School Designated Branch/Division Code", 109, 2);
        assertInteger("20", "PLUS/Alternative Student SSN", 111, 9);
        assertText("21", "CommonLine Unique Identifier", 120, 17);
        assertInteger("22", "CommonLine Loan Sequence Number", 137, 2);
        assertInteger("23", "School Refund Date(CCYYMMDD)", 139, 8);
        assertDecimal("24", "School Refund Amount", 147, 8);
        assertDecimal("25", "Net Loan Amount", 155, 8);
        assertInteger("26", "Withdrawal Date (CCYYMMDD)", 163, 8);
        assertText("27", "Funds Return Method Code", 171, 1);
        assertText("28", "Record Status", 172, 1);
        assertText("29", "Date/Time Stamp(CCYYMMDDHHMMSSNNNNNN)", 173, 20);
        assertText("30", "DUNS School ID", 193, 9);
        assertText("31", "DUNS Recipient ID", 202, 9);
        assertText("32", "DUNS Lender ID", 211, 9);
        assertText("33", "DUNS Servicer Code", 220, 9);
        assertText("34", "Filler", 229, 185);
        assertText("35", "School Use Only", 414, 23);
        assertText("36", "Lender Use Only", 437, 20);
        assertText("37", "Guarantor Use Only", 457, 23);
        assertText("38", "Record Terminator", 480, 1);

    }
}
