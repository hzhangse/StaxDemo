package com.zwr.test.xml.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * SAX解析器
 * 
 * 
 * 
 */
public class SaxParser extends DefaultHandler implements Parser {

	@Override
	public String getName() {
		return "SaxParser";
	}

	// 解析
	public void parse(String xmlFile) {
		SAXParserFactory f = SAXParserFactory.newInstance();
		try {
			SAXParser sp = f.newSAXParser();
			sp.parse(new File(xmlFile), new SaxParser());
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseAndTime(String xmlFile) {
		Toolkit.startTime(this);
		parse(xmlFile);
		Toolkit.endTime(this);
	}

	@Override
	public void parseBigFile() {
		parseAndTime(Constants.BIG_XML_FILE);
	}

	@Override
	public void parseMiddleFile() {
		parseAndTime(Constants.MIDDLE_XML_FILE);
	}

	@Override
	public void parseSmallFile() {
		parseAndTime(Constants.SMALL_XML_FILE);
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attrs) {
		if ("user".equalsIgnoreCase(qName)) {
			System.out.println("Name:" + attrs.getValue("name") + ";age="
					+ attrs.getValue("age") + ";gender="
					+ attrs.getValue("gender"));
		}
	}
}
