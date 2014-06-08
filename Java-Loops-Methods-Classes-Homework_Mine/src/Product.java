class Product implements Comparable<Product> {
	private double price;
	private String name;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Product price) {
		double otherPrice = ((Product) price).getPrice();
		
		if (this.price > otherPrice) {
			return 1;
		} else if (this.price == otherPrice) {
			return 0;
		} else {
			return -1;
		}
	}
}