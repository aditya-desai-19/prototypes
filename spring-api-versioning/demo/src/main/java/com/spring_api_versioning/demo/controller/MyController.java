package com.spring_api_versioning.demo.controller;

import com.spring_api_versioning.demo.dto.PaymentV1;
import com.spring_api_versioning.demo.dto.PaymentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class MyController {
    /*
        Traditional way of implementing api versioning
     */
    @Deprecated(since = "1.0", forRemoval = true)
    @GetMapping("/v1")
    public PaymentV1 getPaymentV1() {
        return new PaymentV1(100, 3);
    }

    @GetMapping("/v2")
    public PaymentV2 getPaymentV2() {
        return new PaymentV2(100, 3, "UPI");
    }

    // Path based
//    @GetMapping(value = "/{version}", version = "1")
//    public PaymentV1 getPaymentV1() {
//        return new PaymentV1(100, 3);
//    }
//
//    @GetMapping(value = "/{version}", version = "2")
//    public PaymentV2 getPaymentV2() {
//        return new PaymentV2(100, 3, "UPI");
//    }

    // Header based
//    @GetMapping(version = "1")
//    public PaymentV1 getPaymentV1() {
//        return new PaymentV1(100, 3);
//    }
//
//    @GetMapping(version = "2")
//    public PaymentV2 getPaymentV2() {
//        return new PaymentV2(100, 3, "UPI");
//    }

    // Query based
//    @GetMapping(params = "version=1")
//    public PaymentV1 getPaymentV1() {
//        return new PaymentV1(100, 3);
//    }
//
//    @GetMapping(params = "version=2")
//    public PaymentV2 getPaymentV2() {
//        return new PaymentV2(100, 3, "UPI");
//    }
}
