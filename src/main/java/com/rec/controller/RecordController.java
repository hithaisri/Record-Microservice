package com.rec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rec.entity.Record;
import com.rec.service.IRecordService;

@RestController
@RequestMapping("/record")
public class RecordController {
	
	@Autowired
	IRecordService recordService;
	
	
	@GetMapping("/emp/{eid}")
	public List<Record> getAllRecords(@PathVariable("eid") Long eid){
		return this.recordService.getRecordOfEmployee(eid);
		}

}
