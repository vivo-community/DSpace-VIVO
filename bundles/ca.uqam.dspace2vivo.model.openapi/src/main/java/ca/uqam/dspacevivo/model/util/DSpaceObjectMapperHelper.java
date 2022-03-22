/**
 * 
 */
package ca.uqam.dspacevivo.model.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uqam.dspacevivo.model.Repository;

/**
 * @author heon
 *
 */
public class DSpaceObjectMapperHelper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static String map(Repository repo) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(repo);
		return prettyStaff1;
	}
}
