package org.kjmx.praycards.testaction;

import com.opensymphony.xwork2.ActionSupport;

public class TestUploadImageAction  extends ActionSupport{
	private String result;

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}
	
	private String image;
	
	public String test(){
		System.out.println(image);
		
		this.result = "test";
		
		return null;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


}
