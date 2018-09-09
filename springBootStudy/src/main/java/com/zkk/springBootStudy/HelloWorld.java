package com.zkk.springBootStudy;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zkk.springBootStudy.model.ModelRes;

@RestController
public class HelloWorld {
	
	@Value("${cupSize}")
	private String cupSize;
	
	@Value("${age}")
	private int age;
	
	@Autowired
	private GirlProperties girlProperties;
	
//	@RequestMapping(value ="/hello", method = RequestMethod.GET)
	@GetMapping(value="/hello")
	public String say(@RequestParam("id") String id){
		return "id:" + id;
	}
	
	@RequestMapping(value = "json")
	public ModelRes getJson(String id) throws JSONException{
		System.out.println(id);
		ModelRes modelRes = new ModelRes();
		modelRes.setAge("19");
		modelRes.setId("132");
		modelRes.setName("zhangsan");
		
		return modelRes;
	}
}
