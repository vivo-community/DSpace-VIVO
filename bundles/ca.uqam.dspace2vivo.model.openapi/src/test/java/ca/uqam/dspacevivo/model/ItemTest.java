/**
 * 
 */
package ca.uqam.dspacevivo.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.core.util.ResourceUtils;
import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.media.ComposedSchema;
import io.swagger.v3.oas.models.media.Encoding;
import io.swagger.v3.oas.models.media.EncodingProperty;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * @author heon
 *
 */
public class ItemTest {

	@Test
	public void test() throws IOException {
		
		// Convert JSON string from file to Object
		ObjectMapper mapper = new ObjectMapper();
        String json = ResourceUtils.loadClassResource(getClass(), "anItem.json");
        ObjectMapper objectMapper = new ObjectMapper();
        
        Item item = objectMapper.readValue(json, Item.class);
        // compact print
        System.out.println(item);

        // pretty print
        String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(item);

        System.out.println(prettyStaff1);//
//		// Convert JSON string to Object
//		String jsonInString = "{\"age\":33,\"messages\":[\"msg 1\",\"msg 2\"],\"name\":\"mkyong\"}";
//		User user1 = mapper.readValue(jsonInString, User.class);
//		System.out.println(user1);
//        JsonNode result = Json.mapper().readTree(json);
//      Item anItem = Json.mapper().readValue(result, Item.class);
//        Statement statment = Json.mapper().readValue(json, Statement.class);
//        System.out.println(anItem.toString());
//        final String outputStream = OutputReplacer.OUT.run(new OutputReplacer.Function() {
//            @Override
//            public void run() {
//                Json.prettyPrint(anItem);
//            }
//        });
//        
System.out.println("Done");
	}

}
