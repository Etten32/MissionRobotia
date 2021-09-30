// J+M+J
// To manage data file inputs
public class DataFile {
    // to hold fileName
    String fileName;
    // to hold all data contents
    String[] dataLines;
    // pointer to current line
    int linePointer = 0;

    // Constructor - takes fileName
    public void DataFile(String fileName){
        this.fileName = fileName;
    }

    //// VERSIONING
    // check file -R- check if file exists

    // create file - makes file called name

    // fill file - fills / resets file with default

    // setup - runs check file ? continue: createFile(); fillFile();


    //// DATA PROCESSING

    // load data - loads raw data out of file fileName into dataLines[]
    public void loadData(){

    }

    // decrypt data - checks for encryption, and decrypts data in dataLines[] if encrypted

    // filter data - removes all non-data text from dataLines[] and consolidates data into smaller array

    // process data - combination of load, decrypt, and filter data


    //// DATA RETRIEVING

    // has next -R- checks if pointer is at the end

    // same line -R- returns line at pointer

    // next line -R- moves pointer +=1 and returns line

    // reset pointer - resets pointer to zero

}
