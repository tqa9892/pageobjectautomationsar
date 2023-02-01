package utilities;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyFileReader {
    Properties prop;

    public propertyFileReader() {
        File f = new File("./propFile/propertyread.properties");
        try {
            FileInputStream fis = new FileInputStream(f);
            prop = new Properties();
            prop.load(fis);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public String getUrl (){
       String burl = System.getProperty("burl");
        return burl ;
    }
    public String getuname () {
        String uname = System.getProperty("uname");
        return uname ;
    }

    public String getUpass () {
        String upass = System.getProperty("upass");
        return upass ;
    }

}