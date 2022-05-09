package com.example.mailnotification.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentModel {
        private String paymentId;
        private String clientId;
        private String paymentProductName;
        private double paymentAmount;
        private paymentTypeEnum paymentType;
        private String dateOfPayment;
}
