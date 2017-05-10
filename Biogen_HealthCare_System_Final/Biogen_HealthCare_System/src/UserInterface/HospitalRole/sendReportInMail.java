///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package UserInterface.HospitalRole;
//
//import Business.Organization.Organization;
//import Drug.MarketDrug;
//import java.util.Properties;
//import javax.mail.Authenticator;
//import javax.mail.PasswordAuthentication;
//import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.mail.MessagingException;
///**
// *
// * @author ayonk
// */
//public class sendReportInMail {
//    
//    public static void sendMail(MarketDrug md){
//    
//        String to = "ayonkar2014@gmail.com";
//        String from = "ayonkar.ak@gmail.com";
//        String password = "@Aayankar9.,";
//        // Assuming you are sending email from localhost
//        String host = "smtp.gmail.com";
//        String smtpPort = "587";
//        //String smtpPort = "465";
//        Properties properties = System.getProperties();
//        // Setup mail server
//        properties.setProperty("mail.smtp.host", host);
//        properties.setProperty("mail.smtp.port", smtpPort);
//        //properties.setProperty("mail.smtp.socketFactory.port", smtpPort);  
////        properties.setProperty("mail.smtp.socketFactory.class",  
////            "javax.net.ssl.SSLSocketFactory");  
//        properties.setProperty("mail.smtp.auth", "true");
//        properties.setProperty("mail.smtp.starttls.enable", "true"); 
//        // Authentication 
//        Session session = Session.getDefaultInstance(properties,
//        new javax.mail.Authenticator() {
//            //override the getPasswordAuthentication method
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(from, password);
//            }
//        });
//        
//        try{
//        
//        MimeMessage message = new MimeMessage(session);
//        message.setFrom(new InternetAddress(from));
//        message.addHeader("Content-type", "text/HTML; charset=UTF-8");
//        message.addHeader("format", "flowed");
//        message.addHeader("Content-Transfer-Encoding", "8bit");
//        message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
//        message.setSubject("CASE: CRITICAL CASE OPENED AGAINST THE MEDICATION : " + md.getDrugName());        
//        StringBuilder htmlBuilder = new StringBuilder();
//        htmlBuilder.append("WARNING MESSAGE");
//        htmlBuilder.append("\n");
//        htmlBuilder.append("CASE ID: " + md.getDrugID());
//        htmlBuilder.append("\n");
//        htmlBuilder.append("EFFECTED PESRON NAME: " + md.getDrugStatus());
//        htmlBuilder.append("\n");
//        htmlBuilder.append("PESRON ADDRESS: " + md.getExipryDate());
//        htmlBuilder.append("\n");
//        htmlBuilder.append("CASE DESCRIPTION: " + md.getQuantity());
//        htmlBuilder.append("\n");
//        String html = htmlBuilder.toString();
//        message.setText(html);
//        Transport.send(message);        
//        System.out.println("Sent message successfully....");
//        
//        }catch(MessagingException e){
//            
//            throw new RuntimeException(e);
//        }
//    }
//}
