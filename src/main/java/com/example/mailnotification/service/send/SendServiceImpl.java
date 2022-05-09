package com.example.mailnotification.service.send;

import com.example.mailnotification.model.PaymentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl implements SendService{

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void send(PaymentModel message) {
        SimpleMailMessage message1 = new SimpleMailMessage();
        message1.setFrom("omarniyazbek@gmail.com");
        message1.setTo("omarniyazbek@gmail.com");
        message1.setSubject("Оплата квитанции " + message.getPaymentId());
        message1.setText("Благодарим вас, " + message.getClientId() + ", за оплату коммунальных услуг с помощью нашего сервиса. \n" +
                "        Оплачены услуги: " + message.getPaymentProductName() + " - " + message.getPaymentAmount());

        mailSender.send(message1);
        System.out.println(message);
    }
}
