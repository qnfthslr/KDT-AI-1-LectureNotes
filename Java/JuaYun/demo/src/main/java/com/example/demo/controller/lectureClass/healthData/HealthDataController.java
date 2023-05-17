package com.example.demo.controller.lectureClass.healthData;

import com.example.demo.controller.lectureClass.utility.CustomRandom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/d3-test")
public class HealthDataController {
    private final int ONE_WEEK = 7;
    private final List<HealthDataResponse> healthDataList = new ArrayList<>();

    @GetMapping("/get-health-info")
    public List<HealthDataResponse> getD3HealthInfo () {
        allocHealthData();

        return healthDataList;
    }

    private void allocHealthData() {
        healthDataList.clear();

        for (int i = 0; i < ONE_WEEK; i++) {
            healthDataList.add(
                    new HealthDataResponse(
                            CustomRandom.generateNumber(0, 100)
                    )
            );
        }
    }
}
