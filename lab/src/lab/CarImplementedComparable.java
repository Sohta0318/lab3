package lab;



public class CarImplementedComparable implements Comparable<CarImplementedComparable> {//[20]
    private String make;//[21]
    private String model;//[22]
    private int year;
    public CarImplementedComparable(String make,String model, int year) {//[23]
        this.make = make;//[24]
        this.model = model;//[25]
        this.year = year;
    }
  
	public int year() {//[26]
        return this.year;//[27]
    }
    public String make() {//[28]
        return this.make;//[29]
    }
    public String model() {//[28]
        return this.model;//[29]
    }
    @Override
    public int compareTo( CarImplementedComparable car ){//[11]
        return this.year() - car.year();//[12]
    }
} 

