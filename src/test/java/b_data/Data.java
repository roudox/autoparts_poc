package b_data;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {

	List<AutopartsData> data=new ArrayList<AutopartsData>();
	Random rnd=new java.util.Random();
	
	public Data(){
		try {
			readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void readData() throws IOException, URISyntaxException{
		
		//Read all lines
		List<String>entries=
		java.nio.file.Files.readAllLines( java.nio.file.Paths.get(this.getClass().getResource("datafile").toURI())  );
		
		for(String line :entries){
			data.add(new AutopartsData(line.split("[|]")));
			
		}		
		
	}
	
	public int size(){
		return data.size();
	}
	
	public AutopartsData get(int index){
		return data.get(index);
	}
	
	public AutopartsData getNext(){
		
	return	data.get( rnd.nextInt(data.size()) );
		
	}
	
	
	
}
