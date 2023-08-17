package com.ApiDemo.SpringApiService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiDemo.SpringApiModel.MobileStore;

@RestController
@RequestMapping("/mobile")
public class MobileService {
	
	MobileStore mobileStore;
	
	@GetMapping("(imei)")
	public MobileStore getMobileDetails(String imei) {
		return mobileStore;
		//return new MobileStore("m33","mi","poco",10500); 	
	}
	
	@PostMapping
	public String createMobileDetails(@RequestBody MobileStore mobileStore) {
		this.mobileStore = mobileStore;
		return "Mobile details Created Successfully";
	}
	
	@PutMapping
	public String updateMobileDetails(@RequestBody MobileStore mobileStore) {	
		this.mobileStore = mobileStore;
		return "Mobile details Updated Successfully";
		
	}
	
	@DeleteMapping("(imei)")
	public String deleteMobileDetails( String imei) {
		this.mobileStore = null;
		return "Mobile Details Deleted Successfully..";
	}
}
