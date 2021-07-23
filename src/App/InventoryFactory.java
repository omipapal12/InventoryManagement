package App;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Model.Pulse;
import Model.Rice;
import Model.Wheat;

public class InventoryFactory {
	static ObjectMapper mapper = new ObjectMapper();

	public static Object getInstance(String type, String jsonValue) throws JsonMappingException, JsonProcessingException {
	if("Rice".equalsIgnoreCase(type)) {
	return mapper.readValue(jsonValue, Rice.class);
	}
	else if("Pulse".equalsIgnoreCase(type)) {
	return mapper.readValue(jsonValue, Pulse.class);
	}
	else if("Wheat".equalsIgnoreCase(type)) {
	return mapper.readValue(jsonValue, Wheat.class);
	}
	return null;

	}
}
