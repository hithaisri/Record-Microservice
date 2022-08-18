package com.rec.service;

import java.util.List;

import com.rec.entity.Record;

public interface IRecordService {

	public List<Record> getRecordOfEmployee(Long Cid);
}
