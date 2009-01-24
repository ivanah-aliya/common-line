package commonline.cl4.changesend.layout;

import commonline.cl4.appsend.layout.AbstractRecordLayoutTestCase;
import flapjack.layout.RecordLayout;


public class TrailerRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new TrailerRecordLayout();
    }

    protected int recordLength() {
        return 480;
    }

    protected int fieldCount() {
        return 18;
    }

    protected String recordCode() {
        return "@T";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertInteger("2", "@1 Detail Record Count", 3, 6);
        assertInteger("3", "Unique Supplemental (@2) Detail Record Count", 9, 6);
        assertInteger("4", "File Creation Date (CCYYMMDD)", 15, 8);
        assertInteger("5", "File Creation Time (HHMMSS)", 23, 6);
        assertText("6", "File Identifier Code", 29, 5);
        assertText("7", "Source Name", 34, 32);
        assertText("8", "Source ID", 66, 8);
        assertText("9", "Filler", 74, 2);
        assertText("10", "Source Non-ED Branch ID", 76, 4);
        assertText("11", "Recipient Name", 80, 32);
        assertText("12", "Recipient ID", 112, 8);
        assertText("13", "Filler", 120, 2);
        assertText("14", "Recipient Non-ED Branch ID", 122, 4);
        assertText("15", "DUNS Source ID", 126, 9);
        assertText("16", "DUNS Recipient ID", 135, 9);
        assertText("17", "Filler", 144, 336);
        assertText("18", "Record Terminator", 480, 1);
    }
}
