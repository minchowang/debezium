import org.rocksdb.RocksDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        ensureRocksDBIsLoaded("/tmp");
    }


    static void ensureRocksDBIsLoaded(String tempDirectory) {
        final File tempDirParent = new File(tempDirectory).getAbsoluteFile();
        LOGGER.info(
                "Attempting to load RocksDB native library and store it under '{}'",
                tempDirParent);

        // this initialization here should validate that the loading succeeded
        RocksDB.loadLibrary();

        // seems to have worked
        LOGGER.info("Successfully loaded RocksDB native library");
    }
}
