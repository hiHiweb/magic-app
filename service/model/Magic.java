package com.example.magic.model;

import java.util.List;

public class Magic {
		private String name;
		private List<String>keywords;
		public Magic(String name,List<String>keywords){this.name=name; this.keywords=keywords;}
		public String getName(){return name;}
		public List<String> getKeywords(){return keywords;}}
