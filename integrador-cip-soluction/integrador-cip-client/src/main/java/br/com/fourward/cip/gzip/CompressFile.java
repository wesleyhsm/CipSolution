package br.com.fourward.cip.gzip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.springframework.stereotype.Component;

@Component
public class CompressFile {
	
	public void fileToZip(String inputFile, String outputFile) throws IOException {		
        GZIPOutputStream gzos = null;
        BufferedInputStream bis = null;
        byte[] buffer = new byte[10 * 1024];
        try {
            int nBytes;
            bis = new BufferedInputStream(new FileInputStream(inputFile));
            gzos = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)));
            while ((nBytes = bis.read(buffer)) > 0)
                gzos.write(buffer, 0, nBytes);
        } finally {
            gzos.close();
            bis.close();
        }
    }
    
    public byte[] memoryToZip(String inputFile) throws IOException {
        GZIPOutputStream gzos = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedInputStream bis = null;
        byte[] buffer = new byte[10 * 1024];
        try {
            int nBytes;
            bis = new BufferedInputStream(new FileInputStream(inputFile));
            gzos = new GZIPOutputStream(baos);
            while ((nBytes = bis.read(buffer)) > 0)
                gzos.write(buffer, 0, nBytes);
        } finally {
            gzos.close();
            bis.close();
        }
        return baos.toByteArray();
    }
    
    public void zipToFile(String inputFile, String outputFile) throws IOException {
    	GZIPInputStream in = null;
        OutputStream out = null;
       
    	try {
    		in = new GZIPInputStream(new FileInputStream(inputFile));
            out = new FileOutputStream(outputFile);
	        byte[] buf = new byte[10 * 1024];
	        int len;
	        while ((len = in.read(buf)) > 0) 
	            out.write(buf, 0, len);
	    } finally {	       
	    	in.close();
	    	out.close();
	    } 
    }
    
    public String nameFileZip(final String localeFile, final String nameFile){
    	return String.format("%s\\%s.%s", localeFile, nameFile, "gz");
    }
}
