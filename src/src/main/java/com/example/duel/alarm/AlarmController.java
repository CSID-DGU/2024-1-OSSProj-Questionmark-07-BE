package com.example.duel.alarm;

import com.example.duel._core.security.CustomUserDetails;
import com.example.duel._core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AlarmController {

    private final AlarmService alarmService;

    // 알림 조회하기
    @GetMapping("/alarms")
    public ResponseEntity<?> findAll(@AuthenticationPrincipal CustomUserDetails userDetails) {
        AlarmResponse.FindAllDTO responseDTO = alarmService.findAll(userDetails.getUser());

        return ResponseEntity.ok().body(ApiUtils.success(HttpStatus.OK, responseDTO));
    }

    // 알림 읽기
    @PatchMapping("/alarms/read")
    public ResponseEntity<?> readAlarm(@RequestBody @Valid AlarmRequest.ReadAlarmDTO requestDTO, @AuthenticationPrincipal CustomUserDetails userDetails) {
        alarmService.readAlarm(requestDTO);

        return ResponseEntity.ok().body(ApiUtils.success(HttpStatus.OK, null));
    }
}
