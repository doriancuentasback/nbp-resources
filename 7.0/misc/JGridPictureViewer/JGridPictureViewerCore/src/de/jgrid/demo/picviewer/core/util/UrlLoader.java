package de.jgrid.demo.picviewer.core.util;

import java.io.IOException;
import java.net.URL;

public class UrlLoader {

    private static UrlLoader instance;

    private UrlLoader() {

    }

    public static UrlLoader getInstance() {
        if (instance == null) {
            instance = new UrlLoader();
        }
        return instance;
    }
	
	 public URL load(String path) throws IOException {
	        URL url = ClassLoader.getSystemClassLoader().getResource(path);
	        if (url == null) {
	            // Fuer den Gebrauch mit Jars
	            url = this.getClass().getResource(path);
	        }
	        if (url == null) {
	            url = ClassLoader.getSystemResource(path);
	        }
	        if (url == null) {
	        }
	        return url;
	    }
}
