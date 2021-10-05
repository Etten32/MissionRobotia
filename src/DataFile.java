// J+M+J
// To manage data file inputs
public class DataFile {
    private final static String VERSIONFILE = "version.txt";
    // to hold fileName
    private String fileName;
    // to hold all data contents
    private String[] dataLines;
    // pointer to current line
    private int linePointer = 0;

    // Constructor - takes fileName
    public void DataFile(String fileName){
        this.fileName = fileName;
    }

    //// VERSIONING
    // check file -R- check if file exists
    public boolean checkForFile(){
        return false;
    }

    // create file - makes file called name
    public void makeFile(){

    }

    // fill file - fills / resets file with default
    public void fillFile(){

    }

    // setup - runs check file ? continue: createFile(); fillFile();
    public void setupFile(){

    }


    //// DATA PROCESSING

    // load data - loads raw data out of file fileName into dataLines[] INCOMPLETE
    public void loadData(){

    }

    // decrypt data - checks for encryption, and decrypts data in dataLines[] if encrypted INCOMPLETE
    public void decryptData(){

    }

    // filter data - removes all non-data text from dataLines[] and consolidates data into smaller array INCOMPLETE
    public void filterData(){

    }

    // process data - combination of load, decrypt, and filter data
    public void processData(){
        loadData();
        decryptData();
        filterData();
    }

    // reset data - resets dataLines to empty array and resets pointer // CHOP-BLOCK
    public void resetData(){
        dataLines = new String[0];
        resetPointer();
    }

    //// DATA RETRIEVING

    // has next -R- checks if pointer is at the end INCOMPLETE
    public boolean atEnd(){
        return true;
    }

    // read same line -R- returns line at pointer INCOMPLETE
    public String readSame(){
        return null;
    }

    // read next line -R- moves pointer +=1 and returns line INCOMPLETE
    public String readNext(){
        return null;
    }

    //// POINTER

    // reset pointer - resets pointer to zero
    public void resetPointer(){
        linePointer = 0;
    }

    // increment pointer - increments pointer by 1
    public void incPointer(){
        linePointer++;
    }

    //// DATA INPUT
    // write same line - writes line inputted at pointer
    public void writeSame(String inputLine){

    }

    // write next line - moves pointer += 1 and writes line inputted
    public void writeNext(String inputLine){

    }

    //// VERSIONING FILE
    // verify versioning - checks for version file ? continues: makes file INCOMPLETE
    public static void verifyVersioning(){
        // checks for versioning file
        /// creates and sets up new one if false

    }
    private static void fillVersioningFile(){

    }

}
