import org.geotools.process.spatialstatistics.storage.ShapeFileEditor;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        File shp_file = new File(args[0]);
        String[] attrToRemove = new String[args.length - 1];
        System.arraycopy(args, 1, attrToRemove, 0, attrToRemove.length);
        new ShapeFileEditor().removeField(shp_file, shp_file, attrToRemove);
    }
}

