package com.fsd.sba.controller;


import com.fsd.sba.entity.IPODetailEntity;
import com.fsd.sba.service.IpoService;
import com.fsd.sba.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/admin/manage/ipo")
public class IPOController {

	@Autowired
	private IpoService service;

	/**
	 * create ipo
	 * @param ipo
	 * @return
	 */
	@PostMapping
	public CommonResult createIPO(@RequestBody IPODetailEntity ipo) {
		return service.save(ipo);
	}

	/**
	 * update ipo
	 * @param ipo
	 * @return
	 */
	@PutMapping
	public CommonResult updateIPO(@RequestBody IPODetailEntity ipo) {
		return service.updateStockExchange(ipo);
	}
}
