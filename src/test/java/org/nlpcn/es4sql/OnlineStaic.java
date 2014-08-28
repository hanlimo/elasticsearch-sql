package org.nlpcn.es4sql;

import java.io.IOException;

import org.elasticsearch.action.search.SearchResponse;
import org.nlpcn.es4sql.exception.SqlParseException;

public class OnlineStaic {
	public static void main(String[] args) throws IOException, SqlParseException {
		SearchDao searchDao = new SearchDao("localhost", 9300);
		SearchResponse select = searchDao.select("select avg(all_client),avg(all_tv_clinet) from online group by hours limit 100") ;
		
		System.out.println(select);
	}
}
