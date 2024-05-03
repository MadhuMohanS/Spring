package springpractise;

import java.awt.image.renderable.ParameterBlock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Panasonic implements Television{
	
	@Autowired
	private Screen screen;
	
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen=screen;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("running display in Panasonic");
		System.out.println(screen);
		
	}

}
