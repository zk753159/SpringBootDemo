package com.zkk.springBootStudy.myconfig;

import org.springframework.boot.SpringBootConfiguration;

import com.zkk.springBootStudy.model.EncodingConvert;
import com.zkk.springBootStudy.model.GBKEncodingConvert;
import com.zkk.springBootStudy.model.UTF8EncodingConvert;

@SpringBootConfiguration
public class EncodingConvertConfig {

	public EncodingConvert createUTF8EncodingConvert() {
		return new UTF8EncodingConvert();
	}
	
	public EncodingConvert createGBKEncodingConvert() {
		return new GBKEncodingConvert();
	}
}
