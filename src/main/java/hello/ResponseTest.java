package hello;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ResponseTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Data[] dataList;


	public Data[] getDataList() {
		return dataList;
	}


	public void setDataList(Data[] dataList) {
		this.dataList = dataList;
	}


	@Override
	public String toString() {
		return "ResponseTest [dataList=" + Arrays.toString(dataList) + "]";
	}
	
	
	
	
	
}
