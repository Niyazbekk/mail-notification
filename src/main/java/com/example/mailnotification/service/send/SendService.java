package com.example.mailnotification.service.send;

import com.example.mailnotification.model.PaymentModel;

public interface SendService {
    void send(PaymentModel message);
}
