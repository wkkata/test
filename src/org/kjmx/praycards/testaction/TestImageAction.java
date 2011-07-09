package org.kjmx.praycards.testaction;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import com.opensymphony.xwork2.ActionSupport;

public class TestImageAction extends ActionSupport{
	
	private ByteArrayInputStream inputStream;
	
	@Override
	public String execute() throws Exception {
		int width = 900;
		int height = 300;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		Graphics g = image.getGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);
		File imgFile = new File("c:/test.jpg");
		Image _2dImage = ImageIO.read(imgFile);
		
		g.drawImage(_2dImage, 10, 10, 300, 100, null);
		g.setFont(new Font("ËÎÌו", Font.BOLD, 20));
		g.setColor(Color.black);
		
		g.drawString("testTest", 500, 100);
		g.dispose();
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();  
        ImageOutputStream imageOut = ImageIO.createImageOutputStream(output);  
        ImageIO.write(image, "JPEG", imageOut);  
        imageOut.close();  
        ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());  
        
        this.setInputStream(input);  
		return super.execute();
	}

	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}

	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}
}
