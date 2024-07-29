package p0729.parser;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import p0729.dto.BoxOffice;


public class BoxOfficeJsonParser implements BoxOfficeParser {

    private static BoxOfficeJsonParser parser = new BoxOfficeJsonParser();

    public static BoxOfficeJsonParser getParser() {
        return parser;
    }

    private BoxOfficeJsonParser() {
        System.out.println("json");
    }

    private List<BoxOffice> list;

    @Override
    public List<BoxOffice> getBoxOffice(InputStream resource) throws JsonParseException, JsonMappingException, IOException  {
        list = new ArrayList<>();
        // TODO: json을 파싱해서 list를 구성하시오.
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Map<String, Object>> result = mapper.readValue(resource, new TypeReference<>(){
        	
        });
        List<Map<String, Object>> officelist = (List)result.get("boxOfficeResult").get("dailyBoxOfficeList");
        
        list = officelist.stream().map(info -> mapper.convertValue(info, BoxOffice.class)).collect(Collectors.toList());
        // END
        return list;
    }
}
