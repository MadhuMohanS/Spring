package springpractise;

import org.springframework.stereotype.Component;

@Component
public class Screen {
private String name;
private double cost;

public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}

public void setCost(double cost) {
	this.cost=cost;
}
public double getCost() {
	return cost;
}
@Override
public String toString() {
	return "Screen is working";
}


}
