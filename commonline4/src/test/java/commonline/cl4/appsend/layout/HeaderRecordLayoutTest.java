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
package commonline.cl4.appsend.layout;

import flapjack.layout.RecordLayout;
import commonline.test.layout.AbstractRecordLayoutTestCase;


public class HeaderRecordLayoutTest extends AbstractRecordLayoutTestCase {
    protected RecordLayout createRecordLayout() {
        return new HeaderRecordLayout();
    }

    protected int recordLength() {
        return 880;
    }

    protected int fieldCount() {
        return 24;
    }

    protected String recordCode() {
        return "@H";
    }

    public void test_fieldDefinitions() {
        assertText("1", "Record Code", 1, 2);
        assertText("2", "Software Product Code", 3, 4);
        assertText("3", "Software Version", 7, 4);
        assertText("4", "Batch ID", 11, 12);
        assertInteger("5", "File Creation Date (CCYYMMDD)", 23, 8);
        assertInteger("6", "File Creation Time (HHMMSS)", 31, 6);
        assertInteger("7", "File Transmission Date (CCYYMMDD)", 37, 8);
        assertInteger("8", "File Transmission Time (HHMMSS)", 45, 6);
        assertText("9", "File Identifier Name", 51, 19);
        assertText("10", "File Identifier Code", 70, 5);
        assertText("11", "Source Name", 75, 32);
        assertText("12", "Source ID", 107, 8);
        assertText("13", "Filler", 115, 2);
        assertText("14", "Source Non-ED Branch ID", 117, 4);
        assertText("15", "Source Type Code", 121, 1);
        assertText("16", "Recipient Name", 122, 32);
        assertText("17", "Recipient ID", 154, 8);
        assertText("18", "Filler", 162, 2);
        assertText("19", "Recipient Non-ED Branch ID", 164, 4);
        assertText("20", "Media Type Code", 168, 1);
        assertText("21", "DUNS Source ID", 169, 9);
        assertText("22", "DUNS Recipient ID", 178, 9);
        assertText("23", "Filler", 187, 693);
        assertText("24", "Record Terminator", 880, 1);
    }
}
