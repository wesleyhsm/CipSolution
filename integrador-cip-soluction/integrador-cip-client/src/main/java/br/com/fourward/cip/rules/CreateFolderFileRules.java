
package br.com.fourward.cip.rules;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fourward.cip.gzip.CompressFile;

@Component
public class CreateFolderFileRules {

	@Autowired
	private CompressFile compressFile;

	public void zipToFile(final String zip, final String xml) throws IOException {
		compressFile.zipToFile(zip, xml);
	}

	public void copyFile(final File source, final File destiny) throws IOException {
		final InputStream in = new FileInputStream(source);
		final OutputStream out = new FileOutputStream(destiny);

		final byte[] buf = new byte[10 * 1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}

		in.close();
		out.close();
	}

	public void createFileFolder(final String textFile, final String nameFile) throws IOException {
		final String typeFile = nameFile.substring(0, 1);
		createFileFolderComplete(textFile, nameFile, typeFile);
	}

	private void createFileFolderComplete(final String textFile, final String nameFile, final String typeFile)
			throws IOException {
		final Map<String, String> paths = localeFolderSendReturn();
		final String dir = paths.get(typeFile);
		final String localeFolderCreateFileName = getLocaleFolderFile(dir, nameFile);

		createFile(textFile, localeFolderCreateFileName);
	}

	public void createFile(final String textFile, final String localeFile) throws IOException {
		final File file = new File(localeFile);
		final FileWriter arquivo = new FileWriter(file);
		arquivo.write(textFile);
		arquivo.close();
	}

	private String getLocaleFolderFile(final String localeFolder, final String nameFile) {
		return String.format("%s\\%s.%s", localeFolder, nameFile, "xml");
	}

	public void createFolderSendReturn() throws IOException {
		final Map<String, String> paths = localeFolderSendReturn();
		createFolder(paths);
	}

	private void createFolder(final Map<String, String> paths) {
		for (final String key : paths.keySet()) {

			final String dir = paths.get(key);
			final File folder = new File(dir);

			if (!folder.exists()) {
				folder.mkdirs();
			}
		}
	}

	public Map<String, String> localeFolderSendReturn() throws IOException {
		final Map<String, String> mapaNomes = new HashMap<>();

		final Properties props = new Properties();
		props.load(getClass().getResourceAsStream("/config/config.properties"));

		mapaNomes.put("1", props.getProperty("cip.dir.send.credit"));
		mapaNomes.put("3", props.getProperty("cip.dir.send.debit"));
		mapaNomes.put("5", props.getProperty("cip.dir.send.antecipation"));
		mapaNomes.put("BACKUPENVIO", props.getProperty("cip.dir.send.backup"));

		mapaNomes.put("2", props.getProperty("cip.dir.return.credit"));
		mapaNomes.put("4", props.getProperty("cip.dir.return.debit"));
		mapaNomes.put("6", props.getProperty("cip.dir.return.antecipation"));
		mapaNomes.put("BACKUPRETURN", props.getProperty("cip.dir.return.backup"));

		return mapaNomes;
	}
}
