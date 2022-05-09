package com.example.mailnotification.service.message;

import com.example.mailnotification.model.PaymentModel;

public interface ConsumeService {
    void consumeMessage(PaymentModel message);
}
