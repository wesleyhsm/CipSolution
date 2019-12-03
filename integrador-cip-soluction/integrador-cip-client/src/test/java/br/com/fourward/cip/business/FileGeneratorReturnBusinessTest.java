package br.com.fourward.cip.business;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fourward.cip.Application;
import br.com.fourward.cip.gzip.CompressFile;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class FileGeneratorReturnBusinessTest {

	@Autowired
	private CompressFile compressFile;
	
	@Test
	public void teste() throws IOException {
		final String local = "C:/Users/Wesley/Documents/cip/retorno/antecipation"; 
		
		File pasta = new File(local);
		File[] lista = pasta.listFiles();

		for (File file : lista) {		
			final String nameFileZip = file.getName();		    		    
		    final String nameFile = nameFileZip.substring(0, (nameFileZip.length() - 3)) + ".xml"; 
		    
		    final String zip = local  + "/" + nameFileZip;
		    final String xml = local + "/" + nameFile;
		    	    	    	
		    System.out.println("zip: " + zip);
		    System.out.println("xml: " + xml);
		    
			compressFile.zipToFile(zip, xml);
						
			Stream<String> stream = Files.lines(Paths.get(xml));

			stream.forEach(xmlFinal -> {
				final byte[] bytes = xmlFinal.getBytes(StandardCharsets.UTF_8);
				final String stringUTF8 = new String(bytes);
				
				System.out.println("XML: " + stringUTF8);				
			});			
		}		
	}
}
