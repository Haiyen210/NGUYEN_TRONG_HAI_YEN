package entity;

public class Product {
	private int id;
	private String name;
	private float price;
	private float sale_price;
	private String description;
	private String image;
	private boolean status;

	public Product(String name, float price, float sale_price, String description, String image, boolean status) {
		super();
		this.name = name;
		this.price = price;
		this.sale_price = sale_price;
		this.description = description;
		this.image = image;
		this.status = status;
	}

	public Product(int id, String name, float price, float sale_price, String description, String image,
			boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sale_price = sale_price;
		this.description = description;
		this.image = image;
		this.status = status;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getSale_price() {
		return sale_price;
	}

	public void setSale_price(float sale_price) {
		this.sale_price = sale_price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
