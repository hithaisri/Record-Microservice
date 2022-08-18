package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService{

	
	List<Record> records=List.of(new Record(1L,"tatamotors@gmail.com","Tata Motors",1111L),
			new Record(2L,"itc@gmail.com","ITC Limited",1112L),
			new Record(3L,"hm@gmail.com","H & M",1113L),
			new Record(4L,"mahindra@gmail.com","Mahindra",1111L),
			new Record(5L,"tcs@gmail.com","TCS",1114L),
			new Record(6L,"infosys@gmail.com","Infosys",1114L),
			new Record(7L,"techm@gmail.com","Tech mahindra",1115L),
			new Record(8L,"cts@gmail.com","CTS",1115L)); 
	
	@Override
	public List<Record> getRecordOfEmployee(Long eid) {
		return records.stream().filter(record->record.geteId().equals(eid)).collect(Collectors.toList());
	}

}
