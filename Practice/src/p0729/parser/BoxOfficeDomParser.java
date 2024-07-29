package p0729.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import p0729.dto.BoxOffice;

public class BoxOfficeDomParser implements BoxOfficeParser {

    private static BoxOfficeDomParser parser = new BoxOfficeDomParser();

    public static BoxOfficeDomParser getParser() {
        return parser;
    }

    private BoxOfficeDomParser() {
        System.out.println("DOM parser");
    }

    private List<BoxOffice> list;

    @Override
    public List<BoxOffice> getBoxOffice(InputStream resource) throws ParserConfigurationException, SAXException, IOException {
        list = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        // 문서 로딩 완료 --> 원하는 요소들 골라내기
        Document doc = builder.parse(resource);
        // 최 상위 element
        Element root = doc.getDocumentElement();
        parse(root);
        return list;
    }

    private void parse(Element root) {
        // TODO: root에서 dailyBoxOffice를 추출한 후 BoxOffice를 생성해 list에 저장하시오.
    	NodeList list = root.getElementsByTagName("dailyBoxOffice");
    	for(int i=0;i<list.getLength();i++) {
    		Node node = list.item(i);
    		this.list.add(getBoxOffice(node));
    	}
        // END
    }

    private static BoxOffice getBoxOffice(Node node) {
        // TODO: node 정보를 이용해서 BoxOffice를 구성하고 반환하시오.
    	NodeList list = node.getChildNodes();
    	int rank = -1, audiAcc = -1;
    	String movieNm = null, openDt=null;
    	for(int i=0;i<list.getLength();i++) {
    		Node child = list.item(i);
    		String nodeName = child.getNodeName();
    		String nodeValue = child.getTextContent();
    		
    		if(nodeName.equals("rank")) {
    			rank = Integer.parseInt(nodeValue);
    		}else if(nodeName.equals("openDt")) {
    			openDt = nodeValue;
    		}else if(nodeName.equals("audiAcc")) {
    			audiAcc = Integer.parseInt(nodeValue);
    		}
    	}
         return new BoxOffice(rank, movieNm, openDt, audiAcc);

        // END
    }
}
