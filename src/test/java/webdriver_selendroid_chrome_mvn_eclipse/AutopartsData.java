package webdriver_selendroid_chrome_mvn_eclipse;

public class AutopartsData {

	public AutopartsData(){
		
	}
	
	@Override
	public String toString(){
		return String.format("Vehicle: [%s] [%s] [%s] [%s] [%s]", catalog,year,make,model,engine);
	}
	public AutopartsData(String catalog, String year, String make, String Model, String engine){
		this.catalog=catalog;
		this.year=year;
		this.make=make;
		this.model=Model;
		this.engine=engine;
	}
	public AutopartsData(String[] data){
		this(data[0],data[1],data[2],data[3],data[4]);
	}
	
	private String catalog,year,make,model,engine;

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
}
