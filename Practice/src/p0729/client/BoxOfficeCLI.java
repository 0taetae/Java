package p0729.client;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import p0729.dto.BoxOffice;
import p0729.parser.BoxOfficeDomParser;
import p0729.parser.BoxOfficeJsonParser;
import p0729.parser.BoxOfficeParser;
import p0729.parser.BoxOfficeSaxParser;

public class BoxOfficeCLI {
    private BoxOfficeParser parser = null;
    private InputStream resource = null;

    public BoxOfficeCLI() {

    }

    public Optional<List<BoxOffice>> readBoxOfficeList(char type) throws Exception {
        // TODO: resource와 parser를 구성해서 정보를 가져와보자.
    	if(type=='S') {
    		this.resource = BoxOfficeCLI.class.getResourceAsStream("../res/boxoffice.json");
    		this.parser = p0729.parser.BoxOfficeJsonParser.getParser();
    	}
        // END
		return Optional.ofNullable(this.parser.getBoxOffice(resource));

    }

    public static void main(String[] args) {
        BoxOfficeCLI cli = new BoxOfficeCLI();
        try {
            Optional<List<BoxOffice>> result = cli.readBoxOfficeList('S');
            result.ifPresentOrElse(list -> list.forEach(System.out::println), () -> System.out.println("unknown type"));
        } catch (Exception e) {
            System.out.println("오류 발생!: " + e.getMessage());
        }
    }
}
