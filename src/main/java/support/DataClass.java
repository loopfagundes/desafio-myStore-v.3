package support;

import java.io.File;
import java.util.Iterator;

public class DataClass {
    private FileOperations fileOperations = new FileOperations();
    private static final String csvFile = "src"
            + File.separator + "test"
            + File.separator + "resources"
            + File.separator + "data"
            + File.separator + "dataUser.csv";

    @org.testng.annotations.DataProvider(name="loginCsv")
    public Iterator<Object[]> loginCsv() {
        return fileOperations.parseCsvData(csvFile);
    }
}