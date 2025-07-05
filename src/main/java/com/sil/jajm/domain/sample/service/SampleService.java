package com.sil.jajm.domain.sample.service;

import com.sil.jajm.domain.sample.mapper.SampleMapper;
import com.sil.jajm.domain.user.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SampleService {

    private final SampleMapper sampleMapper;

    public Page<UserDto.Response> findUserAll(UserDto.Search search) {
        // Search 정보로 Pageable 객체 생성
        Pageable pageable = PageRequest.of(
                search.getPage(),
                search.getSize(),
                search.isDesc() ? Sort.Direction.DESC : Sort.Direction.ASC,
                search.getSortBy()
        );
        return sampleMapper.findUserAll(pageable);
    }
}
