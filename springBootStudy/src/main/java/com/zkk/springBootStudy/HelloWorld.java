package com.zkk.springBootStudy;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zkk.springBootStudy.model.ModelRes;

@RestController
public class HelloWorld {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${cupSize}")
	private String cupSize;

	@Value("${age}")
	private int age;

	@Autowired
	private GirlProperties girlProperties;

	// @RequestMapping(value ="/hello", method = RequestMethod.GET)
	@GetMapping(value = "/hello")
	public String say(@RequestParam("id") String id) {
		return "id:" + id;
	}

	@RequestMapping(value = "json")
	public ModelRes getJson(String id) throws JSONException {
		System.out.println(id);
		ModelRes modelRes = new ModelRes();
		modelRes.setAge("19");
		modelRes.setId("132");
		modelRes.setName("zhangsan");

		return modelRes;
	}

	@RequestMapping(value = "/getPeople")
	public List<Map<String, Object>> getDbType() {
		String sql = "select * from people";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> map : list) {
			Set<Entry<String, Object>> entries = map.entrySet();
			if (entries != null) {
				Iterator<Entry<String, Object>> iterator = entries.iterator();
				while (iterator.hasNext()) {
					Entry<String, Object> entry = (Entry<String, Object>) iterator
							.next();
					Object key = entry.getKey();
					Object value = entry.getValue();
					System.out.println(key + ":" + value);
				}
			}
		}
		return list;
	}
}
