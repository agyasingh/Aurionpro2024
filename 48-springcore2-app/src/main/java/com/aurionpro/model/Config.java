package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable

//jis class ka object banana hai woh aayega Component Scan me

@ComponentScan(basePackages="com.aurionpro.model")//it will find components> automatic object creation
public class Config {
	
	

}
