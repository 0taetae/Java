package p0729.parser;

import java.io.InputStream;
import java.util.List;

import p0729.dto.BoxOffice;


public interface BoxOfficeParser {

    public abstract List<BoxOffice> getBoxOffice(InputStream resource) throws Exception;
}
