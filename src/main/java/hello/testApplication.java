package hello;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class testApplication {

	
	public static void main(String args[]){
		
		String request="{ \"dataList\" : [ { \"API_ORIGIN\" : \"AAT\" }], \"errorList\":[] }";
		
		ObjectMapper JsonToDTOMapper = new ObjectMapper();
		try {
			ResponseTest obj=JsonToDTOMapper.readValue(request,ResponseTest.class);
			
			Data[] a=obj.getDataList();
			System.out.println(a[0].getApiOrigin());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
