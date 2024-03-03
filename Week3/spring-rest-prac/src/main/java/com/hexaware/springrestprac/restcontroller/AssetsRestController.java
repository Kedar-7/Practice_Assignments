package com.hexaware.springrestprac.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestprac.entity.Assets;
import com.hexaware.springrestprac.service.IAssetsService;


@RestController
@RequestMapping("/api/assets")
public class AssetsRestController {
	@Autowired
	IAssetsService service;
	
	@GetMapping("/getall")
	public List<Assets> getAll(){
		return service.getAllAssets();
	}
	
	@PostMapping("/add")
	public Assets insertAssets(@RequestBody Assets asset) {
		return service.addAssets(asset);
	}
	@PutMapping("/update")
	public Assets updateAssets(@RequestBody  Assets asset) {
		return service.updateAssets(asset);
	}
	
	@GetMapping("/getbyid/{assetId}")
	public Assets getAssetById(@PathVariable int assetId) {
		return service.getAssetById(assetId);
	}
	
	@DeleteMapping("/delete/{assetId}")
	public String deleteAssetById(@PathVariable int assetId) {
		return service.deleteAssetById(assetId);
		
	}
}
