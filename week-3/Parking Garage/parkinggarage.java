import java.util.List;
import java.util.ArrayList;

public class ParkingGarage
{
	
	private String name;
	private String address;
	private int capacity;
	private Set<Car> cars;

	public ParkingGarage(String name, String address, int capacity)
	{
		this.name=name;
		this.address=address;
		this.capacity=capacity;
		this.cars=new ArrayList<>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	
	public Set<Car> getCars()
	{
		return this.cars;
	}
	
	public void setCars(Set<Car> cars)
	{
		this.cars=cars;
	}
	
	public void addCar(Set<Car> cars) 
	{
        this.cars.add(car);
    }
	
	public static int getAmountOfWhiteCars() 
	{
		return (int) cars.stream()
			.filter(car -> "white".equalsIgnoreCase(car.color()))
			.count();
	}
	
	public void removeCar(String licensePlate) 
	{
		this.car = null;
	}
}