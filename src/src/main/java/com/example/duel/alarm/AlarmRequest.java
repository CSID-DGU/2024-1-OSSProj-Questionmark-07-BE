package com.example.duel .alarm;

import java.util.List;

public class AlarmRequest {

    public record ReadAlarmDTO(
            List<AlarmDTO> alarms
    ) {
        public record AlarmDTO(
                Long id
        ) { }
    }
}
