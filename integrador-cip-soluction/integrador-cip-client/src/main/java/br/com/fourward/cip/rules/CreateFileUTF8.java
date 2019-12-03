
package br.com.fourward.cip.rules;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Component
public class CreateFileUTF8 {

	@Autowired
	private CreateFolderFileRules createFolderFileRules;

	public void createFile(final Object registerType, final String fileName) throws IOException {
		final XmlMapper xmlMapper = new XmlMapper();
		final String xml = xmlMapper.writeValueAsString(registerType);

		final byte[] bytes = xml.getBytes(StandardCharsets.UTF_8);
		final String stringUTF8 = new String(bytes);

		createFolderFileRules.createFileFolder(stringUTF8, fileName);
	}

	public String getTagValue(final String xml, final String tag) {
		final String closeTag = new StringBuffer(tag).insert(1, "/").toString();
		final int from = xml.indexOf(tag) + tag.length();
		final int to = xml.indexOf(closeTag);
		return xml.substring(from, to);
	}
}
