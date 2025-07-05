package com.sil.jajm.domain.sample.controller;

import com.sil.jajm.domain.sample.service.SampleService;
import com.sil.jajm.domain.user.dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @Operation(summary = "샘플목록", description = "샘플목록")
    @GetMapping
    public ResponseEntity<Page<UserDto.Response>> sampleList(@ParameterObject @ModelAttribute UserDto.Search search) {
        Page<UserDto.Response> users = sampleService.findUserAll(search);
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

}
