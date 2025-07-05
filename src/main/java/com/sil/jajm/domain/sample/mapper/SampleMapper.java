package com.sil.jajm.domain.sample.mapper;

import com.sil.jajm.domain.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Mapper
public interface SampleMapper {
    Page<UserDto.Response> findUserAll(Pageable pageable);
}
