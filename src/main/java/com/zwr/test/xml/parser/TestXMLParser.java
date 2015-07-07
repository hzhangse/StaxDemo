package com.zwr.test.xml.parser;

public class TestXMLParser {

	public static void main(String[] args) {
		 Dom4jParser dom4j = new Dom4jParser();
		 dom4j.parseSmallFile();
		 dom4j.parseMiddleFile();
		 dom4j.parseBigFile();
		 Toolkit.printTimes();

		 SaxParser sax = new SaxParser();
		 sax.parseSmallFile();
		 sax.parseMiddleFile();
		 sax.parseBigFile();
		 Toolkit.printTimes();

		 DomParser dom = new DomParser();
		 dom.parseSmallFile();
		 dom.parseMiddleFile();
		 dom.parseBigFile();
		 Toolkit.printTimes();

		 JdomParser jdom = new JdomParser();
		 jdom.parseSmallFile();
		 jdom.parseMiddleFile();
		 jdom.parseBigFile();
		 Toolkit.printTimes();

		 StaxStreamParser stream = new StaxStreamParser();
		 stream.parseSmallFile();
		 stream.parseMiddleFile();
		 stream.parseBigFile();
		 Toolkit.printTimes();

		StaxEventParser event = new StaxEventParser();
		event.parseSmallFile();
		event.parseMiddleFile();
		event.parseBigFile();
		Toolkit.printTimes();
	}

}
