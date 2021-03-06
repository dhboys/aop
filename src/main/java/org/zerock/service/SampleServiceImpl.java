package org.zerock.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.mapper.SampleMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

	private final SampleMapper mapper;
	
	@Transactional
	@Override
	public String doA() {
		log.info("doA....................");
		
		String str = "F동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
		
		mapper.insert1(str);
		mapper.insert2(str);
		
		return "doA";
	}

	@Override
	public String doB() {
		log.info("doB....................");
		return "doB";
	}

	@Override
	public String doC() {
		log.info("doC....................");
		return "doC";
	}

}
