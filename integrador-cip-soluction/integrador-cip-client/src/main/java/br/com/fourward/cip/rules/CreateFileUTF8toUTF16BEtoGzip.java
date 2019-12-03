
package br.com.fourward.cip.rules;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Component
public class CreateFileUTF8toUTF16BEtoGzip {

	@Autowired
	private CreateFolderFileRules createFolderFileRules;

	public void createFile(final Object registerType) throws IOException {
		final XmlMapper xmlMapper = new XmlMapper();
		final String xml = xmlMapper.writeValueAsString(registerType);

		final String name = getTagValue(xml, "<NomArq>");

		final byte[] bytes = xml.getBytes(StandardCharsets.UTF_16BE);
		final String stringUTF16 = new String(bytes);

		createFolderFileRules.createFileFolder(stringUTF16, name);
	}

	public String getTagValue(final String xml, final String tag) {
		final String closeTag = new StringBuffer(tag).insert(1, "/").toString();
		final int from = xml.indexOf(tag) + tag.length();
		final int to = xml.indexOf(closeTag);
		return xml.substring(from, to);
	}
}
